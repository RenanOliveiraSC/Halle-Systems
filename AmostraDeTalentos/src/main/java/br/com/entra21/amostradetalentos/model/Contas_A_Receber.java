package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class Contas_A_Receber {
	
	
	private int ccodigo;
	private int cx_codigo;
	private Date data_lancamento;
	private int dias_de_atraso;
	private Double saldo;
	private Double desconto;
	private Double agamento_total;
	public Contas_A_Receber(int ccodigo, int cx_codigo, Date data_lancamento, int dias_de_atraso, Double saldo,
			Double desconto, Double agamento_total) {
		super();
		this.ccodigo = ccodigo;
		this.cx_codigo = cx_codigo;
		this.data_lancamento = data_lancamento;
		this.dias_de_atraso = dias_de_atraso;
		this.saldo = saldo;
		this.desconto = desconto;
		this.agamento_total = agamento_total;
	}
	public int getCcodigo() {
		return ccodigo;
	}
	public void setCcodigo(int ccodigo) {
		this.ccodigo = ccodigo;
	}
	public int getCx_codigo() {
		return cx_codigo;
	}
	public void setCx_codigo(int cx_codigo) {
		this.cx_codigo = cx_codigo;
	}
	public Date getData_lancamento() {
		return data_lancamento;
	}
	public void setData_lancamento(Date data_lancamento) {
		this.data_lancamento = data_lancamento;
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
		return agamento_total;
	}
	public void setAgamento_total(Double agamento_total) {
		this.agamento_total = agamento_total;
	}
	
		
}
