package br.com.entra21.amostradetalentos.dto;

import java.util.Date;

import br.com.entra21.amostradetalentos.model.Caixa;
import br.com.entra21.amostradetalentos.model.ContasAReceber;

public class ContasAReceberDTO {

	private int codigo;
	private Caixa caixa;
	private Date dataLancamento;
	private int dias_de_atraso;
	private Double saldo;
	private Double desconto;
	private Double pagamentoTotal;

	public ContasAReceberDTO() {
	}

	public ContasAReceberDTO(int codigo, Caixa caixa, Date dataLancamento, int dias_de_atraso, Double saldo,
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
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

	public Double getPagamentoTotal() {
		return pagamentoTotal;
	}

	public void setPagamentoTotal(Double pagamentoTotal) {
		this.pagamentoTotal = pagamentoTotal;
	}

	public ContasAReceber toContasAReceber() {
		return new ContasAReceber(this.codigo, this.caixa.getCodigo(), this.getDataLancamento(),
				this.getDias_de_atraso(), this.getSaldo(), this.getPagamentoTotal());
	}

}
