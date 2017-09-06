package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class NotaDeCompra {

	private int ntc_codigo;
	private int car_cod_fornecedor;
	private int car_cod_item;
	private String car_quantidade_item;
	private String car_preco_item;
	private String car_cod_tipo_pagamento;
	private String car_total;
	private Date car_data_lancamento;
	private String car_obs;
	private String car_anexo;
	private String num_da_note;
	private String ntc_desconto;
	
	public NotaDeCompra(int ntc_codigo, int car_cod_fornecedor, int car_cod_item, String car_quantidade_item,
			String car_preco_item, String car_cod_tipo_pagamento, String car_total, Date car_data_lancamento,
			String car_obs, String car_anexo, String num_da_note, String ntc_desconto) {
		super();
		this.ntc_codigo = ntc_codigo;
		this.car_cod_fornecedor = car_cod_fornecedor;
		this.car_cod_item = car_cod_item;
		this.car_quantidade_item = car_quantidade_item;
		this.car_preco_item = car_preco_item;
		this.car_cod_tipo_pagamento = car_cod_tipo_pagamento;
		this.car_total = car_total;
		this.car_data_lancamento = car_data_lancamento;
		this.car_obs = car_obs;
		this.car_anexo = car_anexo;
		this.num_da_note = num_da_note;
		this.ntc_desconto = ntc_desconto;
	}

	public int getNtc_codigo() {
		return ntc_codigo;
	}

	public void setNtc_codigo(int ntc_codigo) {
		this.ntc_codigo = ntc_codigo;
	}

	public int getCar_cod_fornecedor() {
		return car_cod_fornecedor;
	}

	public void setCar_cod_fornecedor(int car_cod_fornecedor) {
		this.car_cod_fornecedor = car_cod_fornecedor;
	}

	public int getCar_cod_item() {
		return car_cod_item;
	}

	public void setCar_cod_item(int car_cod_item) {
		this.car_cod_item = car_cod_item;
	}

	public String getCar_quantidade_item() {
		return car_quantidade_item;
	}

	public void setCar_quantidade_item(String car_quantidade_item) {
		this.car_quantidade_item = car_quantidade_item;
	}

	public String getCar_preco_item() {
		return car_preco_item;
	}

	public void setCar_preco_item(String car_preco_item) {
		this.car_preco_item = car_preco_item;
	}

	public String getCar_cod_tipo_pagamento() {
		return car_cod_tipo_pagamento;
	}

	public void setCar_cod_tipo_pagamento(String car_cod_tipo_pagamento) {
		this.car_cod_tipo_pagamento = car_cod_tipo_pagamento;
	}

	public String getCar_total() {
		return car_total;
	}

	public void setCar_total(String car_total) {
		this.car_total = car_total;
	}

	public Date getCar_data_lancamento() {
		return car_data_lancamento;
	}

	public void setCar_data_lancamento(Date car_data_lancamento) {
		this.car_data_lancamento = car_data_lancamento;
	}

	public String getCar_obs() {
		return car_obs;
	}

	public void setCar_obs(String car_obs) {
		this.car_obs = car_obs;
	}

	public String getCar_anexo() {
		return car_anexo;
	}

	public void setCar_anexo(String car_anexo) {
		this.car_anexo = car_anexo;
	}

	public String getNum_da_note() {
		return num_da_note;
	}

	public void setNum_da_note(String num_da_note) {
		this.num_da_note = num_da_note;
	}

	public String getNtc_desconto() {
		return ntc_desconto;
	}

	public void setNtc_desconto(String ntc_desconto) {
		this.ntc_desconto = ntc_desconto;
	}
	
	
	
}
