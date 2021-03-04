package com.comer.citri.model;

import java.io.Serializable;
import java.util.List;

import com.comer.citri.model.entitys.ClienteEntity;
import com.comer.citri.model.entitys.EmpleadoEntity;
import com.comer.citri.model.entitys.ProductoEntity;

public class FormVentaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 658837658579171930L;

	private List<ClienteEntity> clientes;
	
	private List<EmpleadoEntity> empleados;
	
	private List<ProductoEntity> productos;

	public List<ClienteEntity> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteEntity> clientes) {
		this.clientes = clientes;
	}

	public List<EmpleadoEntity> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpleadoEntity> empleados) {
		this.empleados = empleados;
	}

	public List<ProductoEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoEntity> productos) {
		this.productos = productos;
	}
	
}
