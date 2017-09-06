package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabil {

	private int codigo;
	private String car_codigo;
	private String cap_codigo;
	private Date data_lancamento;
	private String observacao;
	public LancamentoContabil(int codigo, String car_codigo, String cap_codigo, Date data_lancamento,
			String observacao) {
		super();
		this.codigo = codigo;
		this.car_codigo = car_codigo;
		this.cap_codigo = cap_codigo;
		this.data_lancamento = data_lancamento;
		this.observacao = observacao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCar_codigo() {
		return car_codigo;
	}
	public void setCar_codigo(String car_codigo) {
		this.car_codigo = car_codigo;
	}
	public String getCap_codigo() {
		return cap_codigo;
	}
	public void setCap_codigo(String cap_codigo) {
		this.cap_codigo = cap_codigo;
	}
	public Date getData_lancamento() {
		return data_lancamento;
	}
	public void setData_lancamento(Date data_lancamento) {
		this.data_lancamento = data_lancamento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
		
}
