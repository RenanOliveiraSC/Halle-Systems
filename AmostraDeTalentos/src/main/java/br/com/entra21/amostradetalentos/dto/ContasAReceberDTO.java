package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Caixa;
import br.com.entra21.amostradetalentos.model.ContasAReceber;
import br.com.entra21.amostradetalentos.utils.DateUtils;
import br.com.entra21.amostradetalentos.utils.DecimalFormatUtils;

public class ContasAReceberDTO {

	private int codigo;
	private Caixa caixa;
	private String dataLancamento;
	private int dias_de_atraso;
	private String saldo;
	private Double desconto;
	private String pagamentoTotal;

	public ContasAReceberDTO() {
	}

	public ContasAReceberDTO(int codigo, Caixa caixa, String dataLancamento, int dias_de_atraso, String saldo,
			Double desconto, String pagamentoTotal) {
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

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getDias_de_atraso() {
		return dias_de_atraso;
	}

	public void setDias_de_atraso(int dias_de_atraso) {
		this.dias_de_atraso = dias_de_atraso;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public String getPagamentoTotal() {
		return pagamentoTotal;
	}

	public void setPagamentoTotal(String pagamentoTotal) {
		this.pagamentoTotal = pagamentoTotal;
	}

	public ContasAReceber toContasAReceber() {
		return new ContasAReceber(this.codigo, this.caixa,
				DateUtils.parseData(this.dataLancamento, DateUtils.PATTERN_DATA_PADRAO), this.dias_de_atraso,
				DecimalFormatUtils.parseDouble(this.saldo), this.desconto,
				DecimalFormatUtils.parseDouble(this.pagamentoTotal));
	}

}
