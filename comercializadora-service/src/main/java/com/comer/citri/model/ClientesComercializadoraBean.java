/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ClientesComercializadoraBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 14:06:07	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ClientesComercializadoraBean.java
 */
package com.comer.citri.model;

import java.io.Serializable;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ClientesComercializadoraBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = 4507597389748843114L;
	
	/**
	 * 
	 * Nombre: idCliente
	 * Tipo: String
	 * Descripcion: Declaracion de variable idCliente del tipo String
	 */
	private String idCliente;
	
	/**
	 * 
	 * Nombre: nombre
	 * Tipo: String
	 * Descripcion: Declaracion de variable nombre del tipo String
	 */
	private String nombre;
	
	/**
	 * 
	 * Nombre: apellidoPaterno
	 * Tipo: String
	 * Descripcion: Declaracion de variable apellidoPaterno del tipo String
	 */
	private String apellidoPaterno;
	
	/**
	 * 
	 * Nombre: apellidoMaterno
	 * Tipo: String
	 * Descripcion: Declaracion de variable apellidoMaterno del tipo String
	 */
	private String apellidoMaterno;
	
	/**
	 * 
	 * Nombre: rfc
	 * Tipo: String
	 * Descripcion: Declaracion de variable rfc del tipo String
	 */
	private String rfc;
	
	/**
	 * 
	 * Nombre: curp
	 * Tipo: String
	 * Descripcion: Declaracion de variable curp del tipo String
	 */
	private String curp;
	
	/**
	 * 
	 * Nombre: telefono
	 * Tipo: String
	 * Descripcion: Declaracion de variable telefono del tipo String
	 */
	private String telefono;
	
	/**
	 * 
	 * Nombre: direccion
	 * Tipo: String
	 * Descripcion: Declaracion de variable direccion del tipo String
	 */
	private String direccion;

	/**
	 * Descripcion: Metodo que devuelve la propiedad idCliente del tipo String
	 * idCliente
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad idCliente
	 */
	public String getIdCliente() {
		return idCliente;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad idCliente del tipo String
	 * idCliente
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param idCliente para ser establecida
	 */
	
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
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
	 * Descripcion: Metodo que devuelve la propiedad apellidoPaterno del tipo String
	 * apellidoPaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad apellidoPaterno del tipo String
	 * apellidoPaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param apellidoPaterno para ser establecida
	 */
	
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad apellidoMaterno del tipo String
	 * apellidoMaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad apellidoMaterno del tipo String
	 * apellidoMaterno
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param apellidoMaterno para ser establecida
	 */
	
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad rfc del tipo String
	 * rfc
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad rfc del tipo String
	 * rfc
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param rfc para ser establecida
	 */
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad curp del tipo String
	 * curp
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad curp del tipo String
	 * curp
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param curp para ser establecida
	 */
	
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad telefono del tipo String
	 * telefono
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad telefono del tipo String
	 * telefono
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param telefono para ser establecida
	 */
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad direccion del tipo String
	 * direccion
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad direccion del tipo String
	 * direccion
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param direccion para ser establecida
	 */
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
