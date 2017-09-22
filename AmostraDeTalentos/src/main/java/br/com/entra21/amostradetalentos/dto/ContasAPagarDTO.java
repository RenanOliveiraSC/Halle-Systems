package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;
import br.com.entra21.amostradetalentos.model.Fornecedor;
import br.com.entra21.amostradetalentos.utils.DateUtils;
import br.com.entra21.amostradetalentos.utils.DecimalFormatUtils;

public class ContasAPagarDTO {

	private int codigo;
	private Fornecedor fornecedor;
	private FormaDePagamento formaDePagamento;
	private String dataLancamento;
	private int diasAtraso;
	private String total;
	private String saldo;
	private Double desconto;
	private String pagamentoTotal;

	public ContasAPagarDTO() {
	}

	public ContasAPagarDTO(int codigo, Fornecedor fornecedor, FormaDePagamento formaDePagamento, String dataLancamento,
			int diasAtraso, String total, String saldo, Double desconto, String pagamentoTotal) {
		super();
		this.codigo = codigo;
		this.fornecedor = fornecedor;
		this.formaDePagamento = formaDePagamento;
		this.dataLancamento = dataLancamento;
		this.diasAtraso = diasAtraso;
		this.total = total;
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getDiasAtraso() {
		return diasAtraso;
	}

	public void setDiasAtraso(int diasAtraso) {
		this.diasAtraso = diasAtraso;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
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

	public ContasAPagar toContasAPagar() {
		return new ContasAPagar(this.codigo, this.fornecedor, this.formaDePagamento,
				DateUtils.parseData(this.dataLancamento, DateUtils.PATTERN_DATA_PADRAO), this.diasAtraso,
				DecimalFormatUtils.parseDecimal(this.total), DecimalFormatUtils.parseDecimal(this.saldo), this.desconto,
				DecimalFormatUtils.parseDecimal(this.pagamentoTotal));
	}

}
