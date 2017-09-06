package br.com.entra21.amostradetalentos.model;

public class FormaDePagamento {

	private Integer codigo;
	private String forma;

	public FormaDePagamento(Integer codigo, String forma) {
		super();
		this.codigo = codigo;
		this.forma = forma;
	}

	public FormaDePagamento(String forma) {
		super();
		this.forma = forma;
	}

	public FormaDePagamento() {
		super();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

}
