package com.comer.citri.model.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DVENTA")
public class DVentaEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6822178025701350698L;
	
	@Id
	@Column(name = "FOLIO_VENTA")
	private Integer folioVenta;
	
	@Column(name = "ID_PROD")
	private Integer idProd;
	
	@Column(name = "SALDOANT_DVENTA")
	private Integer saldoAnt;
	
	@Column(name = "SALDOACT_DVENTA")
	private Integer saldoAct;

	public Integer getFolioVenta() {
		return folioVenta;
	}

	public void setFolioVenta(Integer folioVenta) {
		this.folioVenta = folioVenta;
	}

	public Integer getIdProd() {
		return idProd;
	}

	public void setIdProd(Integer idProd) {
		this.idProd = idProd;
	}

	public Integer getSaldoAnt() {
		return saldoAnt;
	}

	public void setSaldoAnt(Integer saldoAnt) {
		this.saldoAnt = saldoAnt;
	}

	public Integer getSaldoAct() {
		return saldoAct;
	}

	public void setSaldoAct(Integer saldoAct) {
		this.saldoAct = saldoAct;
	}
	
}
