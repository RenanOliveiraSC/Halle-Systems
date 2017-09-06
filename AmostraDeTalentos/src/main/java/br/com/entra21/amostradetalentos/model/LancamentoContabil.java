package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabil {

	private int lc_codigo;
	private String lc_car_codigo;
	private String lc_cap_codigo;
	private Date lc_data_lancamento;
	private String lc_observacao;
	
	public LancamentoContabil(int lc_codigo, String lc_car_codigo, String lc_cap_codigo, Date lc_data_lancamento,
			String lc_observacao) {
		super();
		this.lc_codigo = lc_codigo;
		this.lc_car_codigo = lc_car_codigo;
		this.lc_cap_codigo = lc_cap_codigo;
		this.lc_data_lancamento = lc_data_lancamento;
		this.lc_observacao = lc_observacao;
	}

	public int getLc_codigo() {
		return lc_codigo;
	}

	public void setLc_codigo(int lc_codigo) {
		this.lc_codigo = lc_codigo;
	}

	public String getLc_car_codigo() {
		return lc_car_codigo;
	}

	public void setLc_car_codigo(String lc_car_codigo) {
		this.lc_car_codigo = lc_car_codigo;
	}

	public String getLc_cap_codigo() {
		return lc_cap_codigo;
	}

	public void setLc_cap_codigo(String lc_cap_codigo) {
		this.lc_cap_codigo = lc_cap_codigo;
	}

	public Date getLc_data_lancamento() {
		return lc_data_lancamento;
	}

	public void setLc_data_lancamento(Date lc_data_lancamento) {
		this.lc_data_lancamento = lc_data_lancamento;
	}

	public String getLc_observacao() {
		return lc_observacao;
	}

	public void setLc_observacao(String lc_observacao) {
		this.lc_observacao = lc_observacao;
	}
	
	
	
}
