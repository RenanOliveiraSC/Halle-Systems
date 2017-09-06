package br.com.entra21.amostradetalentos.model;

public class FormaDePagamento {
	
	
	private int forma_codigo;
	private String forma_nome;
	
	
	public FormaDePagamento(int forma_codigo, String forma_nome) {
		super();
		this.forma_codigo = forma_codigo;
		this.forma_nome = forma_nome;
	}


	public int getForma_codigo() {
		return forma_codigo;
	}


	public void setForma_codigo(int forma_codigo) {
		this.forma_codigo = forma_codigo;
	}


	public String getForma_nome() {
		return forma_nome;
	}


	public void setForma_nome(String forma_nome) {
		this.forma_nome = forma_nome;
	}
	
	
}
