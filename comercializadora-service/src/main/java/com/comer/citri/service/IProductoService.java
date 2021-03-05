/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comer.citri.service;

import com.comer.citri.model.ProductoBean;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Daniel Alonso Martínez Torres
 */
public interface IProductoService {

    ProductoBean create(ProductoBean producto);

    ProductoBean update(ProductoBean producto);

    boolean delete(int id);

     Map<String, Object> getProductos(int page, int offset, String desc, String order);

}
