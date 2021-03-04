package com.comer.citri.model;

import java.io.Serializable;

public class ItemBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1937300806847652768L;
	private int id;
	private String nombre;
	private String imagen;
	private float precio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
