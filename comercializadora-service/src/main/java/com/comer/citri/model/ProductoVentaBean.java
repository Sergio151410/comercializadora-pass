package com.comer.citri.model;

import java.io.Serializable;

public class ProductoVentaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3546353215463153206L;
	
	private float costo;
	private int id;
	private ItemBean fruta;
	private float total;
	private float cantidad;
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ItemBean getFruta() {
		return fruta;
	}
	public void setFruta(ItemBean fruta) {
		this.fruta = fruta;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	

	
	
}
