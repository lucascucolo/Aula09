package br.cucolo.sample02.services;

import java.util.List;

import br.cucolo.sample02.model.Produto;

public interface IProdutoService {
    public Produto buscarProdutoPorCod(int cod);
    public List<Produto> buscarTodos();
    public void gravarProduto(Produto produto);
    public List<Produto> buscarProNome(String nome);
    public List<Produto> buscarBaratos(double preco);
    public void apagarProduto(int cod);
}