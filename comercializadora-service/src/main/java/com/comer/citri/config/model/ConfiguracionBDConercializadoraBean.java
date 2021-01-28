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
@ConfigurationProperties(prefix = "spring.datasource")
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
	 * Nombre: procesosUrl
	 * Tipo: String
	 * Descripcion: Declaracion de variable procesosUrl del tipo String. Define la URL de la Base de datos de Procesos
	 */
	private String url;
	
	/**
	 * Nombre: procesosUsername
	 * Tipo: String
	 * Descripcion: Declaracion de variable procesosUsername del tipo String. Define el usuario de conexion de la Base de Datos de Procesos
	 */
	private String username;
	
	/**
	 * Nombre: procesosPassword
	 * Tipo: String
	 * Descripcion: Declaracion de variable procesosPassword del tipo String. Define el password de la Base de Datos de Procesos
	 */
	private String password;

	/**
	 * Descripcion: Metodo que devuelve la propiedad url del tipo String
	 * url
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:28 ene. 2021
	 * @return regresa la propiedad url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad url del tipo String
	 * url
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:28 ene. 2021
	 * @param url para ser establecida
	 */
	
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad username del tipo String
	 * username
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:28 ene. 2021
	 * @return regresa la propiedad username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad username del tipo String
	 * username
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:28 ene. 2021
	 * @param username para ser establecida
	 */
	
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad password del tipo String
	 * password
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:28 ene. 2021
	 * @return regresa la propiedad password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad password del tipo String
	 * password
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:28 ene. 2021
	 * @param password para ser establecida
	 */
	
	public void setPassword(String password) {
		this.password = password;
	}

}
