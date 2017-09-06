package br.com.entra21.amostradetalentos.model;

public class Caixa {
	
	private int cx_codigo;
	private String cx_ag_codigo;
	private int cx_forma_codigo;
	
	public Caixa(int cx_codigo, String cx_ag_codigo, int cx_forma_codigo) {
		this.cx_codigo = cx_codigo;
		this.cx_ag_codigo = cx_ag_codigo;
		this.cx_forma_codigo = cx_forma_codigo;
	}
	
	public int getCx_codigo() {
		return cx_codigo;
	}
	public void setCx_codigo(int cx_codigo) {
		this.cx_codigo = cx_codigo;
	}
	public String getCx_ag_codigo() {
		return cx_ag_codigo;
	}
	public void setCx_ag_codigo(String cx_ag_codigo) {
		this.cx_ag_codigo = cx_ag_codigo;
	}
	public int getCx_forma_codigo() {
		return cx_forma_codigo;
	}
	public void setCx_forma_codigo(int cx_forma_codigo) {
		this.cx_forma_codigo = cx_forma_codigo;
	}
	
	
}
