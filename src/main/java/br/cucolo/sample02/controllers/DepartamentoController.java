package br.cucolo.sample02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.cucolo.sample02.model.Departamento;
import br.cucolo.sample02.services.IDepartamentoService;

@RestController
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired
    public IDepartamentoService servico;

    @GetMapping("/departamento/{id}")
    public ResponseEntity<Departamento> buscarDeptoPorID(@PathVariable int id){
        Departamento depto = servico.buscarDeptoPorID(id);
        
        if(depto != null){
            return ResponseEntity.ok(depto);
        }
        return ResponseEntity.notFound().build();

    }

    @GetMapping("/departamento")
    public ResponseEntity<List<Departamento>> listarTodos(){
        List<Departamento> deptos = servico.listarTodos();
        if(deptos != null){
            return ResponseEntity.ok(deptos);
        }
        return ResponseEntity.notFound().build();
    }
    
}