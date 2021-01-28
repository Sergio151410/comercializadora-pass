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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.comer.citri.model.AltaProductosBean;
import com.comer.citri.model.BajaProductosBean;
import com.comer.citri.model.CatalogoProductosBean;
import com.comer.citri.model.ModificacionProductosBean;
import com.comer.citri.utils.MensajeErrorUtils;

import io.swagger.annotations.Api;

/**
 * Descripcion: 
 *
 * @author sergi
 *
 */
@Api
@Controller
@RequestMapping(path = "/comer/catalogos")
public class CatalogoProductosController {

	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogoProductosController.class);
	
//	/**
//	 * 
//	 * Nombre: productoCat
//	 * Tipo: ICrudCatalogoProductoService
//	 * Descripcion: Declaracion de variable productoCat del tipo ICrudCatalogoProductoService
//	 */
//	@Autowired
//	private ICrudCatalogoProductoService productoCat;

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return Devuelve la propiedad del tipo ResponseEntity<ResponseOperacionBean>
	 */
	@RequestMapping(path = "altas_catalogos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> altaCatalogosProducto(@RequestBody AltaProductosBean alta){
		LOGGER.info("altaCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		//			Map<String, Object> resultado = productoCat.altaProductos(alta);
					Map<String, Object> resultado = null;
					response.setResult(resultado);
					response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
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
	public ResponseEntity<ResponseOperacionBean> bajasCatalogosProducto(@RequestBody BajaProductosBean baja) throws BusinessException{
		LOGGER.info("bajasCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		Map<String, Object> resultado = null;
		response.setResult(resultado);
		response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
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
	public ResponseEntity<ResponseOperacionBean> modifiacionCatalogosProducto(@RequestBody ModificacionProductosBean mod) throws BusinessException{
		LOGGER.info("modifiacionCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		HttpStatus status = HttpStatus.OK;
		Map<String, Object> resultado = null;
		response.setResult(resultado);
		response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
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
	@RequestMapping(path = "consulta_catalogos", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseOperacionBean> consultaCatalogosProducto() throws BusinessException{
		LOGGER.info("consultaCatalogosProducto-------------------------------------BEGIN");
		ResponseOperacionBean response = new ResponseOperacionBean();
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		HttpStatus status = HttpStatus.OK;
		List<CatalogoProductosBean> listado = null;
		jsonMap.put("resultado", listado);
		response.setResult(jsonMap);
		response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
		LOGGER.info("consultaCatalogosProducto-------------------------------------FINISH");
		return new ResponseEntity<ResponseOperacionBean>(response,status);
	}

}