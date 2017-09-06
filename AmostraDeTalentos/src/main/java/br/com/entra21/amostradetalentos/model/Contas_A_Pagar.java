package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class Contas_A_Pagar {

	
	private int cap_codigo;
	private int cap_cod_fornecedor;
	private String cap_cod_tipo_pagamento;
	private Date cap_data_lancamento;
	private int cap_dias_de_atraso;
	private String cap_total;
	private Double cap_saldo;
	private Double cap_desconto;
	private Double cap_pagamento_total;
	
	public Contas_A_Pagar(int cap_codigo, int cap_cod_fornecedor, String cap_cod_tipo_pagamento,
			Date cap_data_lancamento, int cap_dias_de_atraso, String cap_total, Double cap_saldo, Double cap_desconto,
			Double cap_pagamento_total) {
		super();
		this.cap_codigo = cap_codigo;
		this.cap_cod_fornecedor = cap_cod_fornecedor;
		this.cap_cod_tipo_pagamento = cap_cod_tipo_pagamento;
		this.cap_data_lancamento = cap_data_lancamento;
		this.cap_dias_de_atraso = cap_dias_de_atraso;
		this.cap_total = cap_total;
		this.cap_saldo = cap_saldo;
		this.cap_desconto = cap_desconto;
		this.cap_pagamento_total = cap_pagamento_total;
	}

	public int getCap_codigo() {
		return cap_codigo;
	}

	public void setCap_codigo(int cap_codigo) {
		this.cap_codigo = cap_codigo;
	}

	public int getCap_cod_fornecedor() {
		return cap_cod_fornecedor;
	}

	public void setCap_cod_fornecedor(int cap_cod_fornecedor) {
		this.cap_cod_fornecedor = cap_cod_fornecedor;
	}

	public String getCap_cod_tipo_pagamento() {
		return cap_cod_tipo_pagamento;
	}

	public void setCap_cod_tipo_pagamento(String cap_cod_tipo_pagamento) {
		this.cap_cod_tipo_pagamento = cap_cod_tipo_pagamento;
	}

	public Date getCap_data_lancamento() {
		return cap_data_lancamento;
	}

	public void setCap_data_lancamento(Date cap_data_lancamento) {
		this.cap_data_lancamento = cap_data_lancamento;
	}

	public int getCap_dias_de_atraso() {
		return cap_dias_de_atraso;
	}

	public void setCap_dias_de_atraso(int cap_dias_de_atraso) {
		this.cap_dias_de_atraso = cap_dias_de_atraso;
	}

	public String getCap_total() {
		return cap_total;
	}

	public void setCap_total(String cap_total) {
		this.cap_total = cap_total;
	}

	public Double getCap_saldo() {
		return cap_saldo;
	}

	public void setCap_saldo(Double cap_saldo) {
		this.cap_saldo = cap_saldo;
	}

	public Double getCap_desconto() {
		return cap_desconto;
	}

	public void setCap_desconto(Double cap_desconto) {
		this.cap_desconto = cap_desconto;
	}

	public Double getCap_pagamento_total() {
		return cap_pagamento_total;
	}

	public void setCap_pagamento_total(Double cap_pagamento_total) {
		this.cap_pagamento_total = cap_pagamento_total;
	}
	
	
	
}
