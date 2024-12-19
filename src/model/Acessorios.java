package model;

public class Acessorios extends Produto{

	public Acessorios(int quantidade, int codigo, String acessorio) {
		super(quantidade, codigo, acessorio);
		
	}

	@Override
    public void visualizar() {
        System.out.println("\nDetalhes dos Produtos:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Quantidade em Estoque " + getQuantidade());
        System.out.println("Produto - " + getAcessorio());
    }
}
