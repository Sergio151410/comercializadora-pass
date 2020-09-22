/**
 * Comercializadora Citricos G&M
 * Todos los derechos reservados
 * ErroresBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 12:35:10	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ErroresBean.java
 */
package com.comer.citri.global.model;

import java.io.Serializable;

import com.comer.citri.constants.ErrorContanst;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ErroresBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = -849305714857317756L;
	
	/**
	 * Nombre: level
	 * Tipo: String
	 * Descripcion: Declaracion de variable level del tipo String. Define el Level del error
	 */
	protected String level;
	
	/**
	 * Nombre: code
	 * Tipo: String
	 * Descripcion: Declaracion de variable code del tipo String. Define el codigo de error
	 */
	protected String code;
	
	/**
	 * Nombre: message
	 * Tipo: String
	 * Descripcion: Declaracion de variable message del tipo String. Define un mensaje acorde al error
	 */
	protected String message;
	
	/**
	 * Nombre: description
	 * Tipo: String
	 * Descripcion: Declaracion de variable description del tipo String. Define una descripcion del error
	 */
	protected String description;
	
	/**
	 * Nombre: moreInfo
	 * Tipo: String
	 * Descripcion: Declaracion de variable moreInfo del tipo String. Define informacion adicional del error
	 */
	protected String moreInfo;
	
	/**
	 * Nombre: serverStatusCode
	 * Tipo: String
	 * Descripcion: Declaracion de variable serverStatusCode del tipo String. Define el codigo de estatus del servidor
	 */
	protected String serverStatusCode;
	
	
	/**
	 * Descripcion   : Constructor de clase
	 * Creado por    : [470584: Ricardo Martinez] - [Ricardo Martinez Hernandez]
	 * Fecha Creacion: 18/10/2019
	 */

	public ErroresBean() {
		this.code = ErrorContanst.CODIGO_ERROR_ERRGE01;
		this.message = ErrorContanst.CODIGO_MSG_ERRGE01;
	}
	
	/**
	 * Descripcion   : Constructor de clase
	 * Creado por    : [470584: Ricardo Martinez] - [Ricardo Martinez Hernandez]
	 * Fecha Creacion: 18/10/2019
	 * @param errorCode Codigo del error
	 * @param errorMessage Mensaje del error
	 */
	public ErroresBean(String errorCode, String errorMessage) {
		this.code = errorCode;
		this.message = errorMessage;
	}
	/**
	 * Descripcion: Metodo que devuelve la propiedad serverStatusCode del tipo String
	 * serverStatusCode
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:18/09/2019
	 * @return regresa la propiedad serverStatusCode
	 */
	public String getServerStatusCode() {
		return serverStatusCode;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad serverStatusCode del tipo String
	 * serverStatusCode
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:18/09/2019
	 * @param serverStatusCode para ser establecida
	 */
	
	public void setServerStatusCode(String serverStatusCode) {
		this.serverStatusCode = serverStatusCode;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad level del tipo String
	 * level
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad level del tipo String
	 * level
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param level para ser establecida
	 */
	
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad code del tipo String
	 * code
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad code del tipo String
	 * code
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param code para ser establecida
	 */
	
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad message del tipo String
	 * message
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad message del tipo String
	 * message
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param message para ser establecida
	 */
	
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad description del tipo String
	 * description
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad description del tipo String
	 * description
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param description para ser establecida
	 */
	
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad moreInfo del tipo String
	 * moreInfo
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad moreInfo
	 */
	public String getMoreInfo() {
		return moreInfo;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad moreInfo del tipo String
	 * moreInfo
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param moreInfo para ser establecida
	 */
	
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}


}
