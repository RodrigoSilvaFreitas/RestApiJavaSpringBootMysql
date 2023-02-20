package com.api.restapi;

import com.api.restapi.entidade.Cliente;
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
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> findAll(Cliente cliente) {
        return service.findAll(cliente);
    }

    @PostMapping
    public void create(@RequestBody Cliente cliente) {
        service.create(cliente);
    }

    @PutMapping
    public void save(@RequestBody Cliente cliente) {
        service.save(cliente);
    }

    @DeleteMapping
    public void delete(@RequestBody Cliente cliente) {
        service.delete(cliente);
    }
}