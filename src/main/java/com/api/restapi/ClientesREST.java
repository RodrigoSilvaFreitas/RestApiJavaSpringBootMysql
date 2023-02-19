package com.api.restapi;

import com.api.restapi.entidade.Clientes;
import com.database.RepositorioClientes;

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
@RequestMapping("/clientes")
public class ClientesREST {
    @Autowired    
    private RepositorioClientes repositorio;

    @GetMapping
    public List<Clientes>listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Clientes clientes){
        repositorio.save(clientes);
    }
  
    @PutMapping
    public void alterar(@RequestBody Clientes clientes){
        if(clientes.getId()>0)
        repositorio.save(clientes);
    }

    @DeleteMapping
    public void excluir(@RequestBody Clientes clientes){
        repositorio.delete(clientes);
    }
}

