package br.com.entra21.amostradetalentos.model;

import br.com.entra21.amostradetalentos.dto.CaixaDTO;

public class Caixa {

	private int codigo;
	private SalvaAgenda salvaAgenda;
	private FormaDePagamento formaDePagamento;

	public Caixa(int codigo, SalvaAgenda salvaAgenda, FormaDePagamento formaDePagamento) {
		this.codigo = codigo;
		this.salvaAgenda = salvaAgenda;
		this.formaDePagamento = formaDePagamento;
	}

	public Caixa(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public SalvaAgenda getSalvaAgenda() {
		return salvaAgenda;
	}

	public void setSalvaAgenda(SalvaAgenda salvaAgenda) {
		this.salvaAgenda = salvaAgenda;
	}

	public FormaDePagamento getFormaPag() {
		return formaDePagamento;
	}

	public void setFormaPag(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public CaixaDTO toDTO() {
		return new CaixaDTO(this.getCodigo(), this.salvaAgenda.getCodigo(), this.formaDePagamento.getForma());
	}

}
