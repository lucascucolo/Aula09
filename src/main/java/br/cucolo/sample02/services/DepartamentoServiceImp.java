package br.cucolo.sample02.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.cucolo.sample02.dao.DepartamentoRepo;
import br.cucolo.sample02.model.Departamento;

@Component
public class DepartamentoServiceImp implements IDepartamentoService {

    @Autowired
    private DepartamentoRepo repo;

    @Override
    public Departamento buscarDeptoPorID(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Departamento> listarTodos() {
        return (List<Departamento>) repo.findAll();
    }
    
}