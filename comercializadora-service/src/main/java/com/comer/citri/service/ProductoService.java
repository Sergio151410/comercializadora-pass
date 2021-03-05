/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comer.citri.service;

import com.comer.citri.model.ProductoBean;
import com.comer.citri.model.entitys.ProductoEntity;
import com.comer.citri.repository.IProductoRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;

/**
 *
 * @author Lenovo-
 */
@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductoService.class);

    @Override
    public ProductoBean create(ProductoBean producto) {
        ProductoEntity productoEntity = new ProductoEntity();

        try {
            productoEntity.setNombre(producto.getDescripcionProducto());
            productoEntity.setPrecio(producto.getPrecio());
            productoEntity.setIcono(producto.getIcono());
            productoEntity.setStatus(1);

            productoEntity = iProductoRepository.saveAndFlush(productoEntity);

            producto.setId(productoEntity.getIdProd());

        } catch (Exception e) {
            LOGGER.error("Error al tratar fecha ", e);
            e.printStackTrace();
            producto = null;

        } finally {
            return producto;
        }
    }

    @Override
    public ProductoBean update(ProductoBean producto) {
        ProductoEntity productoEntity = iProductoRepository.getOne(producto.getId());

        try {
            productoEntity.setNombre(producto.getDescripcionProducto());
            productoEntity.setPrecio(producto.getPrecio());
            productoEntity.setIcono(producto.getIcono());
            productoEntity.setStatus(1);

            productoEntity = iProductoRepository.saveAndFlush(productoEntity);

        } catch (Exception e) {
            LOGGER.error("Error al tratar fecha ", e);
            e.printStackTrace();
            producto = null;

        } finally {
            return producto;
        }
    }

    @Override
    public boolean delete(int id) {
        ProductoEntity productoEntity = iProductoRepository.getOne(id);
        boolean response = false;
        try {
            productoEntity.setStatus(0);

            productoEntity = iProductoRepository.saveAndFlush(productoEntity);
            response = true;
        } catch (Exception e) {
            LOGGER.error("Error al tratar fecha ", e);
            e.printStackTrace();

        } finally {
            return response;
        }
    }

    @Override
    public Map<String, Object> getProductos(int pageNumber, int offset, String desc, String order) {

        Pageable pageOptions = PageRequest.of(pageNumber, offset, order.equals("asc") ? Sort.by("nombre_prod").ascending() : Sort.by("nombre").descending());
        Page<ProductoEntity> page = iProductoRepository.findAll(pageOptions);
        List<ProductoEntity> productos = new ArrayList<ProductoEntity>();
       

        Map<String, Object> response = new HashMap<>();
        response.put("productos", productos);
        response.put("currentPage", page.getNumber());
        response.put("totalItems", page.getTotalElements());
        response.put("totalPages", page.getTotalPages());

        return response;
    }

}
