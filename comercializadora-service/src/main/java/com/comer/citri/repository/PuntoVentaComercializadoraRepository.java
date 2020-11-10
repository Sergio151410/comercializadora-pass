/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * PuntoVentaComercializadoraRepository.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:49:28	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de PuntoVentaComercializadoraRepository.java
 */
package com.comer.citri.repository;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.comer.citri.exception.DataAccessException;
import com.comer.citri.model.PuntoVentaComercializadoraBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Repository
public class PuntoVentaComercializadoraRepository implements IPuntoVentaComercializadoraRepository {

	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(PuntoVentaComercializadoraRepository.class);
	
	
	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param venta
	 * @return
	 * @throws DataAccessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> puntoVenta(PuntoVentaComercializadoraBean venta) throws DataAccessException {
		LOGGER.info("puntoVenta--------------------------------------------------------------------BEGIN");
		LOGGER.info("puntoVenta--------------------------------------------------------------------FINISH");
		return null;
	}

}
