/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ICRUDClientesRepository.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 14:23:30	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ICRUDClientesRepository.java
 */
package com.comer.citri.repository;

import java.util.List;
import java.util.Map;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.exception.DataAccessException;
import com.comer.citri.model.AltaClientesBean;
import com.comer.citri.model.BajaClientesBean;
import com.comer.citri.model.ClientesComercializadoraBean;
import com.comer.citri.model.ModificacionClienteBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public interface ICRUDClientesRepository {
	
	/**
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> altaClientes(AltaClientesBean alta) throws DataAccessException;
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param baja
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> bajaClientes(BajaClientesBean baja) throws DataAccessException;
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param mod
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> modifiacionClientes(ModificacionClienteBean mod) throws DataAccessException;
	
	/**
	 * 
	 * Descripcion :Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param consulta
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	List<ClientesComercializadoraBean> consultaClientes() throws DataAccessException;
}
