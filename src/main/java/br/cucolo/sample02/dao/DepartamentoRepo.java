package br.cucolo.sample02.dao;

import org.springframework.data.repository.CrudRepository;
import br.cucolo.sample02.model.Departamento;

public interface DepartamentoRepo extends CrudRepository<Departamento, Integer> {

}