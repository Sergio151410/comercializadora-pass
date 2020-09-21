/**
 * Comercializadora Citricos G&M
 * Todos los derechos reservados
 * Utils.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:14:40	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de Utils.java
 */
package com.comer.citri.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class Utils {
	
	 /** Constante para definir el LOGGER de esta Utileria*/
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);

    
	 /** Atributo que representa el valor de DATE_FORMAT_YYYYMMDD_HH_MM_SS:SimpleDateFormat */
	public static final SimpleDateFormat DATE_FORMAT_YYYYMMDD_HH_MM_SS = new SimpleDateFormat("yyyy/MM/dd HH:mm:sss");
	
	/**Atributo que representa la constante de formato de fechas dd/MM/yyyy */
	public static final String KEY_APPIAN_FORMAT_DDMMYYYY_HHMM_A="dd/MM/yyyy hh:mm a";

	 /** Atributo que representa el valor de sdf:SimpleDateFormat */
	private static SimpleDateFormat SDF_TIME = new SimpleDateFormat(KEY_APPIAN_FORMAT_DDMMYYYY_HHMM_A);
	
    /**
     * Constructor para evitar instancias
     */
    private Utils() {
    	// Constructor privado
    }

    /**
     * 
     * Descripcion : Clona un array
     * @author 1697401
     * @since  05/11/2019
     * @param array Arreglo 
     * @param tclass tipo del arreglo
     * @return Devuelve un arreglo
     */
    public static <T> T[] clone(T[] array, Class<T> tclass){
        if (array!=null){
            return array.clone();
        } else {
        	UtilsCopiaArray<T> copia = UtilsCopiaArray.create(tclass);
            return copia.getA();
        }
    }
    
    

    /**
     * Clona un array
     * @param array Arreglo de boolean
     * @return Devuelve un arreglo
     */
    public static boolean[] clone(boolean[] array){
        if (array!=null){
            return array.clone();
        } else {
            return new boolean[]{};
        }
    }

    /**
     * Clona una lista
     * @param list Listado generico
     * @return Regresa una lista generica
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> clone(List<T> list){
        if (list!=null){
            return list;
        } else {
            return (List<T>)(new ArrayList<T>()).clone();
        }
    }
    
    /**
     * Clona una lista
     * @param list Listado generico
     * @return Regresa una lista generica
     */
    public static <T> List<T> cloneList(List<T> list){
        return list;
    }
    
    
    /**
     * Descripcion : Metodo con la finalidad de transformar un String en JSON
     * @author 827026
     * @since  07/12/2018
     * @param cadenaJson Cadena que representa un JSON en formato String
     * @return Devuelve la propiedad del tipo JSONObject
     */
    public static JsonNode stringToJSON(String cadenaJson) {
        JsonNode json = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.readTree(cadenaJson);
        } catch (JsonProcessingException e) {
            LOGGER.error("ERROR", e);
        } catch (IOException e) {
            LOGGER.error("ERROR", e);
        }
        return json;
    }
    
    /**
     * Descripcion   : Metodo que recupera como cadena el contenido de un JsonNode
     * Creado por    : [470584: Ricardo Martinez]
     * Fecha Creacion: 18/10/2019
     * @param node JsonNode
     * @return Cadena contenida en el JsonNode
     */
    public static String jsonNodeToString(JsonNode node) {
    	if (node!=null && !node.isNull()) {
    		return node.asText();
    	}
    	return null;
    }
    
    /**
     * Descripcion   : Metodo que recupera una fecha del JsonNode y la convierte a una cadena con formato fecha
     * Creado por    : [470584: Ricardo Martinez]
     * Fecha Creacion: 18/10/2019
     * @param node JsonNode
     * @return Cadena con formato Fecha contenida en el JsonNode
     */
    public static String jsonNodeDateToString(JsonNode node) {
    	if (node!=null && !node.isNull()) {
			/** Se obtiene valor long para la conversion a fecha.*/
			long dateLong = node.asLong();
			/** Valor long se convierte en fecha.*/
			Date conver = new Date(dateLong);
			/** Se le agrega un formato a la fecha obtenida.*/
			return DATE_FORMAT_YYYYMMDD_HH_MM_SS.format(conver);
    	}
		return null;
    }
    
	/**
	 * Descripcion   : Metodo que realiza la conversion de un tipo java.sql.Timestamp a java.util.Date
	 * Creado por    : 470584 - [Ricardo Martinez Hernandez]
	 * Fecha Creacion: 04/09/2018
	 * @param date Timestamp
	 * @return Date
	 */
	public static String timestampToStringAppian(java.sql.Timestamp date){
		if (date!=null){
			return SDF_TIME.format(new Date(date.getTime()));
		}
		return null;
	}


}
