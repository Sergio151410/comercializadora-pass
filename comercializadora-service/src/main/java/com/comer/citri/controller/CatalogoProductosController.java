/**
 * Comercializadora Citricos G&M
 * Todos los derechos reservados
 * CatalogoProductosController.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 11:47:47	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de CatalogoProductosController.java
 */
package com.comer.citri.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comer.citri.global.model.ResponseOperacionBean;

/**
 * Descripcion: 
 *
 * @author sergi
 *
 */
@RestController
@RequestMapping(path = "/comer/catalogos")
public class CatalogoProductosController {
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogoProductosController.class);
	
	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "altas_catalogos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> altaCatalogosProducto(){
		LOGGER.info("altaCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		LOGGER.info("altaCatalogosProducto-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}
	
	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "bajas_catalogos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> bajasCatalogosProducto(){
		LOGGER.info("bajasCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		LOGGER.info("bajasCatalogosProducto-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}
	
	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "modificacion_catalogos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> modifiacionCatalogosProducto(){
		LOGGER.info("modifiacionCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		LOGGER.info("modifiacionCatalogosProducto-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "consulta_catalogos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> consultaCatalogosProducto(){
		LOGGER.info("consultaCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		LOGGER.info("consultaCatalogosProducto-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}

}
