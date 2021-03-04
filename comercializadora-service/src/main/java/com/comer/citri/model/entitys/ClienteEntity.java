package com.comer.citri.model.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class ClienteEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6822178025701350698L;
	
	@Id
	@Column(name = "ID_CLIENTE")
	private Integer id;
	
	@Column(name = "NOMBRE_CLIENTE")
	private String nombre;
	
	@Column(name = "APATERNO")
	private String aPaterno;
	
	@Column(name = "AMATERNO")
	private String aMaterno;
	
	@Column(name = "RFC_CLIENTE")
	private Integer rfc;
	
	@Column(name = "CALLED_CLIENTE")
	private String calle;
	
	@Column(name = "COLD_CLIENTE")
	private String colonia;

	@Column(name = "NUMD_CLIENTE")
	private Integer num;
	
	@Column(name = "TEL_CLIENTE")
	private Integer tel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getaPaterno() {
		return aPaterno;
	}

	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getaMaterno() {
		return aMaterno;
	}

	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public Integer getRfc() {
		return rfc;
	}

	public void setRfc(Integer rfc) {
		this.rfc = rfc;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}
	
	
}
