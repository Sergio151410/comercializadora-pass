/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ICRUDRespository.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      9 oct. 2020 12:03:55	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ICRUDRespository.java
 */
package com.comer.citri.repository;

import java.util.List;
import java.util.Map;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.exception.DataAccessException;
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
public interface ICRUDRespository {
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> altaProductos(AltaProductosBean alta) throws DataAccessException;
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param baja
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> bajaProductos(BajaProductosBean baja) throws DataAccessException;
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param mod
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> modifiacionProductos(ModificacionProductosBean mod) throws DataAccessException;
	
	/**
	 * 
	 * Descripcion :Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param consulta
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	List<CatalogoProductosBean> consultaProducto() throws DataAccessException;

}
