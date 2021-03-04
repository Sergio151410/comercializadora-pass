package com.comer.citri.model.entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADO")
public class EmpleadoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6822178025701350698L;
	
	@Id
	@Column(name = "ID_EMP")
	private Integer id;
	
	@Column(name = "NOMBRE_EMP")
	private String nombre;
	
	@Column(name = "APATERNO_EMP")
	private String aPaterno;

	@Column(name = "FNACIMIENTO_EMP")
	private Date fNacimiento;
	
	@Column(name = "CALLED_EMP")
	private String calle;
	
	@Column(name = "COLONIAD_EMP")
	private String colonia;

	@Column(name = "NUMD_EMP")
	private Integer num;
	
	@Column(name = "TELEFONO_EMP")
	private Integer telefono;

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

	

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Date getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
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
	
	
}
