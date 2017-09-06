package br.com.entra21.amostradetalentos.model;

public class Familia {

	private Integer codigo;
	private String nome;

	public Familia(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Familia(String nome) {
		super();
		this.nome = nome;
	}

	public Familia() {
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
