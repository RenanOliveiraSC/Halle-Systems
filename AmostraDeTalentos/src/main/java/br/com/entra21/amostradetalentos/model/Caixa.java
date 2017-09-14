package br.com.entra21.amostradetalentos.model;

public class Caixa {

	private int codigo;
	private Agenda agenda;
	private FormaDePagamento formaDePagamento;

	public Caixa(int codigo, Agenda agenda, FormaDePagamento formaDePagamento) {
		super();
		this.codigo = codigo;
		this.agenda = agenda;
		this.formaDePagamento = formaDePagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public FormaDePagamento getForma_codigo() {
		return formaDePagamento;
	}

	public void setForma_codigo(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}
