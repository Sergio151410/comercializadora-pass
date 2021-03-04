package com.comer.citri.model;

import java.io.Serializable;
import java.util.List;


public class VentaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 749559448459966355L;

	
	private int folio;
	private String fecha;
	private String hora;
	private float gTotal;
	private ClienteVentaBean cliente;
	private EmpleadoVentaBean empleado;
	private List<ProductoVentaBean> detalle;
	
	
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public ClienteVentaBean getCliente() {
		return cliente;
	}
	public void setCliente(ClienteVentaBean cliente) {
		this.cliente = cliente;
	}
	public EmpleadoVentaBean getEmpleado() {
		return empleado;
	}
	public void setEmpleado(EmpleadoVentaBean empleado) {
		this.empleado = empleado;
	}
	public List<ProductoVentaBean> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<ProductoVentaBean> detalle) {
		this.detalle = detalle;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public float getgTotal() {
		return gTotal;
	}
	public void setgTotal(float gTotal) {
		this.gTotal = gTotal;
	}
	
	
}
