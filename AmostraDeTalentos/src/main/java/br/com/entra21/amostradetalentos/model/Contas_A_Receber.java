package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class Contas_A_Receber {
	
	
	private int car_codigo;
	private int car_cx_codigo;
	private Date car_date_lancamento;
	private int car_dias_de_atraso;
	private Double car_saldo;
	private Double car_desconto;
	private Double car_pagamento_total;
	
	public Contas_A_Receber(int car_codigo, int car_cx_codigo, Date car_date_lancamento, int car_dias_de_atraso,
			Double car_saldo, Double car_desconto, Double car_pagamento_total) {
		super();
		this.car_codigo = car_codigo;
		this.car_cx_codigo = car_cx_codigo;
		this.car_date_lancamento = car_date_lancamento;
		this.car_dias_de_atraso = car_dias_de_atraso;
		this.car_saldo = car_saldo;
		this.car_desconto = car_desconto;
		this.car_pagamento_total = car_pagamento_total;
	}

	public int getCar_codigo() {
		return car_codigo;
	}

	public void setCar_codigo(int car_codigo) {
		this.car_codigo = car_codigo;
	}

	public int getCar_cx_codigo() {
		return car_cx_codigo;
	}

	public void setCar_cx_codigo(int car_cx_codigo) {
		this.car_cx_codigo = car_cx_codigo;
	}

	public Date getCar_date_lancamento() {
		return car_date_lancamento;
	}

	public void setCar_date_lancamento(Date car_date_lancamento) {
		this.car_date_lancamento = car_date_lancamento;
	}

	public int getCar_dias_de_atraso() {
		return car_dias_de_atraso;
	}

	public void setCar_dias_de_atraso(int car_dias_de_atraso) {
		this.car_dias_de_atraso = car_dias_de_atraso;
	}

	public Double getCar_saldo() {
		return car_saldo;
	}

	public void setCar_saldo(Double car_saldo) {
		this.car_saldo = car_saldo;
	}

	public Double getCar_desconto() {
		return car_desconto;
	}

	public void setCar_desconto(Double car_desconto) {
		this.car_desconto = car_desconto;
	}

	public Double getCar_pagamento_total() {
		return car_pagamento_total;
	}

	public void setCar_pagamento_total(Double car_pagamento_total) {
		this.car_pagamento_total = car_pagamento_total;
	}
	
	
}
