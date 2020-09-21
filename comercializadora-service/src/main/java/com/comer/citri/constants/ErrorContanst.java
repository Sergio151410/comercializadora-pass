/**
 * Comercializadora Citricos G&M
 * Todos los derechos reservados
 * ErrorContanst.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 12:37:59	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ErrorContanst.java
 */
package com.comer.citri.constants;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ErrorContanst {
	
	/** Define el mensaje de error SFTP */
	public static final String ERROR_SFTP = "Error en el servicio SFTP";
	/** Define el mensaje de error de APPIAN*/
	public static final String ERROR_APPIAN = "Error en el envío a APPIAN";
	/**Constante de error de base de datos*/
	public static final String ERROR_BD = "Error al procesar la informacion en base de datos.";
	/**Constante de error tecnico*/
	public static final String ERROR_TECNICO = "Se ha presentado un error tecnico al realizar la consulta.";
	/**Constante de error Datos Generales*/
	public static final String ERROR_DATOS_GEN = "No se encontro informacion con los datos generales de entrada";
	/**Constante de consulta correcta*/
	public static final String MEN_COLL_OK = "Consulta OK.";
	/**Constante de consulta vacia*/
	public static final String MEN_COLL_OV = "Consulta vacia.";
	/**Constante de error en la consulta*/
	public static final String MEN_COLL_FAIL = "Error al realizar la consulta.";
	/**Constante del codigo de error generico/inesperado*/
	public static final String CODIGO_PDIGE01 = "PDIGE01";
	/**Constante del mensaje de error generico/inesperado*/
	public static final String DESCRIPCION_PDIGE01 = "Surgio un error inesperado, favor de comunicarse con su administrador.";
	/**Constante de palabra Error, para el nivel del error */
	public static final String LEVEL_ERROR = "error";
	/**Constante del codigo de error PDIBD01, de error de conexion a la base de datos principal del proyecto*/
	public static final String CODIGO_PDIBD01 = "PDIBD01";
	/**Constante de la descripcion del error cuando no se puede conectar a base de datos*/
	public static final String DESCRIPCION_PDIBD01 = "No se pudo establecer la conexion a la base de datos.";
	/** Constante para definir el valor 400 que corresponde a BAD REQUEST*/
	public static final String BAD_REQUEST_CODE = "400";

	 /** Atributo que representa el valor de CODIGO_ERROR_ERRGE01:String Error generico */
	public static final String CODIGO_ERROR_ERRGE01 = "ERRGE01";

	 /** Atributo que representa el valor de CODIGO_MSG_ERRGE01:String */
	public static final String CODIGO_MSG_ERRGE01 = "Error generico";

	 /** Atributo que representa el valor de CODIGO_ERROR_ERRAR01:String No se indico archivo  */
	public static final String CODIGO_ERROR_ERRAR01 = "ERRAR01";
	 /** Atributo que representa el valor de CODIGO_ERROR_ERRAR02:String Extension no valida */
	public static final String CODIGO_ERROR_ERRAR02 = "ERRAR02";
	/** Atributo que representa el valor de CODIGO_ERROR_ERRAR03:String peso de archivo no valida */
	public static final String CODIGO_ERROR_ERRAR03 = "ERRAR03";
	/** Atributo que representa el valor de CODIGO_ERROR_ERRAR03:String peso de archivo no valida */
	public static final String CODIGO_ERROR_ERRAR04 = "ERRAR04";
	
	/**Constante del codigo de error MSDSE01, de error de conexion de MIRCROSERVICIO DETALLES principal del proyecto*/
	public static final String CODIGO_MSDSE01= "MSDSE01";
	/**Constante de la descripcion del error cuando no se puede conectar al microservicio detalles*/
	public static final String DESCRIPCION_MSDSE01 = "No se pudo establecer la conexion con el micro servicio detalles";

	/**Constante del codigo de error OPETXE01, de error de conexion de servicio de OpenText principal del proyecto*/
	public static final String CODIGO_OPETXE01= "OPETXE01";
	/**Constante de la descripcion del error cuando no se puede conectar al servicio de OpenText*/
	public static final String DESCRIPCION_OPETXE01 = "No se pudo establecer la conexion con el servicio";

	
	/**
	 * Descripcion: Constructor para no crear objetos del tipo ErrorConstants.java
	 * Creado por    : 1697401
	 * Fecha Creacion: 11/09/2019
	 */
	private ErrorContanst(){
		super();
	}

}
