/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * DataAccessException.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:51:26	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de DataAccessException.java
 */
package com.comer.citri.exception;

import org.springframework.http.HttpStatus;

import com.comer.citri.global.model.ErroresBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class DataAccessException extends Exception {
	
	/**
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long. Identificador para evitar errores en la Deserializacion de objetos de esta clase.
	 */
	private static final long serialVersionUID = 1606288906813530766L;
	
	/**
	 * Nombre: error
	 * Tipo: ErroresBean
	 * Descripcion: Declaracion de variable error del tipo ErroresBean. Contiene los atributos del error
	 */
	private final ErroresBean error;
	
	/**
	 * Nombre: estatus
	 * Tipo: HttpStatus
	 * Descripcion: Declaracion de variable estatus del tipo HttpStatus. Corresponde al Codigo Http que sera enviado al front
	 */
	private final HttpStatus estatus;

	/**
	 * Descripcion: Constructor para crear objetos del tipo DataAccessException.java
	 * Creado por    : 1460477
	 * Fecha Creacion: 25/03/2019
	 * @param error el objeto que contiene la informacion del error lanzado
	 */
	public DataAccessException(ErroresBean error) {
		super(error.getCode());
		this.error = error;
		this.estatus = HttpStatus.INTERNAL_SERVER_ERROR;
	}

	/**
	 * Descripcion: Constructor para crear objetos del tipo DataAccessException.java
	 * Creado por    : 1460477
	 * Fecha Creacion: 25/03/2019
	 * @param error el objeto que contiene la informacion del error lanzado
	 * @param t Excepcion original
	 */
	public DataAccessException(ErroresBean error, Throwable t) {
		super(error.getCode(), t);
		this.error = error;
		this.estatus = HttpStatus.INTERNAL_SERVER_ERROR;
	}

	/**
	 * Descripcion: Constructor para crear objetos del tipo DataAccessException.java
	 * Creado por    : 1460477
	 * Fecha Creacion: 25/03/2019
	 * @param error el objeto que contiene la informacion del error lanzado
	 * @param estatus el estatus http con el que este error debe de ser informado
	 */
	public DataAccessException(ErroresBean error,HttpStatus estatus) {
		super(error.getCode());
		this.error = error;
		this.estatus = estatus;
	}
	/**
	 * Descripcion: Metodo que devuelve la propiedad error del tipo ErroresBean
	 * error
	 * ErroresBean
	 * Creado por    : 1460477
	 * Fecha Creacion:25/03/2019
	 * @return regresa la propiedad error
	 */
	public ErroresBean getError() {
		return error;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad estatus del tipo HttpStatus
	 * estatus
	 * HttpStatus
	 * Creado por    : 1460477
	 * Fecha Creacion:29/05/2019
	 * @return regresa la propiedad estatus
	 */
	public HttpStatus getEstatus() {
		return estatus;
	}

}
