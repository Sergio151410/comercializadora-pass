package com.comer.citri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.comer.citri", "com.comer.citri.controller"})
@EnableJpaRepositories
@EnableSwagger2
public class ComercializadoraServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercializadoraServiceApplication.class, args);
	}

}
