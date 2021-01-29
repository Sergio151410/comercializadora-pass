/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * PuntoVentaComercializadoraBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      10 nov. 2020 15:30:30	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de PuntoVentaComercializadoraBean.java
 */
package com.comer.citri.model;

import java.io.Serializable;
import java.util.List;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class PuntoVentaComercializadoraBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = -9009608270774357571L;
	
	/**
	 * 
	 * Nombre: ventaProductos
	 * Tipo: List<ListadoProductosBean>
	 * Descripcion: Declaracion de variable ventaProductos del tipo List<ListadoProductosBean>
	 */
	private List<ListadoProductosBean> ventaProductos;
	
	/**
	 * 
	 * Nombre: fecha
	 * Tipo: String
	 * Descripcion: Declaracion de variable fecha del tipo String
	 */
	private String fecha;
	
	/**
	 * 
	 * Nombre: hora
	 * Tipo: String
	 * Descripcion: Declaracion de variable hora del tipo String
	 */
	private String hora;
	
	/**
	 * 
	 * Nombre: infoCliente
	 * Tipo: ClientesComercializadoraBean
	 * Descripcion: Declaracion de variable infoCliente del tipo ClientesComercializadoraBean
	 */
	private ClientesComercializadoraBean infoCliente;
	
	/**
	 * 
	 * Nombre: indoEmpleado
	 * Tipo: EmpleadoComercializadoraBean
	 * Descripcion: Declaracion de variable indoEmpleado del tipo EmpleadoComercializadoraBean
	 */
	private EmpleadoComercializadoraBean indoEmpleado;
	
	/**
	 * 
	 * Nombre: ventaTotal
	 * Tipo: String
	 * Descripcion: Declaracion de variable ventaTotal del tipo String
	 */
	private String ventaTotal;

	/**
	 * Descripcion: Metodo que devuelve la propiedad ventaProductos del tipo List<ListadoProductosBean>
	 * ventaProductos
	 * List<ListadoProductosBean>
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad ventaProductos
	 */
	public List<ListadoProductosBean> getVentaProductos() {
		return ventaProductos;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad ventaProductos del tipo List<ListadoProductosBean>
	 * ventaProductos
	 * List<ListadoProductosBean>
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param ventaProductos para ser establecida
	 */
	
	public void setVentaProductos(List<ListadoProductosBean> ventaProductos) {
		this.ventaProductos = ventaProductos;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad fecha del tipo String
	 * fecha
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad fecha del tipo String
	 * fecha
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param fecha para ser establecida
	 */
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad hora del tipo String
	 * hora
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad hora del tipo String
	 * hora
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param hora para ser establecida
	 */
	
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad infoCliente del tipo ClientesComercializadoraBean
	 * infoCliente
	 * ClientesComercializadoraBean
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad infoCliente
	 */
	public ClientesComercializadoraBean getInfoCliente() {
		return infoCliente;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad infoCliente del tipo ClientesComercializadoraBean
	 * infoCliente
	 * ClientesComercializadoraBean
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param infoCliente para ser establecida
	 */
	
	public void setInfoCliente(ClientesComercializadoraBean infoCliente) {
		this.infoCliente = infoCliente;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad indoEmpleado del tipo EmpleadoComercializadoraBean
	 * indoEmpleado
	 * EmpleadoComercializadoraBean
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad indoEmpleado
	 */
	public EmpleadoComercializadoraBean getIndoEmpleado() {
		return indoEmpleado;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad indoEmpleado del tipo EmpleadoComercializadoraBean
	 * indoEmpleado
	 * EmpleadoComercializadoraBean
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param indoEmpleado para ser establecida
	 */
	
	public void setIndoEmpleado(EmpleadoComercializadoraBean indoEmpleado) {
		this.indoEmpleado = indoEmpleado;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad ventaTotal del tipo String
	 * ventaTotal
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @return regresa la propiedad ventaTotal
	 */
	public String getVentaTotal() {
		return ventaTotal;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad ventaTotal del tipo String
	 * ventaTotal
	 * String
	 * Creado por    : sergi
	 * Fecha Creacion:10 nov. 2020
	 * @param ventaTotal para ser establecida
	 */
	
	public void setVentaTotal(String ventaTotal) {
		this.ventaTotal = ventaTotal;
	}

}
