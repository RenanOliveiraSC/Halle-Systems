package br.com.entra21.amostradetalentos.model;

public class Caixa {
	
	private int codigo;
	private String ag_codigo;
	private int forma_codigo;
	
	public Caixa(int codigo, String ag_codigo, int forma_codigo) {
		super();
		this.codigo = codigo;
		this.ag_codigo = ag_codigo;
		this.forma_codigo = forma_codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAg_codigo() {
		return ag_codigo;
	}

	public void setAg_codigo(String ag_codigo) {
		this.ag_codigo = ag_codigo;
	}

	public int getForma_codigo() {
		return forma_codigo;
	}

	public void setForma_codigo(int forma_codigo) {
		this.forma_codigo = forma_codigo;
	}
	
	
}
