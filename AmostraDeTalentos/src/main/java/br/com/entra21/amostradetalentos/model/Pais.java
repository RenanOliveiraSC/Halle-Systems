package br.com.entra21.amostradetalentos.model;

public class Pais {

	private Integer codigo;
	private String nome;

	public Pais() {
		super();
	}

	public Pais(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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
