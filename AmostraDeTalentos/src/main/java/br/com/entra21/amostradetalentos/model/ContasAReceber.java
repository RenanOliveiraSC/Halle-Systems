package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class ContasAReceber {

	private int codigo;
	private Caixa caixa;
	private Date dataLancamento;
	private int dias_de_atraso;
	private Double saldo;
	private Double desconto;
	private Double pagamentoTotal;

	public ContasAReceber(int codigo, Caixa caixa, Date dataLancamento, int dias_de_atraso, Double saldo,
			Double desconto, Double pagamentoTotal) {
		super();
		this.codigo = codigo;
		this.caixa = caixa;
		this.dataLancamento = dataLancamento;
		this.dias_de_atraso = dias_de_atraso;
		this.saldo = saldo;
		this.desconto = desconto;
		this.pagamentoTotal = pagamentoTotal;
	}

	public ContasAReceber() {
	}

	public ContasAReceber(int codigo2, int codigo3, Date dataLancamento2, int dias_de_atraso2, Double saldo2,
			Double pagamentoTotal2) {
		// TODO Auto-generated constructor stub
	}

	public int getCcodigo() {
		return codigo;
	}

	public void setCcodigo(int codigo) {
		this.codigo = codigo;
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
