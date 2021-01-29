/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * EjecutaSPTemplate.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      28 ene. 2021 0:02:58	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de EjecutaSPTemplate.java
 */
package com.comer.citri.config;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class EjecutaSPTemplate extends StoredProcedure{
	
	/**
	 * Descripcion: Constructor para crear objetos del tipo EjecutaSPTemplate.java
	 * Creado por    : 1697401
	 * Fecha Creacion: 25/09/2019
	 * @param jdbcTemplate objeto que contiene las propiedades del JDBCTemplate.
	 * @param nombre Nombre del procedimiento almacenado
	 */
	public EjecutaSPTemplate(JdbcTemplate jdbcTemplate, String nombre) {
		super(jdbcTemplate, nombre);
		super.setFunction(false);
	}

}
