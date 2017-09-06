package br.com.entra21.amostradetalentos.model;

public class TipoUsuario {

	private Integer codigo;
	private String nome;

	public TipoUsuario(Integer codigo, String nome) {

		this.codigo = codigo;
		this.nome = nome;
	}

	public TipoUsuario(String nome) {

		this.nome = nome;
	}

	public TipoUsuario() {

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
