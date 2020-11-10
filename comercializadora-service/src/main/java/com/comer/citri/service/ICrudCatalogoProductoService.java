/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ICrudCatalogoProductoService.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 18:49:22	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ICrudCatalogoProductoService.java
 */
package com.comer.citri.service;

import java.util.List;
import java.util.Map;

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
public interface ICrudCatalogoProductoService {
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> altaProductos(AltaProductosBean alta) throws BusinessException;
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param baja
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> bajaProductos(BajaProductosBean baja) throws BusinessException;
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @param mod
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> modifiacionProductos(ModificacionProductosBean mod) throws BusinessException;
	
	/**
	 * 
	 * Descripcion :Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	List<CatalogoProductosBean> consultaProducto() throws BusinessException;

}
