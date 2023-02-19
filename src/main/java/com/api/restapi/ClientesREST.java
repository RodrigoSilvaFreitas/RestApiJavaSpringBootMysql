package com.api.restapi;

import com.api.restapi.entidade.Clientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ClientesREST {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Clientes> findAll(Clientes cliente) {
        return service.findAll(cliente);
    }

    @PostMapping
    public void create(@RequestBody Clientes clientes) {
        service.create(clientes);
    }

    @PutMapping
    public void save(@RequestBody Clientes clientes) {
        service.save(clientes);
    }

    @DeleteMapping
    public void delete(@RequestBody Clientes clientes) {
        service.delete(clientes);
    }
}