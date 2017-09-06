package br.com.entra21.amostradetalentos.model;

public class ListaDePreco {

	private Integer codigo;
	private String nome;
	private double fator;

	public ListaDePreco(Integer codigo, String nome, double fator) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fator = fator;
	}

	public ListaDePreco() {
		super();
	}

	public ListaDePreco(String nome, double fator) {
		super();
		this.nome = nome;
		this.fator = fator;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getFator() {
		return fator;
	}

	public void setFator(double fator) {
		this.fator = fator;
	}

}
