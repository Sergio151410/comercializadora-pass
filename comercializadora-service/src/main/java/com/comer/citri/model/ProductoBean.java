/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * AltaProductosBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 18:52:36	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de AltaProductosBean.java
 */
package com.comer.citri.model;

import java.io.Serializable;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ProductoBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = -6925984617475475573L;
	
	/**
	 * 
	 * Nombre: idProducto
	 * Tipo: String
	 * Descripcion: Declaracion de variable idProducto del tipo String
	 */
	private int id;
	
	/**
	 * 
	 * Nombre: descripcionProducto
	 * Tipo: String
	 * Descripcion: Declaracion de variable descripcionProducto del tipo String
	 */
	private String descripcionProducto;
	
	/**
	 * 
	 * Nombre: precioBase
	 * Tipo: String
	 * Descripcion: Declaracion de variable precioBase del tipo String
	 */
	private double precio;
	
        /**
	 * 
	 * Nombre: icono
	 * Tipo: String
	 * Descripcion: Declaracion de variable icono del tipo String
	 */
        private String icono;
        
        private int status;
	/**
	 * Descripcion: Metodo que devuelve la propiedad precioBase del tipo String
	 * precioBase
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad precioBase
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad precioBase del tipo String
	 * precioBase
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param precioBase para ser establecida
	 */
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * Descripcion: Metodo que devuelve la propiedad idProducto del tipo String
	 * idProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad idProducto
	 */
	public int getId() {
		return id;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad idProducto del tipo String
	 * idProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param idProducto para ser establecida
	 */
	
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad descripcionProducto del tipo String
	 * descripcionProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad descripcionProducto
	 */
	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad descripcionProducto del tipo String
	 * descripcionProducto
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param descripcionProducto para ser establecida
	 */
	
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
        
        public String getIcono()
        {
            return icono;
        }
        
        public void setIcono(String icono)
        {
            this.icono = icono;
        }
        
        public int getStatus()
        {
            return status;
        }
        
        public void setStatus(int status)
        {
            this.status = status;
        }
        
        
	
}
