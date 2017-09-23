package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Agendamento;
import br.com.entra21.amostradetalentos.model.Caixa;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;
import br.com.entra21.amostradetalentos.model.SalvaAgenda;
import br.com.entra21.amostradetalentos.utils.DecimalFormatUtils;

public class CaixaDTO {

	private int codigo;
	private String precoDaAgenda;
	private String formaDePagamento;

	public CaixaDTO() {
	}

	public CaixaDTO(int codigo, String precoDaAgenda, String formaDePagamento) {
		this.codigo = codigo;
		this.precoDaAgenda = precoDaAgenda;
		this.formaDePagamento = formaDePagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPrecoDaAgenda() {
		return precoDaAgenda;
	}

	public void setPrecoDaAgenda(String precoDaAgenda) {
		this.precoDaAgenda = precoDaAgenda;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Caixa toCaixa() {
		return new Caixa(this.codigo, new Agendamento(), new FormaDePagamento());
	}
	
}
