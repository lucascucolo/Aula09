package br.cucolo.sample02.services;

import java.util.List;

import br.cucolo.sample02.model.Departamento;

public interface IDepartamentoService {
    public Departamento buscarDeptoPorID(int id);
    public List<Departamento> listarTodos();
}