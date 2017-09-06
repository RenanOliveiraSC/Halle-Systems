package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class Contas_A_Pagar {

	
	private int codigo;
	private int cod_fornecedor;
	private String cod_tipo_pagamento;
	private Date data_lancamento;
	private int dias_de_atraso;
	private String total;
	private Double saldo;
	private Double desconto;
	private Double pagamento_total;
	public Contas_A_Pagar(int codigo, int cod_fornecedor, String cod_tipo_pagamento, Date data_lancamento,
			int dias_de_atraso, String total, Double saldo, Double desconto, Double pagamento_total) {
		super();
		this.codigo = codigo;
		this.cod_fornecedor = cod_fornecedor;
		this.cod_tipo_pagamento = cod_tipo_pagamento;
		this.data_lancamento = data_lancamento;
		this.dias_de_atraso = dias_de_atraso;
		this.total = total;
		this.saldo = saldo;
		this.desconto = desconto;
		this.pagamento_total = pagamento_total;
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
	public String getCod_tipo_pagamento() {
		return cod_tipo_pagamento;
	}
	public void setCod_tipo_pagamento(String cod_tipo_pagamento) {
		this.cod_tipo_pagamento = cod_tipo_pagamento;
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
	public Double getPagamento_total() {
		return pagamento_total;
	}
	public void setPagamento_total(Double pagamento_total) {
		this.pagamento_total = pagamento_total;
	}
	
		
}
