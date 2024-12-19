package controller;

import java.util.ArrayList;

import model.Produto;
import repository.ProdutoRepository;


public class ProdutosController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void procurarPorCodigo(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto" + numero + " não foi encontrada!");
	}

	@Override
	public void listarProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}


	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto do código " + produto.getCodigo() + " foi criada cadastrado com Sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaPro = buscarNaCollection(produto.getCodigo());

		if (buscaPro != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaPro), produto);
			System.out.println("\nO produto do código " + produto.getCodigo() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nO produto do código  " + produto.getCodigo() + " não foi encontrada!");
	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO Produto " + numero + " foi deletada com sucesso!");
		} else
			System.out.println("\nO Produto " + numero + " não foi encontrada!");

	}

	public Produto buscarNaCollection(int numero) {
		for (Produto produto : listaProdutos) {
			if (produto.getCodigo() == numero) {
				return produto;
			}
		}
		return null;

	}


}
