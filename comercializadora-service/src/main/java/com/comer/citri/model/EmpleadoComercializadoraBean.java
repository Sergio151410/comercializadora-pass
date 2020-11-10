/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * EmpleadoComercializadoraBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:35:47	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de EmpleadoComercializadoraBean.java
 */
package com.comer.citri.model;

import java.io.Serializable;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class EmpleadoComercializadoraBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = -8589496809406950354L;
	
	/**
	 * 
	 * Nombre: idEmpleado
	 * Tipo: String
	 * Descripcion: Declaracion de variable idEmpleado del tipo String
	 */
	private String idEmpleado;
	
	/**
	 * 
	 * Nombre: nombre
	 * Tipo: String
	 * Descripcion: Declaracion de variable nombre del tipo String
	 */
	private String nombre;
	
	/**
	 * 
	 * Nombre: apePaterno
	 * Tipo: String
	 * Descripcion: Declaracion de variable apePaterno del tipo String
	 */
	private String apePaterno;
	
	/**
	 * 
	 * Nombre: apeMaterno
	 * Tipo: String
	 * Descripcion: Declaracion de variable apeMaterno del tipo String
	 */
	private String apeMaterno;

	/**
	 * Descripcion: Metodo que devuelve la propiedad idEmpleado del tipo String
	 * idEmpleado
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad idEmpleado
	 */
	public String getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad idEmpleado del tipo String
	 * idEmpleado
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param idEmpleado para ser establecida
	 */
	
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad nombre del tipo String
	 * nombre
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad nombre del tipo String
	 * nombre
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param nombre para ser establecida
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad apePaterno del tipo String
	 * apePaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad apePaterno
	 */
	public String getApePaterno() {
		return apePaterno;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad apePaterno del tipo String
	 * apePaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param apePaterno para ser establecida
	 */
	
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad apeMaterno del tipo String
	 * apeMaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad apeMaterno
	 */
	public String getApeMaterno() {
		return apeMaterno;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad apeMaterno del tipo String
	 * apeMaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param apeMaterno para ser establecida
	 */
	
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

}
