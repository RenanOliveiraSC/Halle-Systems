package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class NotaDeCompra {

	private int codigo;
	private Fornecedor fornecedor;
	private Produto produto;
	private double quantidadeProduto;
	private double precoProduto;
	private FormaDePagamento formaDePagamento;
	private double valorTotal;
	private Date dataLancamento;
	private String obs;
	private String anexo;
	private String numNota;
	private double desconto;

	public NotaDeCompra(int codigo, Fornecedor fornecedor, Produto produto, double quantidadeProduto,
			double precoProduto, FormaDePagamento formaDePagamento, double valorTotal, Date dataLancamento, String obs,
			String anexo, String numNota, double desconto) {
		super();
		this.codigo = codigo;
		this.fornecedor = fornecedor;
		this.produto = produto;
		this.quantidadeProduto = quantidadeProduto;
		this.precoProduto = precoProduto;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.dataLancamento = dataLancamento;
		this.obs = obs;
		this.anexo = anexo;
		this.numNota = numNota;
		this.desconto = desconto;
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

	public Produto getProduto() {
		return produto;
	}

	public void setCod_item(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade_produto() {
		return quantidadeProduto;
	}

	public void setQuantidade_produto(double quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setCod_tipo_pagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getData_lancamento() {
		return dataLancamento;
	}

	public void setData_lancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public String getNum_da_nota() {
		return numNota;
	}

	public void setNum_da_nota(String numNota) {
		this.numNota = numNota;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
