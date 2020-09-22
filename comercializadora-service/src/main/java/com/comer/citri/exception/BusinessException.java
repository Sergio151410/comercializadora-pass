/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * BusinessException.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:50:35	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de BusinessException.java
 */
package com.comer.citri.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comer.citri.global.model.ErroresBean;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class BusinessException extends Exception {
	
	/**
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long. Identificador para evitar errores en la Deserializacion de objetos de esta clase
	 */
	private static final long serialVersionUID = -2863124159885430198L;
	
	/**
	 * Nombre: LOGGER
	 * Tipo: Logger
	 * Descripcion: Declaracion de variable LOGGER del tipo Logger. Para el loggeo de la aplicacion en la clase BusinessException
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(BusinessException.class);
	/**
	 * Nombre: error
	 * Tipo: ErroresBean
	 * Descripcion: Declaracion de variable error del tipo ErroresBean. Define las propiedades del error
	 */
	private final ErroresBean error;

	/**
	 * Descripcion: Constructor para crear objetos del tipo BusinessException.java
	 * Creado por    : 1460477
	 * Fecha Creacion: 22/01/2019
	 * @param excepcionOriginal la Excepcion original por la que surge la excepcion de negocio
	 * @param error objeto que contiene la representacion del error que se envia como respuesta.
	 */
	public BusinessException(Exception excepcionOriginal, ErroresBean error) {
		super(error.getCode(), excepcionOriginal);
		this.error = error;
		LOGGER.error("Procesando error: {}",excepcionOriginal);
	}

	/**
	 * Descripcion: Constructor para crear objetos del tipo BusinessException.java
	 * Creado por    : 1460477
	 * Fecha Creacion: 22/01/2019
	 * @param error representacion del error que se envia como respuesta, cuando no hubo una excepcion origen, util cuando
	 *              no se cumplen validaciones de negocio.
	 */
	public BusinessException(ErroresBean error) {
		super(error.getCode());
		this.error = error;
		LOGGER.error("Procesando error");
	}

	/**
	 * Descripcion   : Constructor de clase
	 * Creado por    : [470584: Ricardo Martinez] - [Ricardo Martinez Hernandez]
	 * Fecha Creacion: 18/10/2019
	 * @param errorCode Codigo del error
	 * @param errorMessage Mensaje del error
	 */
	public BusinessException(String errorCode, String errorMessage) { 
		super(errorCode);
		this.error = new ErroresBean(errorCode, errorMessage);
	}
	/**
	 * Descripcion: Metodo que devuelve la propiedad error del tipo ErroresBean
	 * error
	 * ErroresBean
	 * Creado por    : 1460477
	 * Fecha Creacion:22/01/2019
	 * @return regresa la propiedad error
	 */
	public ErroresBean getError() {
		return error;
	}


}
