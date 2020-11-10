/**
 * Banco Santander (México) S.A., Institución de Banca Múltiple, Grupo Financiero Santander México
 * Todos los derechos reservados
 * BdComercialCitricosConfig.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 13:53:40	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de BdComercialCitricosConfig.java
 */
package com.comer.citri.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.comer.citri.config.model.ConfiguracionBDConercializadoraBean;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass=false)
@EnableJdbcRepositories(basePackages = "com.comer.citri.repository")
public class BdComercialCitricosConfig {
	
	/**
	 * 
	 * Nombre: configuracion
	 * Tipo: ConfiguracionBDConercializadoraBean
	 * Descripcion: Declaracion de variable configuracion del tipo ConfiguracionBDConercializadoraBean
	 */
	@Autowired
	private ConfiguracionBDConercializadoraBean configuracion;
	
	/**
	 * 
	 * Descripcion : Bean de configuracion de hikari, que es el administrador del pool de conexiones, permite
     * 				 configurar los datos de acceso a base de datos, la cantidad de conexiones, etc.
	 * @author 1697401
	 * @since  12/09/2019
	 * @return Devuelve la propiedad del tipo HikariConfig
	 */
	@Bean
	@Primary
    public HikariConfig hikariConfigProcesos() {
    	HikariConfig config =  new HikariConfig();
    	config.setJdbcUrl(configuracion.getProcesosUrl());
    	config.setDriverClassName(configuracion.getProcesosDriverClassName());
    	config.setPassword(configuracion.getProcesosPassword());
    	config.setUsername(configuracion.getProcesosUsername());
    	return config;
    }
	
	 /**
	 * 
	 * Descripcion : Bean de fuente de datos, se crea con la configuracion de hikari y de aqui podemos recuperar las
     * 				 conexiones para realizar los accesos a datos.
	 * @author 1697401
	 * @since  12/09/2019
	 * @return Devuelve la propiedad del tipo DataSource
	 */
	@Bean("dataSourceProcesos")
	@Primary
	public DataSource dataSourceProcesos() {
		return new HikariDataSource(hikariConfigProcesos());
	}
	
	/**
	 * 
	 * Descripcion : Metodo que retorna el JdbcTemplate para operaciones con parametros nombrados
	 * @author 1697401
	 * @since  12/09/2019
	 * @param dsProcesos datasource de base de datos proceso externo
	 * @return Devuelve la propiedad del tipo NamedParameterJdbcOperations
	 */
	@Bean("operationsProcesos")
	@Primary
	public NamedParameterJdbcOperations operationsProcesos(@Qualifier("dataSourceProcesos")DataSource dsProcesos) {
		return new NamedParameterJdbcTemplate(dsProcesos);
	}
	
	/**
	 * 
	 * Descripcion : Definicion del bean jdbcTemplatePrincipal para la inicializacion del JdbcTemplate
	 * @author 1697401
	 * @since  12/09/2019
	 * @param dsProcesos objeto que contiene las propiedades del DataSource.
	 * @return Devuelve la propiedad del tipo JdbcTemplate
	 */
	@Bean("jdbcTemplateProcesos")
	@Primary
	public JdbcTemplate getJdbcTemplateProcesos(@Qualifier("dataSourceProcesos")DataSource dsProcesos) {
		return new JdbcTemplate(dsProcesos);
	}
	
	/**
	 * 
	 * Descripcion : Metodo que retorna el manager de transacciones de plataforma
	 * @author 1697401
	 * @since  12/09/2019
	 * @param dsProcesos datasource de base de datos proceso externo
	 * @return Devuelve la propiedad del tipo PlatformTransactionManager
	 */
	@Bean("transaccionManagerProcesos")
	@Primary
    public PlatformTransactionManager transaccionManagerProcesos(@Qualifier("dataSourceProcesos")DataSource dsProcesos) {
    	return new DataSourceTransactionManager(dsProcesos);
    }

}
