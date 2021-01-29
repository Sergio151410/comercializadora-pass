/**
 * 
 */
package com.comer.citri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ISBAN Mexico - (c) Banco Santander Central Hispano
 * Todos los derechos reservados
 * SwaggerConfig.java
 * Control de versiones:
 * Version  Date/Hour               By                 				 	Company     Description
 * -------  -------------------     ----------------    				--------    -----------------------------------------------------------------
 * 1.0      30/09/2019/12:08:43	    [470584: Ricardo Martinez]          TCS		Creacion de clase SwaggerConfig.java
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * Descripcion : Crea un Bean Docket de Swagger para la API
     * @author 827026
     * @since  18/02/2020
     * @return Devuelve la propiedad del tipo Docket
     */
    @Bean
    public Docket api() {
    	// configuracion por defecto
    	// para swagger
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(apiEndPointsInfo())
                .select()
                    .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                    .paths(PathSelectors.any())
                    .build()
                .pathMapping("/")
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false);
    }

    /**
     * Descripcion : Genera la informacion de la API
     * @author 827026
     * @since  18/02/2020
     * @return Devuelve la propiedad del tipo ApiInfo
     */
    private ApiInfo apiEndPointsInfo() {
    	// configuracion por defecto
    	// para swagger
        return new ApiInfoBuilder()
                .title("Front Solicitudes Workflow Operaciones")
                .description("Workflow Operaciones")
                .version("0.1-SNAPSHOT")
                .build();
    }
}

