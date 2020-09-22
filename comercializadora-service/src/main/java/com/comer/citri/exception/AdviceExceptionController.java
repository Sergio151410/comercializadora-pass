/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * AdviceExceptionController.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:44:26	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de AdviceExceptionController.java
 */
package com.comer.citri.exception;

import java.net.ConnectException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import com.comer.citri.constants.APPConstants;
import com.comer.citri.constants.ErrorContanst;
import com.comer.citri.constants.ValidationsAPPConstants;
import com.comer.citri.global.model.ErroresBean;
import com.comer.citri.global.model.ResponseOperacionBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@ControllerAdvice
public class AdviceExceptionController {
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER del tipo Logger. Util para el loggeo de la aplicacion
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(AdviceExceptionController.class);
	
	/**
	 * Nombre: messageSource
	 * Tipo: MessageSource
	 * Descripcion: Declaracion de variable messageSource del tipo MessageSource. Util para la recuperacion de mensajes de internacionalizacion
	 */
	@Autowired
	protected MessageSource messageSource;
	
	/**
	 * 
	 * Descripcion : Metodo para el manejo de la Excepcion MethodArgumentNotValidException, de errores de validacion de JSR.
	 * @author 1697401
	 * @since  11/09/2019
	 * @param ex campo que contiene las excepciones del negocio.
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean> que define la respuesta hacia el aplicativo
	 */
	@ExceptionHandler(value = {MethodArgumentNotValidException.class})
	public ResponseEntity<ResponseOperacionBean> validacionJSRPost(MethodArgumentNotValidException ex){
		BindingResult binding = ex.getBindingResult();
		return validacionJSR(binding);
	}
	
	/**
	 * Descripcion : Metodo para el manejo de excepciones arrojadas por errores de validacion JSR 303.
	 * @author 1697401
	 * @since  11/09/2019
	 * @param binding campo que contiene las propiedades del binding.
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean> con la respuesta segun los errores devueltos en la validacion JSR303
	 */
	@ExceptionHandler(value = {BindException.class})
	public ResponseEntity<ResponseOperacionBean> validacionJSR(BindingResult binding) {
		ResponseOperacionBean response = new ResponseOperacionBean();
		if (binding!=null && binding.hasErrors()){
			for(FieldError error : binding.getFieldErrors()) {
				/**Se manda el error de JSR a la respuesta en un nuevo ErroresBean y el
				 * status se define como FAIL*/
				ErroresBean errores = new ErroresBean();
				String codigoLocal = error.getDefaultMessage();
				Object[] nombreCampo = new Object[] {messageSource.getMessage("campos."+ error.getField(), null, null)};
				errores.setDescription(messageSource.getMessage(codigoLocal,nombreCampo,null));
				if(ValidationsAPPConstants.CODIGO_OBLIGATORIO.equals(codigoLocal)) {
					errores.setCode("PPLSE001");
				}else {
					errores.setCode("PPLSE002");
				}
				errores.setMessage(messageSource.getMessage(errores.getCode(),nombreCampo,null));
				errores.setLevel(APPConstants.ERROR);
				LOGGER.error("Error de validacion JSR303 {} {}",errores.getCode(),errores.getMessage());
				response.addError(errores);
			}
			
			response.setStatus(APPConstants.ERROR);
			response.setResult(APPConstants.VACIO);
		}
		return new ResponseEntity<ResponseOperacionBean>(response, HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * 
	 * Descripcion : Metodo para manejar los errores tipo Exception
	 *               Siendo Exception la clase padre se envuelven aquellas excepciones que pudieran ocurrir y que no esten cubiertas
	 * @author 1697401
	 * @since  17/09/2019
	 * @param e objeto que contiene las propiedades de las exceptiones.
	 * @return Devuelve la propiedad del tipo ResponseEntity<ErroresBean> con un error generico
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErroresBean> errorHandler(Exception e) {
		LOGGER.info("Cachando error no manejado Exception...");
		LOGGER.error("Error Exception", e);
		/** Se establecen las propiedades del error*/
		ErroresBean error = new ErroresBean();
		if (e instanceof MissingServletRequestPartException) {
			error.setCode("OPCA001");
			error.setDescription("No se cargo el archivo al servicio, volver a intentarlo.");
			error.setLevel(ErrorContanst.LEVEL_ERROR);
			error.setMessage("No hay archivo que procesar.");
			error.setServerStatusCode("500");
		}else {
			error.setCode(ErrorContanst.CODIGO_PDIGE01);
			error.setDescription(ErrorContanst.DESCRIPCION_PDIGE01);
			error.setLevel(ErrorContanst.LEVEL_ERROR);
			error.setServerStatusCode("500");
		}
		/** Se retorna la respuesta del error. Se define cualquier error no controlado como Internal Server Error*/
		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
			
	/**
	 * 
	 * Descripcion : Metodo para el manejo de errores de conexion a base de datos
	 * @author 1697401
	 * @since  17/09/2019
	 * @return Devuelve la propiedad del tipo ResponseEntity<ErroresBean> con los datos del error
	 */
	@ExceptionHandler({ConnectException.class, CannotCreateTransactionException.class})
	public ResponseEntity<ErroresBean> errorHandler() {
		LOGGER.info("Cachando error de conexion...");
		/** Se establecen las propiedades del error*/
		ErroresBean error = new ErroresBean();
		error.setCode(ErrorContanst.CODIGO_PDIBD01);
		error.setDescription(ErrorContanst.DESCRIPCION_PDIBD01);
		error.setLevel(ErrorContanst.LEVEL_ERROR);
		error.setServerStatusCode("500");
		/** Se retorna la respuesta del error. Se define cualquier error no controlado como Internal Server Error*/
		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * Descripcion : Metodo para el manejo de errores de conexion con microservicio
	 * @author 1758379
	 * @since  21/02/2020
	 * @param e excepcion generada en la solicitud hacia un servicio rest
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean> con los datos del error
	 */
	@ExceptionHandler(ResourceAccessException.class)
	public ResponseEntity<ResponseOperacionBean> errorHandler(ResourceAccessException e) {
		LOGGER.info("Cachando error no manejado ResourceAccessException...");
		LOGGER.error("Error ResourceAccessException", e);
		
		ResponseOperacionBean response = new ResponseOperacionBean();		
		ErroresBean error = new ErroresBean();
		error.setCode(ErrorContanst.CODIGO_MSDSE01);
		error.setDescription(e.getMessage());
		error.setMessage(ErrorContanst.DESCRIPCION_MSDSE01);
		error.setLevel(APPConstants.ERROR);
		error.setServerStatusCode("404");
		response.addError(error);
		response.setStatus(APPConstants.ERROR);
		response.setResult(APPConstants.VACIO);
		
		/** Se retorna la respuesta del error. Se define cualquier error no controlado como Internal Server Error*/
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	
	/**
	 * Descripcion : Metodo para el manejo de errores de conexion con el servicio de opentext
	 * @author 1758379
	 * @since  21/02/2020
	 * @param e excepcion generada en la solicitud de opentext
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean> con los datos del error
	 */
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ResponseOperacionBean> errorHandler(RuntimeException e) {
		LOGGER.info("Cachando error no manejado RuntimeException...");
		LOGGER.error("Error RuntimeException", e);
		
		ResponseOperacionBean response = new ResponseOperacionBean();		
		ErroresBean error = new ErroresBean();
		error.setCode(ErrorContanst.CODIGO_OPETXE01);
		error.setDescription(e.getMessage());
		error.setMessage(ErrorContanst.DESCRIPCION_OPETXE01);
		error.setLevel(APPConstants.ERROR);
		error.setServerStatusCode("500");
		response.addError(error);
		response.setStatus(APPConstants.ERROR);
		response.setResult(APPConstants.VACIO);
		
		/** Se retorna la respuesta del error. Se define cualquier error no controlado como Internal Server Error*/
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}

}
