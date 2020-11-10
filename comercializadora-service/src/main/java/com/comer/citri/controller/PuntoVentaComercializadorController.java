/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * PuntoVentaComercializadorController.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:20:50	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de PuntoVentaComercializadorController.java
 */
package com.comer.citri.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comer.citri.constants.APPConstants;
import com.comer.citri.exception.BusinessException;
import com.comer.citri.global.model.ResponseOperacionBean;
import com.comer.citri.model.PuntoVentaComercializadoraBean;
import com.comer.citri.service.IPuntoDeVentaComercializadoraService;
import com.comer.citri.utils.MensajeErrorUtils;

import io.swagger.annotations.Api;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Api
@RestController
@RequestMapping(path = "/comer/ventas")
public class PuntoVentaComercializadorController {
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(PuntoVentaComercializadorController.class);
	
	/**
	 * 
	 * Nombre: ventaService
	 * Tipo: IPuntoDeVentaComercializadoraService
	 * Descripcion: Declaracion de variable ventaService del tipo IPuntoDeVentaComercializadoraService
	 */
	@Autowired
	private IPuntoDeVentaComercializadoraService ventaService;
	
	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "puntos_ventas", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> altaClientes(@RequestBody PuntoVentaComercializadoraBean venta){
		LOGGER.info("altaClientes-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		try {
			Map<String, Object> resultado = ventaService.puntoDeVenta(venta);
			response.setResult(resultado);
			response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
		} catch (BusinessException e) {
			return MensajeErrorUtils.generarErrorException(e);	
		}
		LOGGER.info("altaClientes-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}

}
