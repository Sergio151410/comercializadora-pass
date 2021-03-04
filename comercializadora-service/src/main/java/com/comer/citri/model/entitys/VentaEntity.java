package com.comer.citri.model.entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VENTA")
public class VentaEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6822178025701350698L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FOLIO_VENTA")
	private int folioVenta;
	@Column(name = "FECHA_VENTA")
	private Date fechaVenta;
	@Column(name = "TOTAL_VENTA")
	private Float totalVenta;
	@Column(name = "ID_EMP")
	private int empleado;
	@Column(name = "ID_CLIENTE")
	private int cliente;
	
	
	public int getFolioVenta() {
		return folioVenta;
	}
	public void setFolioVenta(int folioVenta) {
		this.folioVenta = folioVenta;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Float getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(Float totalVenta) {
		this.totalVenta = totalVenta;
	}
	public int getEmpleado() {
		return empleado;
	}
	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}	

}
