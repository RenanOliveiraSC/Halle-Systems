package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.FormaDePagamento;
import br.com.entra21.amostradetalentos.model.SalvaAgenda;

public class CaixaDTO {

	private int codigo;
	private SalvaAgenda salvaAgenda;
	private FormaDePagamento formaDePagamento;

	public CaixaDTO() {
	}

	public CaixaDTO(int codigo, Integer i, FormaDePagamento integer) {
		super();
		this.codigo = codigo;
		this.salvaAgenda = i;
		this.formaDePagamento = integer;
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

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}
