package repository;

import model.Produto;

public interface ProdutoRepository {

	public void procurarPorCodigo(int numero);
	public void listarProdutos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int numero);
}
