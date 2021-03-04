package com.comer.citri.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comer.citri.exception.BusinessException;
import com.comer.citri.model.FormVentaBean;
import com.comer.citri.model.VentaBean;
import com.comer.citri.model.VentaResponseBean;
import com.comer.citri.service.IVentaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin("*")
@RequestMapping("/venta")
@Api
public class VentaController{

	private static final Logger LOGGER = LoggerFactory.getLogger(VentaController.class);
	
	@Autowired
	private IVentaService ventaService;
	
	@ApiOperation(value = "Genera la venta", notes = "Generar Venta", response=ResponseEntity.class, httpMethod="POST", code = 200)
	@PostMapping(value = "/generar", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	@Transactional(value = "transactionManager")
	public ResponseEntity<VentaResponseBean> generarVenta(@RequestBody VentaBean venta,
			@RequestParam boolean adeudo) throws BusinessException {
		LOGGER.debug("#################### Inicia metodo para generar venta");
		LOGGER.debug("#################### Adeudo {} ", adeudo);
		
		VentaResponseBean response = null;;
		/**llamada al service */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		venta.setFecha(dtf.format(now));
		venta.setHora(dtf1.format(now));
		response = ventaService.generar(venta);
		
		LOGGER.debug("#################### Fin metodo para generar venta");
		 return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Obtener catalogos", notes = "Obtiene data para los catalogos", response=ResponseEntity.class, httpMethod="GET", code = 200)
	@GetMapping(value = "/retrieve",  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FormVentaBean> getData() throws BusinessException {
		LOGGER.debug("#################### Inicia metodo para obtener catalogos");

		
		FormVentaBean response = ventaService.getCatalogo();
		
		LOGGER.debug("#################### Fin metodo para obtener catalogos");
		 return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
