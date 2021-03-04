package com.comer.citri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comer.citri.model.entitys.EmpleadoEntity;

public interface IEmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer>{

}
