package br.com.entra21.amostradetalentos.model;

public class Familia {
	
	
	private int fam_codigo;
	private String fam_nome;
	
	public Familia(int fam_codigo, String fam_nome) {
		super();
		this.fam_codigo = fam_codigo;
		this.fam_nome = fam_nome;
	}

	public int getFam_codigo() {
		return fam_codigo;
	}

	public void setFam_codigo(int fam_codigo) {
		this.fam_codigo = fam_codigo;
	}

	public String getFam_nome() {
		return fam_nome;
	}

	public void setFam_nome(String fam_nome) {
		this.fam_nome = fam_nome;
	}
	
	
	
}
