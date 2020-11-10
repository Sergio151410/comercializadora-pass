/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * IPuntoDeVentaComercializadoraService.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:42:06	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de IPuntoDeVentaComercializadoraService.java
 */
package com.comer.citri.service;

import java.util.Map;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.model.PuntoVentaComercializadoraBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public interface IPuntoDeVentaComercializadoraService {
	
	/**
	 * 
	 * Descripcion : Metodo que se encarga de realizar la altas de los productos.
	 * @author sergi
	 * @since  21 sep. 2020
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo HashMap<String,Object>
	 */
	Map<String, Object> puntoDeVenta(PuntoVentaComercializadoraBean venta) throws BusinessException;

}
