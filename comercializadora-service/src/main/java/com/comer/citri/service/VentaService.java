package com.comer.citri.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comer.citri.model.FormVentaBean;
import com.comer.citri.model.ProductoVentaBean;
import com.comer.citri.model.VentaBean;
import com.comer.citri.model.VentaResponseBean;
import com.comer.citri.model.entitys.DVentaEntity;
import com.comer.citri.model.entitys.VentaEntity;
import com.comer.citri.repository.IClienteRepository;
import com.comer.citri.repository.IDVentaRepository;
import com.comer.citri.repository.IEmpleadoRepository;
import com.comer.citri.repository.IProductoRepository;
import com.comer.citri.repository.IVentaRepository;
import com.comer.citri.utils.UtilTicket;

@Service
public class VentaService implements IVentaService {

	
	@Autowired 
	private IVentaRepository ventaRepository;
	
	@Autowired 
	private IDVentaRepository detalleRepository;

	@Autowired 
	private IProductoRepository productoRepository;
	
	@Autowired 
	private IClienteRepository clienteRepository;
	
	@Autowired 
	private IEmpleadoRepository empleadoRepository;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VentaService.class);
	
	@Override
	public VentaResponseBean generar(VentaBean venta) {
		VentaResponseBean response = new VentaResponseBean();
		VentaEntity ventaGenerated = new VentaEntity();
		try {
			ventaGenerated.setFechaVenta(new SimpleDateFormat("yyyy/MM/dd").parse(venta.getFecha()));
			ventaGenerated.setTotalVenta(venta.getgTotal());
			ventaGenerated.setCliente(venta.getCliente().getClave());
			ventaGenerated.setEmpleado(venta.getEmpleado().getClave());
			
			ventaGenerated = ventaRepository.saveAndFlush(ventaGenerated);
			
			venta.setFolio(ventaGenerated.getFolioVenta());
			
			for (ProductoVentaBean det : venta.getDetalle()) {
				DVentaEntity rowTmp = new DVentaEntity();
				rowTmp.setFolioVenta(ventaGenerated.getFolioVenta());
				rowTmp.setIdProd(det.getFruta().getId());
				rowTmp.setSaldoAnt(1);
				rowTmp.setSaldoAct(1);
				detalleRepository.saveAndFlush(rowTmp);
			}
			UtilTicket.imprimirTicket(llenaTable(venta), venta);
			response.setFolio(String.valueOf(ventaGenerated.getFolioVenta()));
		} catch (ParseException e) {
			LOGGER.error("Error al tratar fecha ", e);
			e.printStackTrace();
		} catch (Exception e) {
			LOGGER.error("Error al generar venta ", e);
		}
	
	
                return response;
	}

	private JTable llenaTable(VentaBean venta) {
		String []columns = {"ID", "DESCRIPCION", "KG", "PRECIO", "IMPORTE"};
		JTable tablaT = null;
		if (venta.getDetalle() !=  null && !venta.getDetalle().isEmpty())  {
			
		
		int alto = venta.getDetalle().size();
		
		String [][] rows = new String[alto][5];
		int cont  = 0;				
		for (ProductoVentaBean prod : venta.getDetalle()) {
			String [] row = new String[5];
			row[0] = String.valueOf(cont + 1);
			row[1] = prod.getFruta().getNombre();
			row[2] = String.valueOf(prod.getCantidad());
			row[3] = String.valueOf(prod.getCosto());
			row[4] = String.valueOf(prod.getTotal());
			rows[cont] = row;
			cont++;
		}
		
		tablaT = new JTable(rows, columns);
		
		}
		
		return tablaT;
	}

	@Override
	public FormVentaBean getCatalogo() {
		FormVentaBean response = new FormVentaBean();
		response.setClientes(clienteRepository.findAll());
		response.setEmpleados(empleadoRepository.findAll());
		response.setProductos(productoRepository.findAll());
		return response;
	}

}
