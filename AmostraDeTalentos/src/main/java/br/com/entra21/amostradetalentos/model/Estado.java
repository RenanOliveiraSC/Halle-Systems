package br.com.entra21.amostradetalentos.model;

public class Estado {

	private Integer codigo;
	private String nome;
	private String sigla;
	private Pais pais;

	public Estado(Integer codigo, String nome, String sigla, Pais pais) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
		this.pais = pais;
	}

	public Estado() {
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
