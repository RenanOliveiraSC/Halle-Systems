package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class NotaDeCompra {

	private int codigo;
	private int codFornecedor;
	private int codProduto;
	private String quantidadeProduto;
	private String precoProduto;
	private String codTipoPagamento;
	private String total;
	private Date dataLancamento;
	private String obs;
	private String anexo;
	private String numNota;
	private String desconto;
	
	public NotaDeCompra(int codigo, int codFornecedor, int codProduto, String quantidadeProduto, String precoProduto,
			String codTipoPagamento, String total, Date dataLancamento, String obs, String anexo, String numNota,
			String desconto) {
		super();
		this.codigo = codigo;
		this.codFornecedor = codFornecedor;
		this.codProduto = codProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.precoProduto = precoProduto;
		this.codTipoPagamento = codTipoPagamento;
		this.total = total;
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
	public int getCod_fornecedor() {
		return codFornecedor;
	}
	public void setCod_fornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	public int getCod_item() {
		return codProduto;
	}
	public void setCod_item(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getQuantidade_item() {
		return quantidadeProduto;
	}
	public void setQuantidade_item(String quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public String getPreco_item() {
		return precoProduto;
	}
	public void setPreco_item(String precoProduto) {
		this.precoProduto = precoProduto;
	}
	public String getCod_tipo_pagamento() {
		return codTipoPagamento;
	}
	public void setCod_tipo_pagamento(String codTipoPagamento) {
		this.codTipoPagamento = codTipoPagamento;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
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
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	
		
	
	
}
