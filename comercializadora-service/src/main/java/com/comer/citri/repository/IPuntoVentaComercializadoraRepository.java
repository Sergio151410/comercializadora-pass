/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * IPuntoVentaComercializadoraRepository.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:49:14	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de IPuntoVentaComercializadoraRepository.java
 */
package com.comer.citri.repository;

import java.util.Map;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.exception.DataAccessException;
import com.comer.citri.model.PuntoVentaComercializadoraBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public interface IPuntoVentaComercializadoraRepository {
	
	/**
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> puntoVenta(PuntoVentaComercializadoraBean venta) throws DataAccessException;

}
