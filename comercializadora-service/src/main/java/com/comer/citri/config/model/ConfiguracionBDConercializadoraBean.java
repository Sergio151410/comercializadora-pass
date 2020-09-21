/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ConfiguracionBDConercializadoraBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:55:35	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ConfiguracionBDConercializadoraBean.java
 */
package com.comer.citri.config.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "")
@Validated
public class ConfiguracionBDConercializadoraBean implements Serializable {

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = 145377847212743866L;
	
	/**
	 * Nombre: procesosDriverClassName
	 * Tipo: String
	 * Descripcion: Declaracion de variable procesosDriverClassName del tipo String. Define el driver de la Base de Datos de Procesos
	 */
	@NotNull
	@NotBlank
	private String procesosDriverClassName;
	
	/**
	 * Nombre: procesosUrl
	 * Tipo: String
	 * Descripcion: Declaracion de variable procesosUrl del tipo String. Define la URL de la Base de datos de Procesos
	 */
	@NotNull
	@NotBlank
	private String procesosUrl;
	
	/**
	 * Nombre: procesosUsername
	 * Tipo: String
	 * Descripcion: Declaracion de variable procesosUsername del tipo String. Define el usuario de conexion de la Base de Datos de Procesos
	 */
	@NotNull
	@NotBlank
	private String procesosUsername;
	
	/**
	 * Nombre: procesosPassword
	 * Tipo: String
	 * Descripcion: Declaracion de variable procesosPassword del tipo String. Define el password de la Base de Datos de Procesos
	 */
	@NotNull
	@NotBlank
	private String procesosPassword;

	/**
	 * Descripcion: Metodo que devuelve la propiedad procesosDriverClassName del tipo String
	 * procesosDriverClassName
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @return regresa la propiedad procesosDriverClassName
	 */
	public String getProcesosDriverClassName() {
		return procesosDriverClassName;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad procesosDriverClassName del tipo String
	 * procesosDriverClassName
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @param procesosDriverClassName para ser establecida
	 */
	
	public void setProcesosDriverClassName(String procesosDriverClassName) {
		this.procesosDriverClassName = procesosDriverClassName;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad procesosUrl del tipo String
	 * procesosUrl
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @return regresa la propiedad procesosUrl
	 */
	public String getProcesosUrl() {
		return procesosUrl;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad procesosUrl del tipo String
	 * procesosUrl
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @param procesosUrl para ser establecida
	 */
	
	public void setProcesosUrl(String procesosUrl) {
		this.procesosUrl = procesosUrl;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad procesosUsername del tipo String
	 * procesosUsername
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @return regresa la propiedad procesosUsername
	 */
	public String getProcesosUsername() {
		return procesosUsername;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad procesosUsername del tipo String
	 * procesosUsername
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @param procesosUsername para ser establecida
	 */
	
	public void setProcesosUsername(String procesosUsername) {
		this.procesosUsername = procesosUsername;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad procesosPassword del tipo String
	 * procesosPassword
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @return regresa la propiedad procesosPassword
	 */
	public String getProcesosPassword() {
		return procesosPassword;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad procesosPassword del tipo String
	 * procesosPassword
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:12/09/2019
	 * @param procesosPassword para ser establecida
	 */
	
	public void setProcesosPassword(String procesosPassword) {
		this.procesosPassword = procesosPassword;
	}


}
