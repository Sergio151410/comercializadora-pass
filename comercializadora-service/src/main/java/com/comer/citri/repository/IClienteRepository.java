package com.comer.citri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comer.citri.model.entitys.ClienteEntity;

public interface IClienteRepository extends JpaRepository<ClienteEntity, Integer>{

}
