package br.com.entra21.amostradetalentos.model;

public class GrupoPn {

	private Integer codigo;
	private String nome;
	private TipoPn tipoPn;

	public GrupoPn() {

	}

	public GrupoPn(Integer codigo, String nome, TipoPn tipoPn) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipoPn = tipoPn;
	}

	public TipoPn getTipoPn() {
		return tipoPn;
	}

	public void setTipoPn(TipoPn tipoPn) {
		this.tipoPn = tipoPn;
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
