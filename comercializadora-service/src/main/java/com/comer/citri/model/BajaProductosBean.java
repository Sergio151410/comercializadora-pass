/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * BajaProductosBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 18:53:45	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de BajaProductosBean.java
 */
package com.comer.citri.model;

import java.io.Serializable;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class BajaProductosBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = -7854090590695372864L;
	
	/**
	 * 
	 * Nombre: idProducto
	 * Tipo: String
	 * Descripcion: Declaracion de variable idProducto del tipo String
	 */
	private String idProducto;
	
	/**
	 * 
	 * Nombre: descripProducto
	 * Tipo: String
	 * Descripcion: Declaracion de variable descripProducto del tipo String
	 */
	private String descripProducto;
	
	/**
	 * 
	 * Nombre: precioBase
	 * Tipo: String
	 * Descripcion: Declaracion de variable precioBase del tipo String
	 */
	private String precioBase;
	
	/**
	 * 
	 * Nombre: precionFinal
	 * Tipo: String
	 * Descripcion: Declaracion de variable precionFinal del tipo String
	 */
	private String precionFinal;

	/**
	 * Descripcion: Metodo que devuelve la propiedad precioBase del tipo String
	 * precioBase
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad precioBase
	 */
	public String getPrecioBase() {
		return precioBase;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad precioBase del tipo String
	 * precioBase
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param precioBase para ser establecida
	 */
	
	public void setPrecioBase(String precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad precionFinal del tipo String
	 * precionFinal
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad precionFinal
	 */
	public String getPrecionFinal() {
		return precionFinal;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad precionFinal del tipo String
	 * precionFinal
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param precionFinal para ser establecida
	 */
	
	public void setPrecionFinal(String precionFinal) {
		this.precionFinal = precionFinal;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad idProducto del tipo String
	 * idProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad idProducto
	 */
	public String getIdProducto() {
		return idProducto;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad idProducto del tipo String
	 * idProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param idProducto para ser establecida
	 */
	
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad descripProducto del tipo String
	 * descripProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad descripProducto
	 */
	public String getDescripProducto() {
		return descripProducto;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad descripProducto del tipo String
	 * descripProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param descripProducto para ser establecida
	 */
	
	public void setDescripProducto(String descripProducto) {
		this.descripProducto = descripProducto;
	}
	
}
