/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * APPConstants.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:37:09	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de APPConstants.java
 */
package com.comer.citri.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class APPConstants {
	/**Atributo que representa la constante de boolean*/
	public static final String BOOLEAN = "boolean";
	/**Atributo que representa la constante de vacio */
	public static final String ATRIBUTO_VACIO = "vacio";
	/**Atributo que representa la constante de undefined */
	public static final String UNDEFINED = "undefined";
	/**Atributo que representa la constante de formato de fechas dd/MM/yyyy */
	public static final String FORMAT_ANGULAR_DATE = "dd/MM/yyyy";
	/**Atributo que representa la constante de formato de fechas MM/dd/yyyy */
	public static final String FORMAT_APPIAN_DATE = "MM/dd/yyyy";
	/**Atributo que representa la constante de date */
	public static final String DATE = "date";
	/**Atributo que representa la constante de string */
	public static final String STRING = "string";
	 /** Atributo que representa el valor de SQL_OK:String */
	public static final String SQL_OK = "SIO_SQL-000";
	 /** Atributo que representa el valor de SQL_FAIL:String */
	public static final String SQL_FAIL = "SIO_SQL-001";
	/** Define el Codigo de error para cuando hay un error en el envio a APPIAN*/
	public static final String APPIAN_FAIL = "SIO_APN-001";
	/** Define el Codigo de error cuando hay un error con el SFTP*/
	public static final String SFTP_FAIL = "SIO_FTP-001";
	/** Contante de Aplicacion que representa un estado de fracaso */
	public static final String KEY_APPLICATION_ESTATUS_FAIL = "fail";
	/** Constante String vacio */
	public static final String VACIO = "";
	/** Constante ERROR */
	public static final String ERROR = "ERROR";
	/** constante de codigo de consulta vacia */
	public static final String COD_CONS_VACIA = "COLLOV001";
	/** Contante de Aplicacion que representa un estado de exito */
	public static final String KEY_APPLICATION_ESTATUS_OK = "success";
	/** Constante de Cero */
	public static final String GUION_BAJO = "_";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_XLSX = ".xlsx";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_XLS = ".xls";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_CSV = ".csv";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_PRN = ".prn";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_TXT = ".txt";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_PDF = ".pdf";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_TIFF = ".tiff";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_TIF = ".tif";
	/** Constante para la extension del archivo. */
	public static final String EXTENSION_PNG = ".png";
	 /** Atributo que representa el valor de NOMBRE_USUARIO:String */
	public static final String NOMBRE_USUARIO = "E_NOMBRE_USUARIO";
	 /** Atributo que representa el valor de ID_FLUJO:String */
	public static final String ID_FLUJO = "E_ID_FLUJO";
	 /** Atributo que representa el valor de COD_PREF:String */
	public static final String COD_PREF = "E_COD_PREF";
	 /** Atributo que representa el valor de ID_FLUJO:String */
	public static final String ID_SOLICITUD = "E_ID_SOLICITUD";
	 /** Atributo que representa el valor de ID_USUARIO:String */
	public static final String ID_USUARIO = "E_ID_USUARIO";
	 /** Atributo que representa el valor de ID_USUARIO:String */
	public static final String E_TIPO_OPERACION = "E_TIPO_OPERACION";
	 /** Atributo que representa el valor de CENTRO_COSTOS:String */
	public static final String CENTRO_COSTOS = "E_CENTRO_COSTO";
	 /** Atributo que representa el valor de PERFIL_SOLICITANTE:String */
	public static final String PERFIL_SOLICITANTE = "E_PERFIL";
	 /** Atributo que representa el valor de DIVISA:String */
	public static final String DIVISA = "E_DIVISA";
	 /** Atributo que representa el valor de COD_BUC:String */
	public static final String COD_BUC = "E_COD_BUC";
	 /** Atributo que representa el valor de E_FOLIOS_APPIAN:String */
	public static final String E_FOLIOS_APPIAN = "E_FOLIOS_APPIAN";
	 /** Atributo que representa el valor de IP_SOLICITANTE:String */
	public static final String IP_SOLICITANTE = "E_IP_SOLICITANTE";
	 /** Atributo que representa el valor de NOMBRE_ARCHIVOS:String */
	public static final String NOMBRE_ARCHIVOS = "E_NOM_ARCHIVOS";
	 /** Atributo que representa el valor de NOMBRE_ARCHIVOS:String */
	public static final String E_APPN_JSON = "E_APPN_JSON";
	 /** Atributo que representa el valor de FECHA_HORA_SOLI:String */
	public static final String FECHA_HORA_SOLI = "E_FECHA_HORA_SOLIC";
	 /** Atributo que representa el valor de CURSOR:String */
	public static final String CURSOR = "S_CURSOR";
	/** Constante del paquete y del sp a ejecutar. */
	public static final String AUTORIZACION_FOLIADOR_SLA = "PKG_SIO_MX_FLUJOS.SP_SIO_CRE_REGISTRO_SOLIC_01";
	 /** Atributo que representa el valor de ACTUALIZA_UUIDS:String */
	public static final String ACTUALIZA_UUIDS = "PKG_SIO_MX_FLUJOS.SP_SIO_UPD_UUIDS_SOLIC_01";
	 /** Atributo que representa el valor de ACTUALIZA_UUIDS:String */
		public static final String ACTUALIZA_JSON = "PKG_SIO_MX_FLUJOS.SP_SIO_UPD_SOLIC_APPN_JSON_01";
	 /** Atributo que representa el valor de CRE_FOLIADOR_01:String */
	public static final String CRE_FOLIADOR_01 = "PKG_SIO_MX_FOLIADOR.SP_SIO_CRE_FOLIADOR_01";
	/** Atributo que representa el valor de UPD_FOLIADOR_01:String */
	public static final String UPD_FOLIADOR_01 = "PKG_SIO_MX_FOLIADOR.SP_SIO_UPD_FOLIADOR_01";
	/** Constante del paquete y del sp a ejecutar. */
	public static final String BANDEJA_CONSULTA_BUSQUEDA = "PKG_SIO_MX_FLUJOS.SP_SIO_LEC_BANDEJA_SOLIC_01";
	 /** Atributo que representa el valor de FOLIO_NUMBER:String */
	public static final String FOLIO_NUMBER = "E_FOLIO";
	 /** Atributo que representa el valor de S_FOLIO:String */
	public static final String S_FOLIO = "S_FOLIO";
	/** Atributo que representa el valor de E_ID_ESTADO_SOLIC:String */
	public static final String ESTADO_SOLICITUD = "E_ID_ESTADO_SOLIC";
	/** Atributo que representa el valor de E_NO_PAGINA:String */
	public static final String PAGINACIN_BANDEJA = "E_NO_PAGINA";
	/** Atributo que representa el valor de E_TAM_PAGINA:String */
	public static final String TAMANIO_PAGINACION = "E_TAM_PAGINA";
	/** Atributo que representa el valor de E_ID_PERF:String */
	public static final String E_PERFIL = "E_ID_PERF";
	/** Atributo que representa el valor de S_TOTAL_REGS:String */
	public static final String TOTAL_REGISTROS = "S_TOTAL_REGS";
	/** Atributo que representa el valor de E_NOMBRE_SOLICITANTE:String */
	public static final String NOMBRE_SOLICITANTE = "E_NOMBRE_SOLICITANTE";
	/** Atributo que representa el valor de E_FECHA_SOLICITUD_INI:String */
	public static final String FECHA_SOLICITUD_INICIO = "E_FECHA_SOLICITUD_INI";
	/** Atributo que representa el valor de E_FECHA_SOLICITUD_FIN:String */
	public static final String FECHA_SOLICITUD_FIN = "E_FECHA_SOLICITUD_FIN";
	/** Atributo que representa el valor de E_NOMBRE_VALIDADOR:String */
	public static final String NOMBRE_VALIDADOR = "E_NOMBRE_VALIDADOR";
	/** Atributo que representa el valor de E_FECHA_VALIDACION_INI:String */
	public static final String FECHA_VALIDACION_INICIO = "E_FECHA_VALIDACION_INI";
	/** Atributo que representa el valor de E_FECHA_VALIDACION_FIN:String */
	public static final String FECHA_VALIDACION_FIN = "E_FECHA_VALIDACION_FIN";
	/** Atributo que representa el valor de E_NOMBRE_APROBADOR:String */
	public static final String NOMBRE_APROBADOR =  "E_NOMBRE_APROBADOR";
	/** Atributo que representa el valor de E_FECHA_APROBACION_INI:String */
	public static final String FECHA_APROBACION_INICIO = "E_FECHA_APROBACION_INI";
	/** Atributo que representa el valor de E_FECHA_APROBACION_FIN:String */
	public static final String FECHA_APROBACION_FIN = "E_FECHA_APROBACION_FIN";
	/** Atributo que representa el valor de E_FECHA_SLA:String */
	public static final String FECHA_SLA = "E_FECHA_SLA";
	/** Atributo que representa el valor de E_ID_ESTATUS:String */
	public static final String ID_ESTATUS = "E_ID_ESTATUS";
	/** Atributo que representa el valor de E_COLUMA_ORDER:String */
	public static final String COLUM_ORDER = "E_COLUMA_ORDER";
	/** Atributo que representa el valor de S_TOTAL_PAGS:String */
	public static final String TOTAL_PAGINACION = "S_TOTAL_PAGS";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_OPCA = "OPCA_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_BONI = "BONI_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_CANCELACION = "CANCE_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_PLASTIFICACIONES = "PLASTI_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_OPCAM = "OPCAM_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_REACTIVACION = "REACT_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_DESBLOQUEO = "DESBLOQ_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_MSI = "MSI_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_MTDC = "MTDC_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_VOSTRO = "VSTR_RUTA_BATCH";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_AMBIENTE_TATA = "TATA_RUTA_APPIAN";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_AMBIENTE_VASS = "VASS_RUTA_APPIAN";
	/** Constante de la operacion para la obtencion de la ruta. */
	public static final String RUTA_AMBIENTE_SANTANDER = "SANTANDER_RUTA_APPIAN";
	/** Constante de respuesta de servicio*/
	public static final String CONS_RESULTADO = "resultado";
	/** Constante de valor cero*/
	public static final String CONS_CERO = "0";
	/** Constante de valor uno*/
	public static final String CONS_UNO = "1";
	/** Constante de simbolo pipe*/
	public static final String CONS_PIPE = "|";
	 /** Atributo que representa el valor de CONS_HASH:String */
	public static final String CONS_HASH = "#";
	/** Constante de simbolo pipe*/
	public static final String CONS_DOSPUNTOS = ":";
	/** Constante para sel Config Authentications.*/
	public static final String PREF_AUTHEN = "PreferredAuthentications";
	/** Constante para sel Config StrickHost.*/
	public static final String STRIC_HOST_KEY = "StrictHostKeyChecking";
	/** Constante para sel Config publicKey.*/
	public static final String PUBLIC_KEY = "publickey";
	/** Constante para sel Config NO.*/
	public static final String NO = "no";
	/** Constante de nombre de atributo para settear datos en bean SolicitudMsiBean*/
	public static final String BEAN_ESQUEMA = "esquema";
	/** Constante de nombre de atributo para settear datos en bean SolicitudMsiBean*/
	public static final String BEAN_CUENTA_COBRO = "cuentaCobro";
	/** Constante de nombre de atributo para settear datos en bean SolicitudMsiBean*/
	public static final String BEAN_USUARIO = "usuarioCreador";
	/** Constante de nombre de atributo para settear datos en bean SolicitudMsiBean*/
	public static final String BEAN_CORREO = "usuarioCorreo";
	/** Constante de nombre de atributo para settear datos en bean SolicitudMsiBean*/
	public static final String BEAN_SUCURSAL = "usuarioSucursal";
	/** Constante de nombre de atributo para settear datos en bean SolicitudMsiBean*/
	public static final String BEAN_RANGO = "rango";	
	/** Constante de nombre de atributo para settear datos en bean ComercioBean*/
	public static final String BEAN_COMERCIO_RANGO = "rango";
	/** Constante de nombre de atributo para settear datos en bean ComercioBean*/
	public static final String BEAN_COMERCIO_RFC = "rfc";
	/** Constante de nombre de atributo para settear datos en bean ComercioBean*/
	public static final String BEAN_COMERCIO_SOCIAL = "razonSocial";	
	/** Constante de nombre de atributo para settear datos en bean ComercioBean*/
	public static final String BEAN_COMERCIO_COMERCIAL = "razonComercial";
	/** Constante de nombre de atributo para settear datos en bean ComercioBean*/
	public static final String BEAN_COMERCIO_APODERADO = "apoderado";
	/** Constante de nombre de atributo para settear datos en bean ComercioBean*/
	public static final String BEAN_GIRO_CLAVE = "claveGiro";
	/** Constante de nombre de atributo para settear datos en bean ComercioBean*/
	public static final String BEAN_GIRO_DSC = "giroDescri";	
	/** Constante de nombre de atributo para settear datos en bean AfiliacionBean*/
	public static final String BEAN_AFIL_ID = "idAfiliacion";	
	/** Constante de nombre de atributo para settear datos en bean AfiliacionBean*/
	public static final String BEAN_AFIL_DSC = "descripcion";	
	/** Constante de nombre de atributo para settear datos en bean AfiliacionBean*/
	public static final String BEAN_BANCO_ID = "idBanco";	
	/** Constante de nombre de atributo para settear datos en bean AfiliacionBean*/
	public static final String BEAN_BANCO_DSC = "banco";	
	/** Constante de nombre de atributo para settear datos en bean AfiliacionBean*/
	public static final String BEAN_AFIL_INDICADOR = "indicador";	
	/** Constante de nombre de atributo para settear datos en bean PlazoBean*/
	public static final String BEAN_PLAZO_CANT = "plazo";	
	/** Constante de nombre de atributo para settear datos en bean PlazoBean*/
	public static final String BEAN_PLAZO_COMPRA = "compraMinima";	
	/** Constante de nombre de atributo para settear datos en bean PlazoBean*/
	public static final String BEAN_PLAZO_FCH_INICIO = "fechaInicioVigencia";
	/** Constante de nombre de atributo para settear datos en bean PlazoBean*/
	public static final String BEAN_PLAZO_FCH_FIN = "fechaFinVigencia";	
	/** Constante de nombre de atributo para settear datos en bean PlazoBean*/
	public static final String BEAN_PLAZO_TASA = "sobreTasa";	
	/** Constante de nombre de atributo para settear datos en bean PlazoBean*/
	public static final String BEAN_PLAZO_VOBO = "voBo";
	/** Constante de nombre de atributo para settear datos en condiciones*/
	public static final String BEAN_CONDICIONES = "condiciones";
	/** Constante de nombre de atributo para settear datos en esMasivo*/
	public static final String BEAN_ES_MASIVO = "esMasivo";	
	/** Constante de nombre de atributo para settear datos en idTipoSolicitud*/
	public static final String BEAN_IDTIPOSOLICITUD = "idTipoSolicitud";	
	/** Constante utilizada en la clase UtilsFlujo2Appian*/
	public static final String NOM_ARCH = "nombreArchivos";
	 /** Atributo que representa el valor de KEY_E_PARAMETRO:String */
	public static final String KEY_E_PARAMETRO = "E_PARAMETRO";
	 /** Atributo que representa el valor de KEY_KEY_S_VALOR:String */
	public static final String KEY_S_VALOR = "S_VALOR";
	 /** Atributo que representa el valor de S_ERR_MSG:String */
	public static final String S_ERR_MSG = "S_ERR_MSG"; 
	 /** Atributo que representa el valor de S_ERR_CODE:String */
	public static final String S_ERR_CODE = "S_ERR_CODE";
	 /** Atributo que representa el valor de SP_LEC_CONFIG_PARAM_01:String */
	public static final String SP_LEC_CONFIG_PARAM_01 = "PKG_SIO_MX_FLUJOS.SP_SIO_LEC_CONFIG_PARAM_01";
	 /** Atributo que representa el valor de KEY_VAL_RUTA:String */
	public static final String KEY_VAL_RUTA = "VAL_RUTA";
	 /** Atributo que representa el valor de KEY_ID_PROC_BATCH_PK:String */
	public static final String KEY_ID_PROC_BATCH_PK = "ID_PROC_BATCH_PK";
	 /** Atributo que representa el valor de KEY_DSC_NOMB_NUEVO:String */
	public static final String KEY_DSC_NOMB_NUEVO = "DSC_NOMB_NUEVO";
	 /** Atributo que representa el valor de KEY_ENCODED_BASE64:String */
	public static final String KEY_ENCODED_BASE64 = "ENCODED_BASE64";
	 /** Atributo que representa el valor de KEY_ID_LAY_OUT_FK:String */
	public static final String KEY_ID_LAY_OUT_FK = "ID_LAY_OUT_FK";
	 /** Atributo que representa el valor de KEY_VAL_FOLIO:String */
	public static final String KEY_VAL_FOLIO = "VAL_FOLIO";
	 /** Atributo que representa el valor de KEY_VAL_NOMB_SIMB_FN:String */
	public static final String KEY_VAL_NOMB_SIMB_FN = "VAL_NOMB_SIMB_FN";
	 /** Atributo que representa el valor de ZERO:int */
	public static final int ZERO = 0;
	 /** Atributo que representa el valor de KEY_ID_SOLIC_PK:String */
	public static final String KEY_ID_SOLIC_PK = "ID_SOLIC_PK";
	 /** Atributo que representa el valor el identificador de layout 43 */
	public static final String DOC_TRAB_ID = "43";
	 /** Atributo que representa el valor el descripcion de layout 43 */
	public static final String DOC_TRAB_DSC = "Afiliaciones Trabajo";
	 /** Atributo que representa el valor de FILENET_DEST:String */
	public static final String FILENET_DEST = "FILENET_DEST";
	/** Atributo que representa el valor de CONS_TIPO_VALIDACION:String */
	public static final String CONS_TIPO_VALIDACION = "tipoValidacion";
	/** Atributo que representa el valor de CONS_PESO:String */
	public static final String CONS_PESO = "peso";
	/** Constante para el complemento de tipo de solicitud de msi.*/
	public static final String PATH_APPIAN = "PATH_APPIAN_";
	/** Constante para el tipo de solicitud de msi.*/
	public static final String TIPO_SOL = "tipoSolicitud";	
	/** Atributo que representa el valor de estado de la solicitud:String */
	public static final String EDO_SOL_APROB_PEND = "APROB_PEND";
	/** Atributo que representa el valor de estado de la solicitud:String */
	public static final String EDO_SOL_BATCH = "BATCH_VALID_PEND";
	/** Atributo que representa el valor de estado de la solicitud:String */
	public static final String EDO_SOL_VALID_PEND = "VALID_PEND";
	/** Atributo que representa el valor de UPD_SOLIC_FOLIO_01:String */
	public static final String UPD_BORRADOR_FOLIO_01 = "PKG_SIO_MX_FLUJOS.SP_SIO_UPD_SOLIC_FOLIO_01";
	/** Atributo que representa el valor de UPD_SOLIC_FOLIO_01:String */
	public static final String UPD_MATRIZ_FLUJOS = "PKG_SIO_MX_FLUJOS.SP_SIO_UPD_SOLIC_MAT_AUTO_03";
	/** Atributo que representa el valor de UPD_SOLIC_FOLIO_01:String */
	public static final String ID_OPERACION = "idOperacion";
	/** Atributo que representa el valor de MONTO:String */
	public static final String MONTO = "monto";
	/** Atributo que representa el valor de IP_TERMINAL:String */
	public static final String IP_TERMINAL = "ipTerminal";
	/** Atributo que representa el valor de idSession:String */
	public static final String ID_SESSION = "idSession";
	/** Atributo que representa el valor de HOSTNAME:String */
	public static final String HOSTNAME = "hostname";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String APLICACION_VALUE = "WFOperaciones";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String COD_CLIENTE = "codCliente";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String APLICACION = "aplicacion";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String CODIGO_OPERACION = "codigoOperacion";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String CUENTA_DESTINO = "cuentaDestino";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String DESTINO_OPERACION = "destinoOperacion";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String FECH_APLICACION = "fechaAplicacion";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String REFERENCIA = "referencia";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String NOMBRE_ARCHIVO = "nombreArchivo";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String ID_INST_WEB = "idenInstWeb";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String DESC_OPERACION = "descOperacion";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String CONTRATO = "contrato";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String CTA_ORIGEN = "ctaOrigen";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String CTA_DESTINO = "ctaDest";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String NUM_TITULAR = "numTitular";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String BANCO_DESTINO = "bankDestino";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String TIPO_CAMBIO = "tipCambio";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String FECH_PROGRAMADA = "fecProg";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String COD_ERROR = "codError";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String DESC_ERROR = "descError";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String ESTATUS = "estatus";
	/** Atributo que representa el valor de APLICACION_VALUE:String */
	public static final String TIP_MONEDA = "tipMoneda";
	/** Atributo que representa el valor de ESPACIO_BLANCO */
	public static final String ESPACIO_BLANCO = " ";
	/** Atributo que representa el valor de BANCO SANTANDER */
	public static final String BANCO_SANTANDER = "BANCO SANTANDER";
	/** Define un guion largo para los formatos de contrato*/
	public static final String GUION_BAJO_LARGO = "______________________________";
	/** Atributo que representa el valor de BESP_CONS */
	public static final String BESP_CONS = "BESP-202";
	/** Atributo que representa el valor de BESP_157_CONS */
	public static final String BESP_157_CONS = "BESP-157";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String SANTANDER_CONS = "SANTANDER";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String ELAVON_CONS = "ELAVON";
	/** Atributo que representa el valor de PROSA_CONS */
	public static final String PROSA_CONS = "PROSA";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String CERO_CONS = "0";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String FOLIO_CONS = "folio";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String USER_CREADOR = "usuarioCreador";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String USER_CORREO = "usuarioCorreo";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String USER_SUCURSAL = "usuarioSucursal";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String APOD_NOMBRES = "apoderadoNombres";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String APOD_PATERNO = "apoderadoApePaterno";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String APOD_MATERNO = "apoderadoApeMaterno";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String DESCRIP_GIRO = "giroDescri";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String COMERCIO_CONS = "comercio";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String DOC_CONST = "documentos";
	/** Atributo que representa el valor tipoDocumentoIdentificacion*/
	public static final String TIPO_DOC_IDE_CONST = "tipoDocumentoIdentificacion";
	/** Atributo que representa el valor tipoDocumentoIdentificacion*/
	public static final String CIUDAD_CONST = "ciudadFirma";
	/** Atributo que representa el valor tipoDocumentoIdentificacion*/
	public static final String ESTADO_CONST = "estadoFirma";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String SOLIC_CONST = "solicitud";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String B_CONST = "B";
	/** Atributo que representa el valor de SANTANDER_CONS */
	public static final String AFILACION_CONS = "afiliacion";	
	/** Atributo que representa el valor de name para respuesta de contrato */
	public static final String NAME = "name";
	/** Atributo que representa el valor de file para respuesta de contrato */
	public static final String FILE = "file";
	/** Atributo que representa el valor de folio para respuesta de contrato */
	public static final String FOLIO = "folio";
	/** Atributo que representa la constantes para indicar el resultado de appian */
	public static final String JSON_APPIAN = "JSON TO APPIAN: {0}";
	 /** Atributo que representa el valor de TIPO_DOCUMENTAL_POR_DEFECTO:String */
	public static final String  TIPO_DOCUMENTAL_POR_DEFECTO = "Generico";
	/** Constante campo sp. */
	public static final String ERROR_CODE = "S_ERR_CODE";
	/** Mapa que representa los tipos de solicitud para el flujo MSI */
	private static final Map<String, String> TIPO_SOLICITUD = new HashMap<>();
	/** Constante para el error. */
	public static final String ERROR_MSG = "S_ERR_MSG";
	 /** Atributo que representa el valor de E_FOLIO:String */
	public static final String E_FOLIO = "E_FOLIO";
	 /** Atributo que representa el valor de ERROR_CODE:String */
	public static final String SLA = "S_FECHA_HORA_SLA";
	 /** Atributo que representa el valor de CALCULO_SLA_FLUJO:String */
	public static final String CALCULO_SLA_FLUJO = "PKG_SIO_MX_FLUJOS.SP_SIO_UPD_SOLIC_SLA_01";
	 /** Atributo que representa el valor de SP_VALIDACION_LAYOUT:String */
	public static final String SP_VALIDACION_LAYOUT = "PKG_SIO_MX_FLUJOS.SP_SIO_LEC_VALID_LAYOUT_01";
	 /** Atributo que representa el valor de E_ID_LAYOUT:String */
	public static final String E_ID_LAYOUT = "E_ID_LAYOUT";
	 /** Atributo que representa el valor de E_OPER:String */
	public static final String E_OPER = "E_OPER";
	
	static {
		getTipoSolicitud().put("1", "Alta de Solicitud MSI");
		getTipoSolicitud().put("2", "Baja de Comercio MSI");
		getTipoSolicitud().put("3", "Baja de Afiliaciones MSI");
		getTipoSolicitud().put("4", "Cambio de Sobre Tasa MSI");
	}
	
	/**
	 * Descripcion: Constructor para no crear objetos del tipo APPConstants.java 
	 * Creado por : 1697401 Fecha Creacion: 11/09/2019
	 */
	private APPConstants() {
		super();
	}


	/**
	 * @return the tipoSolicitud
	 */
	public static Map<String, String> getTipoSolicitud() {
		return TIPO_SOLICITUD;
	}
	
}
