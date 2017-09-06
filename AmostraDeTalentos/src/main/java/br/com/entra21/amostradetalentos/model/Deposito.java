package br.com.entra21.amostradetalentos.model;

public class Deposito {
	
	
	private int dep_codigo;
	private String dep_nome;
	
	public Deposito(int dep_codigo, String dep_nome) {
		super();
		this.dep_codigo = dep_codigo;
		this.dep_nome = dep_nome;
	}

	public int getDep_codigo() {
		return dep_codigo;
	}

	public void setDep_codigo(int dep_codigo) {
		this.dep_codigo = dep_codigo;
	}

	public String getDep_nome() {
		return dep_nome;
	}

	public void setDep_nome(String dep_nome) {
		this.dep_nome = dep_nome;
	}
	
	
}
