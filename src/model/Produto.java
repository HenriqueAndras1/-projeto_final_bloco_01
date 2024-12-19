package model;

public abstract class Produto {

	private int quantidade, codigo;
	private String acessorio;
	
	// metodo construtor
	
	public Produto(int quantidade, int codigo, String acessorio) {
		
		this.quantidade = quantidade;
		this.codigo = codigo;
		this.acessorio = acessorio;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	public void visualizar() {

		
	}
}
