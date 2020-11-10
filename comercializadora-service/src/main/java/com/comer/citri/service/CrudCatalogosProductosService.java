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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.exception.DataAccessException;
import com.comer.citri.model.AltaProductosBean;
import com.comer.citri.model.BajaProductosBean;
import com.comer.citri.model.CatalogoProductosBean;
import com.comer.citri.model.ModificacionProductosBean;
import com.comer.citri.repository.ICRUDRespository;

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
	 * Nombre: repoProductos
	 * Tipo: ICRUDRespository
	 * Descripcion: Declaracion de variable repoProductos del tipo ICRUDRespository
	 */
	@Autowired
	private ICRUDRespository repoProductos;


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
	public Map<String, Object> altaProductos(AltaProductosBean alta) throws BusinessException {
		LOGGER.info("altaProductos-------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			response = repoProductos.altaProductos(alta);
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("altaProductos-------------------------------------------FINISH");
		return response;
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
	public Map<String, Object> bajaProductos(BajaProductosBean baja) throws BusinessException {
		LOGGER.info("bajaProductos-------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			response = repoProductos.bajaProductos(baja);
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("bajaProductos-------------------------------------------FINISH");
		return response;
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
	public Map<String, Object> modifiacionProductos(ModificacionProductosBean mod) throws BusinessException {
		LOGGER.info("modifiacionProductos-------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			response = repoProductos.modifiacionProductos(mod);
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("modifiacionProductos-------------------------------------------FINISH");
		return response;
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
	public List<CatalogoProductosBean> consultaProducto() throws BusinessException {
		LOGGER.info("consultaProducto-------------------------------------------BEGIN");
		List<CatalogoProductosBean> response = new ArrayList<CatalogoProductosBean>();
		try {
			response = repoProductos.consultaProducto();
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("consultaProducto-------------------------------------------FINISH");
		return response;
	}

}
