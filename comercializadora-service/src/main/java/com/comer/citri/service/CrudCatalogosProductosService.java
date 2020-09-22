/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * CrudCatalogosProductosService.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 19:00:37	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de CrudCatalogosProductosService.java
 */
package com.comer.citri.service;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.model.AltaProductosBean;
import com.comer.citri.model.BajaProductosBean;
import com.comer.citri.model.CatalogoProductosBean;
import com.comer.citri.model.ModificacionProductosBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Service
public class CrudCatalogosProductosService implements ICrudCatalogoProductoService {
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CrudCatalogosProductosService.class);


	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param alta
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	@Override
	public HashMap<String, Object> altaProductos(AltaProductosBean alta) throws BusinessException {
		LOGGER.info("altaProductos-------------------------------------------BEGIN");
		LOGGER.info("altaProductos-------------------------------------------FINISH");
		return null;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param baja
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	@Override
	public HashMap<String, Object> bajaProductos(BajaProductosBean baja) throws BusinessException {
		LOGGER.info("bajaProductos-------------------------------------------BEGIN");
		LOGGER.info("bajaProductos-------------------------------------------FINISH");
		return null;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param mod
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	@Override
	public HashMap<String, Object> modifiacionProductos(ModificacionProductosBean mod) throws BusinessException {
		LOGGER.info("modifiacionProductos-------------------------------------------BEGIN");
		LOGGER.info("modifiacionProductos-------------------------------------------FINISH");
		return null;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param consulta
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	@Override
	public HashMap<String, Object> consultaProducto(CatalogoProductosBean consulta) throws BusinessException {
		LOGGER.info("consultaProducto-------------------------------------------BEGIN");
		LOGGER.info("consultaProducto-------------------------------------------FINISH");
		return null;
	}

}
