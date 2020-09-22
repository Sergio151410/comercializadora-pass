/**
 * Comercializadora Citricos G&M
 * Todos los derechos reservados
 * ResponseOperacionBean.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 12:19:59	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ResponseOperacionBean.java
 */
package com.comer.citri.global.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.comer.citri.utils.Utils;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ResponseOperacionBean implements Serializable{

	/**
	 * 
	 * Nombre: serialVersionUID
	 * Tipo: long
	 * Descripcion: Declaracion de variable serialVersionUID del tipo long
	 */
	private static final long serialVersionUID = 7211924465938084295L;
	
	/**
	 * Nombre: status
	 * Tipo: String
	 * Descripcion: Declaracion de variable status del tipo String. Define el estatus de la operacion
	 */
	private String status;
	
	/**
	 * Nombre: result
	 * Tipo: Object
	 * Descripcion: Declaracion de variable result del tipo Object. Es la respuesta de la operacion
	 */
	private transient Object result;
	
	/**
	 * Nombre: errores
	 * Tipo: List<ErroresBean>
	 * Descripcion: Declaracion de variable errores del tipo List<ErroresBean>. Define los posibles errores en una operacion
	 */
	private List<ErroresBean> errores = new ArrayList<>();
	
	/**
	 * Descripcion: Constructor para crear objetos del tipo ResponseOperacionBean.java
	 * Creado por    : 1697401
	 * Fecha Creacion: 11/09/2019
	 */
	public ResponseOperacionBean() {
		super();
		this.errores = new ArrayList<ErroresBean>();
	}
	
	/**
	 * 
	 * Descripcion : Metodo que establece la propiedad errores del tipo ErroresBean
	 * @author 1697401
	 * @since  11/09/2019
	 * @param errores Devuelve la propiedad del tipo void
	 */
	public void addError(ErroresBean errores) {
		this.errores.add(errores);
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad status del tipo String
	 * status
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad status del tipo String
	 * status
	 * String
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param status para ser establecida
	 */
	
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad result del tipo Object
	 * result
	 * Object
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad result
	 */
	public Object getResult() {
		return result;
	}

	/**
	 * Descripcion: Metodo que establece la propiedad result del tipo Object
	 * result
	 * Object
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param result para ser establecida
	 */
	
	public void setResult(Object result) {
		this.result = result;
	}

	/**
	 * Descripcion: Metodo que devuelve la propiedad errores del tipo List<ErroresBean>
	 * errores
	 * List<ErroresBean>
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @return regresa la propiedad errores
	 */
	public List<ErroresBean> getErrores() {
		return Utils.clone(errores);
	}

	/**
	 * Descripcion: Metodo que establece la propiedad errores del tipo List<ErroresBean>
	 * errores
	 * List<ErroresBean>
	 * Creado por    : 1697401
	 * Fecha Creacion:11/09/2019
	 * @param errores para ser establecida
	 */
	
	public void setErrores(List<ErroresBean> errores) {
		this.errores = Utils.clone(errores);
	}


}
