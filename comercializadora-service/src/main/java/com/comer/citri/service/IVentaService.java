package com.comer.citri.service;

import com.comer.citri.model.FormVentaBean;
import com.comer.citri.model.VentaBean;
import com.comer.citri.model.VentaResponseBean;

public interface IVentaService {

	VentaResponseBean generar(VentaBean venta);
	
	FormVentaBean getCatalogo();
}
