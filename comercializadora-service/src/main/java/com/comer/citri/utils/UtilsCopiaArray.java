/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * UtilsCopiaArray.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:24:38	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de UtilsCopiaArray.java
 */
package com.comer.citri.utils;

import java.lang.reflect.Array;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class UtilsCopiaArray <T> {
	
	private T[] a;

	/**
	 * Descripcion: Constructor para crear objetos del tipo UtilsCopiaArray.java
	 * Creado por    : 1697401
	 * Fecha Creacion: 05/11/2019
	 * @param tclass propiedad que contien los datos del Generico.
	 */
	public UtilsCopiaArray(Class<T> tclass) {
		a = (T[]) Array.newInstance(tclass, 0);
	}

	/**
	 * 
	 * Descripcion : Getter de la propiedad Generica.
	 * @author 1697401
	 * @since  05/11/2019
	 * @return Devuelve la propiedad del tipo T[]
	 */
	public T[] getA() {
		return a.clone();
	}

	/**
	 * 
	 * Descripcion : Create de la propiedad Generica.
	 * @author 1697401
	 * @since  05/11/2019
	 * @param tclass porpiedad que contiene los datos del Generico.
	 * @return Devuelve la propiedad del tipo UtilsCopiaArray<T>
	 */
	public static <T> UtilsCopiaArray<T> create(Class<T> tclass) {
		return new UtilsCopiaArray<T>(tclass);
	}

}
