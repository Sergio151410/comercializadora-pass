package com.comer.citri.model;

import java.io.Serializable;

public class EmpleadoVentaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3112355379577263998L;

	private int clave;
	private String nombre;
	
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
