/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * ServerConfiguration.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 14:00:36	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de ServerConfiguration.java
 */
package com.comer.citri.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
/**
 * Descripcion:
 *
 * @author sergi
 *
 */
public class ServerConfiguration {
	
	/**
	 * Descripcion: Creacion del Bean LocaleChangeInterceptor
	 * Creado por    : 1697401
	 * @return LocaleChangeInterceptor
	 */
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	/**
	 * Descripcion: Creacion del Bean LocaleResolver para definir el lenguaje
	 * Creado por    : 1697401
	 * @return LocaleResolver
	 */
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(new Locale("es", "MX"));
		return slr;
	}

	/**
	 * Descripcion: Inicia ResourceBundleMessageSource, para la internacionalizacion del aplicativo
	 * Creado por    : 1697401
	 * @return ResourceBundleMessageSource
	 */
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasenames("i18n/errors","i18n/campos");
		source.setDefaultEncoding("UTF-8");
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}

}
