package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Descripcion: Creacion de la clase principal para el config-server
 *
 * @author sergi
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	/**
	 * 
	 * Descripcion : Metodo que se encarga del deploy del config server.
	 * @author sergi
	 * @since  16 sep. 2020
	 * @param args Devuelve la propiedad del tipo void
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
