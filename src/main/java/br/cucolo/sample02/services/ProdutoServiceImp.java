package br.cucolo.sample02.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.cucolo.sample02.dao.ProdutoRepo;
import br.cucolo.sample02.model.Produto;

@Component
public class ProdutoServiceImp implements IProdutoService {

    @Autowired
    private ProdutoRepo repo;

    @Override
    public Produto buscarProdutoPorCod(int cod) {

        return repo.findById(cod).get();
    }

    @Override
    public List<Produto> buscarTodos() {

        return (List<Produto>) repo.findAll();
    }

    @Override
    public void gravarProduto(Produto produto) {
        repo.save(produto);

    }

    @Override
    public List<Produto> buscarProNome(String nome) {
        return repo.findByNome(nome);
    }

    @Override
    public List<Produto> buscarBaratos(double preco) {
        return repo.findMenoresPrecos(preco);
    }

    @Override
    public void apagarProduto(int cod) {
        repo.deleteById(cod);
        
    }

}