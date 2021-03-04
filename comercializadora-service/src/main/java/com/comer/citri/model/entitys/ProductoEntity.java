package com.comer.citri.model.entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class ProductoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6822178025701350698L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_PROD")
	private int idProd;
	
	@Column(name = "NOMBRE_PROD")
	private String nombre;
	
	@Column(name = "PRECIO_PROD")
	private Float precio;
	
	@Column(name = "ICONO_PROD")
	@Lob
	private byte[] icono;
	
	@Column(name = "ID_CAJA")
	private int caja;

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public byte[] getIcono() {
		return icono;
	}

	public void setIcono(byte[] icono) {
		this.icono = icono;
	}

	public int getCaja() {
		return caja;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}
	
}
