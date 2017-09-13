package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class ContasAReceber {

	private int ccodigo;
	private Caixa caixa;
	private Date dataLancamento;
	private int dias_de_atraso;
	private Double saldo;
	private Double desconto;
	private Double pagamentoTotal;

	public ContasAReceber(int ccodigo, Caixa caixa, Date dataLancamento, int dias_de_atraso, Double saldo,
			Double desconto, Double pagamentoTotal) {
		super();
		this.ccodigo = ccodigo;
		this.caixa = caixa;
		this.dataLancamento = dataLancamento;
		this.dias_de_atraso = dias_de_atraso;
		this.saldo = saldo;
		this.desconto = desconto;
		this.pagamentoTotal = pagamentoTotal;
	}

	public int getCcodigo() {
		return ccodigo;
	}

	public void setCcodigo(int ccodigo) {
		this.ccodigo = ccodigo;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public Date getDatalancamento() {
		return dataLancamento;
	}

	public void setDatalancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getDias_de_atraso() {
		return dias_de_atraso;
	}

	public void setDias_de_atraso(int dias_de_atraso) {
		this.dias_de_atraso = dias_de_atraso;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getPagamento_total() {
		return pagamentoTotal;
	}

	public void setPagamento_total(Double pagamentoTotal) {
		this.pagamentoTotal = pagamentoTotal;
	}

}