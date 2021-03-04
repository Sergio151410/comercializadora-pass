package com.comer.citri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comer.citri.model.entitys.ProductoEntity;

public interface IProductoRepository extends JpaRepository<ProductoEntity, Integer>{

}
