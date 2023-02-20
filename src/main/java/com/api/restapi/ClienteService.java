package com.api.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.restapi.entidade.Cliente;
import com.database.RepositorioCliente;

public class ClienteService {
    @Autowired
    private RepositorioCliente repositorio;

    public List<Cliente> findAll(Cliente cliente) {
        return repositorio.findAll();
    }

    public void create(Cliente cliente) {
        var existe = repositorio.findByCpf(cliente.getCpf());
        if (existe.isEmpty()) {
            repositorio.save(cliente);
        } else {
            throw new RuntimeException("Cliente já cadastrado.");
        }
    }

    public void save(Cliente cliente) {
        if (cliente.getId() > 0) {
            repositorio.save(cliente);
        }
    }

    public void delete(Cliente cliente) {
        repositorio.delete(cliente);
    }
}