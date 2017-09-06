package br.com.entra21.amostradetalentos.model;

public class Fabricante {

	private Integer codigo;
	private String nome;

	public Fabricante(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	public Fabricante() {
		super();
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

}
