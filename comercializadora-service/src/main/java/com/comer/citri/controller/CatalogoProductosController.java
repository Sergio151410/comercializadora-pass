/**
 * Comercializadora Citricos G&M
 * Todos los derechos reservados
 * CatalogoProductosController.java
 * Control de versiones:
 * Version  Date/Hour               By                  				Company     Description
 * -------  -------------------     --------------------------------    --------    -----------------------------------------------------------------
 * 1.0      21 sep. 2020 11:47:47	    [Sergio Jair Flores Luna]     			  SYM		    Creacion de CatalogoProductosController.java
 */
package com.comer.citri.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.comer.citri.constants.APPConstants;
import com.comer.citri.exception.BusinessException;
import com.comer.citri.global.model.ResponseOperacionBean;
import com.comer.citri.model.ProductoBean;
import com.comer.citri.model.BajaProductosBean;
import com.comer.citri.model.CatalogoProductosBean;
import com.comer.citri.model.ModificacionProductosBean;
import com.comer.citri.service.IProductoService;

import io.swagger.annotations.Api;
import java.io.File;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.codec.binary.Base64;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Descripcion:
 *
 * @author sergi
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/catalogo")
@Api
public class CatalogoProductosController {

    /**
     * Nombre: LOGGER Tipo: Logger Descripcion: Declaracion de variable LOGGER
     * para la clase. El cual es requerido para desplegar mensajes en consola.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CatalogoProductosController.class);

//	/**
//	 * 
//	 * Nombre: productoCat
//	 * Tipo: ICrudCatalogoProductoService
//	 * Descripcion: Declaracion de variable productoCat del tipo ICrudCatalogoProductoService
//	 */
    @Autowired
    private IProductoService productoService;

    /**
     *
     * Descripcion :
     *
     * @author sergi
     * @since 21 sep. 2020
     * @return Devuelve la propiedad del tipo
     * ResponseEntity<ResponseOperacionBean>
     */
    @RequestMapping(path = "agregar_producto", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseOperacionBean> altaCatalogosProducto(@RequestBody ProductoBean alta) {
        LOGGER.info("altaCatalogosProducto-------------------------------------BEGIN");
        ResponseOperacionBean response = new ResponseOperacionBean();
        HttpStatus status = HttpStatus.OK;
        //			Map<String, Object> resultado = productoCat.altaProductos(alta);
        Map<String, Object> resultado = null;
        response.setResult(resultado);
        response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
        LOGGER.info("altaCatalogosProducto-------------------------------------FINISH");
        return new ResponseEntity<ResponseOperacionBean>(response, status);
    }

    /**
     *
     * Descripcion :
     *
     * @author sergi
     * @since 21 sep. 2020
     * @return Devuelve la propiedad del tipo
     * ResponseEntity<ResponseOperacionBean>
     */
    @RequestMapping(path = "bajas_catalogos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseOperacionBean> bajasCatalogosProducto(@RequestBody BajaProductosBean baja) throws BusinessException {
        LOGGER.info("bajasCatalogosProducto-------------------------------------BEGIN");
        ResponseOperacionBean response = new ResponseOperacionBean();
        HttpStatus status = HttpStatus.OK;
        Map<String, Object> resultado = null;
        response.setResult(resultado);
        response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
        LOGGER.info("bajasCatalogosProducto-------------------------------------FINISH");
        return new ResponseEntity<ResponseOperacionBean>(response, status);
    }

    /**
     *
     * Descripcion :
     *
     * @author sergi
     * @since 21 sep. 2020
     * @return Devuelve la propiedad del tipo
     * ResponseEntity<ResponseOperacionBean>
     */
    @RequestMapping(path = "modificacion_catalogos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseOperacionBean> modifiacionCatalogosProducto(@RequestBody ModificacionProductosBean mod) throws BusinessException {
        LOGGER.info("modifiacionCatalogosProducto-------------------------------------BEGIN");
        ResponseOperacionBean response = new ResponseOperacionBean();
        HttpStatus status = HttpStatus.OK;
        Map<String, Object> resultado = null;
        response.setResult(resultado);
        response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
        LOGGER.info("modifiacionCatalogosProducto-------------------------------------FINISH");
        return new ResponseEntity<ResponseOperacionBean>(response, status);
    }

    /**
     *
     * Descripcion :
     *
     * @author Daniel Alonso Martinez Torres
     * @since 21 sep. 2020
     * @return Devuelve la propiedad del tipo
     * ResponseEntity<ResponseOperacionBean>
     */
    @GetMapping(path = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseOperacionBean> consultaCatalogosProducto() throws BusinessException {

        LOGGER.info("consultaCatalogosProducto-------------------------------------BEGIN");
        ResponseOperacionBean response = new ResponseOperacionBean();
        Map<String, Object> jsonMap = new HashMap<String, Object>();

        jsonMap = productoService.getProductos(0, 0, "", "asc");
        HttpStatus status = HttpStatus.OK;
        response.setResult(jsonMap);
        response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
        System.out.println(response.getResult());
        System.out.println("jsonMap");
        System.out.println(jsonMap);
        LOGGER.info("consultaCatalogosProducto-------------------------------------FINISH");
        return new ResponseEntity<ResponseOperacionBean>(response, status);
    }

    @RequestMapping(path = "save_image", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseOperacionBean> saveImage(@RequestParam(name = "base64str") String codedImage)
            throws BusinessException {
        ResponseOperacionBean response = new ResponseOperacionBean();
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        try {
            String rutaCompletaNombreArchivo = "C:\\Develop\\Imagenes\\";
            String nombreArchivo = "product";
            String base64str = codedImage;
            base64str = base64str.split(",")[1];
            String filePath = rutaCompletaNombreArchivo + File.separator + nombreArchivo + new Date().getTime() + ".jpg";
            File file = new File(filePath);
            byte[] bytes = Base64.decodeBase64(base64str);
            FileUtils.writeByteArrayToFile(file, bytes);
            jsonMap.put("filePath", filePath);
            HttpStatus status = HttpStatus.OK;
            response.setResult(jsonMap);
            response.setStatus(APPConstants.KEY_APPLICATION_ESTATUS_OK);
            System.out.println(response);
            LOGGER.info("consultaCatalogosProducto-------------------------------------FINISH");
            return new ResponseEntity<ResponseOperacionBean>(response, status);
        } catch (Exception e) {
            LOGGER.error("Error al tratar fecha ", e);
            e.printStackTrace();
        } finally {
            return null;
        }
    }

}
