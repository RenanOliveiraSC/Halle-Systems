package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class ContasAPagar {

	private int codigo;
	private Fornecedor fornecedor;
	private FormaDePagamento formaDePagamento;
	private Date dataLancamento;
	private int diasAtraso;
	private String total;
	private Double saldo;
	private Double desconto;
	private Double pagamentoTotal;

	public ContasAPagar(int codigo, Fornecedor fornecedor, FormaDePagamento formaDePagamento, Date dataLancamento,
			int diasAtraso, String total, Double saldo, Double desconto, Double pagamentoTotal) {
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
	
	public ContasAPagar() {
		
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

	public FormaDePagamento getForneceFormaDePagamentodor() {
		return formaDePagamento;
	}

	public void setForneceFormaDePagamentodor(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
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

}
