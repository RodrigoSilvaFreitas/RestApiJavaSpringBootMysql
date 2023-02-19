package com.database;

import com.api.restapi.entidade.Clientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioClientes extends JpaRepository<Clientes, Long>{
    
}
