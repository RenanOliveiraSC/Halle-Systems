package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class Contas_A_Receber {
	
	
	private int ccodigo;
	private Caixa caixa;
	private Date dataLancamento;
	private int dias_de_atraso;
	private Double saldo;
	private Double desconto;
	private Double pagamentoTotal;
	public Contas_A_Receber(int ccodigo, Caixa caixa, Date dataLancamento, int dias_de_atraso, Double saldo,
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
	public Date getData_lancamento() {
		return dataLancamento;
	}
	public void setData_lancamento(Date dataLancamento) {
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
	public Double getAgamento_total() {
		return pagamentoTotal;
	}
	public void setAgamento_total(Double pagamentoTotal) {
		this.pagamentoTotal = pagamentoTotal;
	}
	
		
}
