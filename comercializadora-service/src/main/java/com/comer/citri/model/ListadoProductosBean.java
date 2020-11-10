/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ListadoProductosBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:31:08	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ListadoProductosBean.java
 */
package com.comer.citri.model;

import java.io.Serializable;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ListadoProductosBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = -1751473551433692959L;
	
	/**
	 * 
	 * Nombre: idProducto
	 * Tipo: String
	 * Descripcion: Declaracion de variable idProducto del tipo String
	 */
	private String idProducto;
	
	/**
	 * 
	 * Nombre: descripcionProduct
	 * Tipo: String
	 * Descripcion: Declaracion de variable descripcionProduct del tipo String
	 */
	private String descripcionProduct;
	
	/**
	 * 
	 * Nombre: precioBase
	 * Tipo: String
	 * Descripcion: Declaracion de variable precioBase del tipo String
	 */
	private String precioBase;
	
	/**
	 * 
	 * Nombre: precioFinal
	 * Tipo: String
	 * Descripcion: Declaracion de variable precioFinal del tipo String
	 */
	private String precioFinal;

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
	 * Descripcion: Metodo que devuelve la propiedad descripcionProduct del tipo String
	 * descripcionProduct
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad descripcionProduct
	 */
	public String getDescripcionProduct() {
		return descripcionProduct;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad descripcionProduct del tipo String
	 * descripcionProduct
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param descripcionProduct para ser establecida
	 */
	
	public void setDescripcionProduct(String descripcionProduct) {
		this.descripcionProduct = descripcionProduct;
	}

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
	 * Descripcion: Metodo que devuelve la propiedad precioFinal del tipo String
	 * precioFinal
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad precioFinal
	 */
	public String getPrecioFinal() {
		return precioFinal;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad precioFinal del tipo String
	 * precioFinal
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param precioFinal para ser establecida
	 */
	
	public void setPrecioFinal(String precioFinal) {
		this.precioFinal = precioFinal;
	}

}
