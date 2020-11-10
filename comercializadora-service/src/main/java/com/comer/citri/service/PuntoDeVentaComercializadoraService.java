/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * PuntoDeVentaComercializadoraService.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:42:21	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de PuntoDeVentaComercializadoraService.java
 */
package com.comer.citri.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.model.PuntoVentaComercializadoraBean;
import com.comer.citri.repository.IPuntoVentaComercializadoraRepository;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Service
public class PuntoDeVentaComercializadoraService implements IPuntoDeVentaComercializadoraService {
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER para la clase. El cual es requerido para desplegar mensajes en consola.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(PuntoDeVentaComercializadoraService.class);
	
	/**
	 * 
	 * Nombre: repoVenta
	 * Tipo: IPuntoVentaComercializadoraRepository
	 * Descripcion: Declaracion de variable repoVenta del tipo IPuntoVentaComercializadoraRepository
	 */
	@Autowired
	private IPuntoVentaComercializadoraRepository repoVenta;

	/**
	 * 
	 * Descripcion :
	 * @author sergi
	 * @since  10 nov. 2020
	 * @param venta
	 * @return
	 * @throws BusinessException Devuelve la propiedad del tipo Map<String,Object>
	 */
	@Override
	public Map<String, Object> puntoDeVenta(PuntoVentaComercializadoraBean venta) throws BusinessException {
		LOGGER.info("puntoDeVenta-----------------------------------------------------------BEGIN");
		
		LOGGER.info("puntoDeVenta-----------------------------------------------------------FINISH");
		return null;
	}
	
	

}
