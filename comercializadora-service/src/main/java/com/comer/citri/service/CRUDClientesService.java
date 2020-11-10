/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * CRUDClientesService.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 14:17:43	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de CRUDClientesService.java
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
import com.comer.citri.model.AltaClientesBean;
import com.comer.citri.model.BajaClientesBean;
import com.comer.citri.model.ClientesComercializadoraBean;
import com.comer.citri.model.ModificacionClienteBean;
import com.comer.citri.repository.ICRUDClientesRepository;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Service
public class CRUDClientesService implements ICRUDClientesService {
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CrudCatalogosProductosService.class);
	
	/**
	 * 
	 * Nombre: repoClientes
	 * Tipo: ICRUDClientesRepository
	 * Descripcion: Declaracion de variable repoClientes del tipo ICRUDClientesRepository
	 */
	@Autowired
	private ICRUDClientesRepository repoClientes;

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param alta
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> altaClientes(AltaClientesBean alta) throws BusinessException {
		LOGGER.info("altaClientes---------------------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			response = repoClientes.altaClientes(alta);
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("altaClientes---------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param baja
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> bajaClientes(BajaClientesBean baja) throws BusinessException {
		LOGGER.info("bajaClientes---------------------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			response = repoClientes.bajaClientes(baja);
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("bajaClientes---------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param mod
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> modifiacionClientes(ModificacionClienteBean mod) throws BusinessException {
		LOGGER.info("modifiacionClientes---------------------------------------------------------BEGIN");
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			response = repoClientes.modifiacionClientes(mod);
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("modifiacionClientes---------------------------------------------------------FINISH");
		return response;
	}

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo List<CatalogoProductosBean>
	 */
	@Override
	public List<ClientesComercializadoraBean> consultaClientes() throws BusinessException {
		LOGGER.info("consultaClientes---------------------------------------------------------BEGIN");
		List<ClientesComercializadoraBean> listaClientes = new ArrayList<ClientesComercializadoraBean>();
		try {
			listaClientes = repoClientes.consultaClientes();
		} catch (DataAccessException e) {
			throw new BusinessException(e, e.getError());
		}
		LOGGER.info("consultaClientes---------------------------------------------------------FINISH");
		return listaClientes;
	}

}
