package br.com.entra21.amostradetalentos.model;

public class ServicoProduto {
	
	private int codigo;
	private Servico servico;
	private Produto produto;
	
	public ServicoProduto() {
		super();
	}

	public ServicoProduto(int codigo, Servico servico, Produto produto) {
		super();
		this.codigo = codigo;
		this.servico = servico;
		this.produto = produto;
	}
	
	public ServicoProduto(Servico servico) {
		this.servico = servico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
