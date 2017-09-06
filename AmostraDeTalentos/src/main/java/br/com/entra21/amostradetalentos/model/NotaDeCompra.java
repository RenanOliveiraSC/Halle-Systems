package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class NotaDeCompra {

	private int codigo;
	private int cod_fornecedor;
	private int cod_item;
	private String quantidade_item;
	private String preco_item;
	private String cod_tipo_pagamento;
	private String total;
	private Date data_lancamento;
	private String obs;
	private String anexo;
	private String num_da_nota;
	private String desconto;
	public NotaDeCompra(int codigo, int cod_fornecedor, int cod_item, String quantidade_item, String preco_item,
			String cod_tipo_pagamento, String total, Date data_lancamento, String obs, String anexo, String num_da_nota,
			String desconto) {
		super();
		this.codigo = codigo;
		this.cod_fornecedor = cod_fornecedor;
		this.cod_item = cod_item;
		this.quantidade_item = quantidade_item;
		this.preco_item = preco_item;
		this.cod_tipo_pagamento = cod_tipo_pagamento;
		this.total = total;
		this.data_lancamento = data_lancamento;
		this.obs = obs;
		this.anexo = anexo;
		this.num_da_nota = num_da_nota;
		this.desconto = desconto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCod_fornecedor() {
		return cod_fornecedor;
	}
	public void setCod_fornecedor(int cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}
	public int getCod_item() {
		return cod_item;
	}
	public void setCod_item(int cod_item) {
		this.cod_item = cod_item;
	}
	public String getQuantidade_item() {
		return quantidade_item;
	}
	public void setQuantidade_item(String quantidade_item) {
		this.quantidade_item = quantidade_item;
	}
	public String getPreco_item() {
		return preco_item;
	}
	public void setPreco_item(String preco_item) {
		this.preco_item = preco_item;
	}
	public String getCod_tipo_pagamento() {
		return cod_tipo_pagamento;
	}
	public void setCod_tipo_pagamento(String cod_tipo_pagamento) {
		this.cod_tipo_pagamento = cod_tipo_pagamento;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public Date getData_lancamento() {
		return data_lancamento;
	}
	public void setData_lancamento(Date data_lancamento) {
		this.data_lancamento = data_lancamento;
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
		return num_da_nota;
	}
	public void setNum_da_nota(String num_da_nota) {
		this.num_da_nota = num_da_nota;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	
		
	
	
}
