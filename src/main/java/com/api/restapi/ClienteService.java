package com.api.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.restapi.entidade.Clientes;
import com.database.RepositorioClientes;

public class ClienteService {
    @Autowired
    private RepositorioClientes repositorio;

    public List<Clientes> findAll(Clientes cliente) {
        return repositorio.findAll();
    }

    public void create(Clientes cliente) {
        RepositorioClientes.findBycpf(Clientes.getcpf());
        if (Clientes.cpf == null) {
            repositorio.create(cliente);
        } else {
            throw new RuntimeException("Cliente já cadastrado.");
        }
    }

    public void save(Clientes cliente) {
        if (cliente.getId() > 0) {
            repositorio.save(cliente);
        }
    }

    public void delete(Clientes cliente) {
        repositorio.delete(cliente);
    }
}