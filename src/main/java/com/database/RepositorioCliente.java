package com.database;

import com.api.restapi.entidade.Cliente;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> {
    public Optional<Cliente> findByCpf(String cpf);
}