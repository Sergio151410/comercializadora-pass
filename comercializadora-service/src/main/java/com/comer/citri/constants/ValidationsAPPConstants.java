/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ValidationsAPPConstants.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:46:33	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ValidationsAPPConstants.java
 */
package com.comer.citri.constants;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ValidationsAPPConstants {
	
	/** Expresion regular validacion importe*/
	public  static final String IMPORTE = "^(0|[0-9]\\d*{15})(\\.\\d*{2}+)?$";
	/**Expresion regular validacion formato Alfanumerico con punto*/
	public static final String ALFANUMERICO_PUNTO = "^[A-Za-z0-9 -.]";
	/**Expresion regular validacion formato Alfanumerico*/
	public static final String ALFANUMERICO = "^[A-Za-z0-9]";
	/**Expresion regular validacion formato Fecha dd/mm/yyyy*/
	public static final String FECHA = "([0-2][0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/[0-9]{4}";
	/**Constante para el codigo de error cuando el campo obligatorio no es informado*/
	public static final String CODIGO_OBLIGATORIO = "EROBL01";
	/**Expresion regular validacion formato Numerico*/
	public static final String NUMERICO = "\\d";
	/**Expresion regular validacion formato alfanumerico con caracteres especiales*/
	public static final String ALFANUMERICO_ESP = "[A-Za-z0-9_]";
	/**Constante para el codigo de error cuando el campo no cumple con la validacion de ser solamente numerico*/
	public static final String CODIGO_NUMERICO = "ERNUM01";
	/**Constante para el codigo de error cuando el campo no cumple con la longitud definida*/
	public static final String CODIGO_LONGITUD = "ERLON01";
	/** Constante para el codigo de error cuando el campo no cumple solo haya letras. */
	public static final String CODIGO_ALFABETO = "ERALF01";
	 /** Atributo que representa el valor de CODIGO_ALFANUMERICO:String */
	public static final String CODIGO_ALFANUMERICO = "ERALN01";
	 /** Atributo que representa el valor de CODIGO_NO_CARAC_ESPECIALES:String */
	public static final String CODIGO_NO_CARAC_ESPECIALES = "ERALF02";	
	/**Expresion regular validacion de documentos con extension PDF, TIFF, TIF*/
	public static final String FILE_DOCUMENTO = ".{1,100}\\.(|PDF|TIFF|TIF)$";
	/**Expresion regular validacion de documentos con extension TXT, XLSX, XLS, CSV, PRN*/
	public static final String FILE_OPERATIVO = ".{1,100}\\.(|XLS|XLSX|PRN|TXT)$";
	/**Expresion regular validacion de documentos con extension TXT, XLSX, XLS, CSV, PRN*/
	public static final String FILE_OPERATIVO_SIN = ".{1,100}\\.(TXT|XLSX|XLS|XLSM|CSV|PRN|PNG|PDF|TIFF|TIF|JPG)$";
	 /** Atributo que representa el valor de FILE_OPERATIVO_EXT:String */
	public static final String FILE_OPERATIVO_EXT = ".{1,100}\\.(TXT|XLSX|XLS|XLSM|CSV|PRN)$";
	/**Expresion regular validacion de documentos con extension TXT, XLSX, XLS, CSV, PRN, PDF, TIFF, TIF*/
	public static final String FILE_ALL = ".{1,100}\\.(|TXT|XLSX|XLSXM|XLS|CSV|PRN|PDF|TIFF|TIF)$";
	 /** Atributo que representa el valor de CODIGO_NO_CARAC_ESPECIALES:String */
	public static final String CODIGO_ERROR_CARACTERES = "ERCARAC01";
	/**Expresion regular validacion de documentos con extension XLSX, XLS,*/
	public static final String FILE_EXCEL = ".{1,100}\\.(|XLS|XLSX)$";	
	/** Atributo que representa el peso maximo de un archivo para mantenimientos casos especiales*/
	public static final long FILE_MTDC_ESPECIAL = 5 * 1024 * 1024L;
	/** Atributo que representa el peso maximo de un archivo para mantenimientos generales*/
	public static final long FILE_MTDC = 15 * 1024 * 1024L;
	  
	/**
	 * Descripcion: Constructor para no crear objetos del tipo ValidationsAPPConstants.java
	 * Creado por    : 1697401
	 * Fecha Creacion: 11/09/2019
	 */
	private ValidationsAPPConstants() {
		super();
	}

}
