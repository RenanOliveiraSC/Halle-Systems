package br.com.entra21.amostradetalentos.model;

import br.com.entra21.amostradetalentos.dto.CaixaDTO;

public class Caixa {

	private int codigo;
	private Agendamento agendamento;
	private FormaDePagamento formaDePagamento;

	public Caixa(int codigo, Agendamento agendamento, FormaDePagamento formaDePagamento) {
		this.codigo = codigo;
		this.agendamento = agendamento;
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

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setSalvaAgenda(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public FormaDePagamento getFormaPag() {
		return formaDePagamento;
	}

	public void setFormaPag(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public CaixaDTO toDTO() {
		return new CaixaDTO(this.getCodigo(), String.valueOf(this.agendamento.getCodigo()), 
				String.valueOf(this.formaDePagamento.getForma()));
	}

}
