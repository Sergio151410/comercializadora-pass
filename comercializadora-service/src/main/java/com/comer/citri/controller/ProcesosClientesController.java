/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ProcesosClientesController.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 13:51:54	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ProcesosClientesController.java
 */
package com.comer.citri.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.comer.citri.constants.APPConstants;
import com.comer.citri.exception.BusinessException;
import com.comer.citri.global.model.ResponseOperacionBean;
import com.comer.citri.model.AltaClientesBean;
import com.comer.citri.model.BajaClientesBean;
import com.comer.citri.model.ClientesComercializadoraBean;
import com.comer.citri.model.ModificacionClienteBean;

import io.swagger.annotations.Api;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Api
@Controller
@RequestMapping(path = "/comer/clientes")
public class ProcesosClientesController {
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProcesosClientesController.class);
	
	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "altas_clientes", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> altaClientes(@RequestBody AltaClientesBean alta) throws BusinessException{
		LOGGER.info("altaClientes-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		Map<String, Object> resultado = null;
		response.setResult(resultado);
		response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
		LOGGER.info("altaClientes-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}
	
	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "bajas_clientes", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> bajasClientes(@RequestBody BajaClientesBean baja) throws BusinessException{
		LOGGER.info("bajasClientes-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		Map<String, Object> resultado = null;
		response.setResult(resultado);
		response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
		LOGGER.info("bajasClientes-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "modificacion_clientes", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> modifiacionClientes(@RequestBody ModificacionClienteBean mod) throws BusinessException{
		LOGGER.info("modifiacionClientes-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		Map<String, Object> resultado = null;
		response.setResult(resultado);
		response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
		LOGGER.info("modifiacionClientes-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "consulta_clientes", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> consultaClientes() throws BusinessException{
		LOGGER.info("consultaClientes-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		HttpStatus status = HttpStatus.OK;
		List<ClientesComercializadoraBean> listado = null;
		jsonMap.put("resultado", listado);
		response.setResult(jsonMap);
		response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
		LOGGER.info("consultaClientes-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}


}
