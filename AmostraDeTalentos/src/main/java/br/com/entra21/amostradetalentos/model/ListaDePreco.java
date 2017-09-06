package br.com.entra21.amostradetalentos.model;

public class ListaDePreco {

	private int lp_codigo;
	private String lp_nome;
	private int lp_fator;
	
	public ListaDePreco(int lp_codigo, String lp_nome, int lp_fator) {
		super();
		this.lp_codigo = lp_codigo;
		this.lp_nome = lp_nome;
		this.lp_fator = lp_fator;
	}

	public int getLp_codigo() {
		return lp_codigo;
	}

	public void setLp_codigo(int lp_codigo) {
		this.lp_codigo = lp_codigo;
	}

	public String getLp_nome() {
		return lp_nome;
	}

	public void setLp_nome(String lp_nome) {
		this.lp_nome = lp_nome;
	}

	public int getLp_fator() {
		return lp_fator;
	}

	public void setLp_fator(int lp_fator) {
		this.lp_fator = lp_fator;
	}
	
	
}
