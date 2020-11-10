/**
 * Banco Santander (Mexico) S.A., Institucion de Banca Multiple, Grupo Financiero Santander Mexico
 * Todos los derechos reservados
 * MensajeErrorUtils.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      13/09/2019 11:59:29	    [1697401:Sergio Jair Flores Luna]     TCS		    Creacion de MensajeErrorUtils.java
 */
package com.comer.citri.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;

import com.comer.citri.constants.APPConstants;
import com.comer.citri.constants.ErrorContanst;
import com.comer.citri.exception.BusinessException;
import com.comer.citri.global.model.ErroresBean;
import com.comer.citri.global.model.ResponseOperacionBean;


/**
 * Descripcion: Clase de utileria para los metodos utilizados por el controller.
 *
 * @author 1697401
 *
 */
public final class MensajeErrorUtils {
	
	/**
	 * 
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER del tipo Logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(MensajeErrorUtils.class);
	
	/**
	 * Descripcion: Constructor para crear objetos del tipo MensajeErrorUtils.java
	 * Creado por    : 1697401
	 * Fecha Creacion: 13/09/2019
	 */
	private MensajeErrorUtils() {}
	
	/**
	 * 
	 * Descripcion : Metodo para generar la respuesta con el mensaje de error al existir una excepcion
	 * @author 1697401
	 * @since  13/09/2019
	 * @param e objeto que contiene las propiedades del BusinessException.
	 * @return Devuelve la propiedad del tipo ResponseOperacionBean, el cual contendra el response del mensaje de error.
	 */
	public static ResponseEntity<ResponseOperacionBean> generarErrorException(BusinessException e) {
		LOGGER.info("generrarErrorExcepcion................................BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		/** Se manda el error de BussinesException a la respuesta en un nuevo ResponseCode y el 
		 * estatus se define como FAIL.*/
		e.getError().setServerStatusCode(ErrorContanst.BAD_REQUEST_CODE);
		response.setStatus(APPConstants.ERROR);
		LOGGER.error("Error ", e);
		response.addError(e.getError());
		response.setResult(APPConstants.VACIO);
		LOGGER.info("generarErrorException------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response, HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * Descripcion : Metodo que mapea los datos necesarios de la excepcion de tipo HttpServerErrorException
	 * @author 1758379
	 * @since  22/10/2019
	 * @param e excepcion generada al enviar información hacia appian
	 * @return Devuelve la propiedad de tipo ErroresBean, el cual contendra el objeto con los valores del error.
	 */
	public static ErroresBean mappingError(HttpServerErrorException e) {
		ErroresBean errores = new ErroresBean();
		errores.setCode(String.valueOf(e.getRawStatusCode()));
		errores.setMessage(e.getResponseBodyAsString());
		return errores;
	}
	
}
