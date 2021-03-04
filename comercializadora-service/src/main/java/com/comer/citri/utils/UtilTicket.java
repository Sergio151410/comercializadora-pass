package com.comer.citri.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comer.citri.model.VentaBean;

public final class UtilTicket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -660483692403930051L;

	private static final Logger LOGGER = LoggerFactory.getLogger(UtilTicket.class);
	
	public static void imprimirTicket(JTable jtblVenta,VentaBean venta){
		try {

		    PrinterMatrix printer = new PrinterMatrix();
		    Extenso e = new Extenso();

		    e.setNumber(20.30);
		    //Definir el tamanho del papel para la impresion de dinamico y 32 columnas
		    int filas = jtblVenta.getRowCount();
		    int tamano = filas+40;
		    printer.setOutSize(tamano, 80);

		    //Imprimir = 1ra linea de la columa de 1 a 32
		    printer.printTextWrap(0, 1, 5, 80, "===================================================================");
		    printer.printTextWrap(1, 1, 27, 80, "CITRICOS SELECTOS G & M"); //Nombre establecimiento
		    printer.printTextWrap(2, 1, 30, 80, "CENTRAL DE ABASTOS"); //Barrio
		    printer.printTextWrap(3, 1, 26, 80, "BODEGA B22 QUERETARO, QRO."); //Direccion
		    printer.printTextWrap(4, 1, 3, 80, ""); //Codigo Postal
		    printer.printTextWrap(5, 1, 3, 80, "Folio: " + venta.getFolio()); //Codigo Postal
		    printer.printTextWrap(6, 1, 3, 41, "Fecha: " + venta.getFecha()); //Aqui va la fecha de recibo
		    printer.printTextWrap(6, 1, 38, 80, "Hora: " + venta.getHora()); //Aqui va la hora de recibo
		    printer.printTextWrap(7, 1, 3, 80, "Atiende: " + venta.getEmpleado().getNombre()); //Nombre Cajero
		    printer.printTextWrap(8, 1, 3, 80, "Cliente: " + venta.getCliente().getNombre());//Nombre del Cliente
		    printer.printTextWrap(9,1, 5, 80, "——————————–——————————–——————————–——————————–——–———–——–—–———–——–———");
		    printer.printTextWrap(10,1, 7, 80, "ID   DESCRIPCION                    CANT       PRECIO   IMPORTE");
		    printer.printTextWrap(11,1, 0, 80, " ");

		    for (int i = 0; i < filas; i++) {
		        int p = 13+i; //Fila

		        printer.printTextWrap(p , 1, 7, 19 , jtblVenta.getValueAt(i,0).toString());
		        printer.printTextWrap(p , 1, 12, 38 , jtblVenta.getValueAt(i,1).toString());
		        printer.printTextWrap(p , 1, 43, 49, jtblVenta.getValueAt(i,2).toString() + "KG");

		        String pre= printer.alinharADireita(10, jtblVenta.getValueAt(i,3).toString());
		        printer.printTextWrap(p , 1, 50, 60, pre);
		        
		        String pre1= printer.alinharADireita(10, jtblVenta.getValueAt(i,4).toString());
		        printer.printTextWrap(p , 1, 60, 80, pre1);

		    }

		    String tot= printer.alinharADireita(10, String.valueOf(venta.getgTotal()));
		    printer.printTextWrap(filas+18, 1, 5, 80, "Total a pagar: ");
		    printer.printTextWrap(filas+18, 1, 20, 80, "$"+tot);

		    printer.printTextWrap(filas+21, 1, 5, 80, "——————————–——————————–——————————–——————————–——–———–——–—–———–——–———");
		    printer.printTextWrap(filas+22, 1, 26,80, "!GRACIAS POR SU COMPRA!");
		    printer.printTextWrap(filas+23, 1, 5,80, "===================================================================");


		    ///CREAR ARCHIVO EN CARPETA DEL PROYECTO PARA PEDIDOS
		    printer.toFile("C:\\tmp\\impresion.txt");
		    FileInputStream inputStream = null;

		    try {
		        inputStream = new FileInputStream("C:\\tmp\\impresion.txt");
		    } catch (FileNotFoundException ex) {
		        ex.printStackTrace();
		        LOGGER.error("Error al guardar");
		    }
		    if (inputStream == null) {
		        return;
		    }

		    DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
		    Doc document = new SimpleDoc(inputStream, docFormat, null);
		    PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
		    PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

		    if (defaultPrintService != null) {
		        DocPrintJob printJob = defaultPrintService.createPrintJob();
		        try {
		            printJob.print(document, attributeSet);
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    } else {
		        LOGGER.error("No existen impresoras instaladas");
		    }

		    inputStream.close();

		    } catch (Exception e) {
		    	LOGGER.error("Error al imprimir "+e);
		    }
	}
}
