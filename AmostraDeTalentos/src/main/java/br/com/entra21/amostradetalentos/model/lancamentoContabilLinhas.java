package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class lancamentoContabilLinhas {

	
	private int lcl_codigo;
	private int lcl_lc_codigo;
	private String lcl_cod_conta;
	private String lcl_debito;
	private String lcl_credito;
	private Date lcl_data_lancamento;
	private String lcl_observacao;
	
	
	public lancamentoContabilLinhas(int lcl_codigo, int lcl_lc_codigo, String lcl_cod_conta, String lcl_debito,
			String lcl_credito, Date lcl_data_lancamento, String lcl_observacao) {
		super();
		this.lcl_codigo = lcl_codigo;
		this.lcl_lc_codigo = lcl_lc_codigo;
		this.lcl_cod_conta = lcl_cod_conta;
		this.lcl_debito = lcl_debito;
		this.lcl_credito = lcl_credito;
		this.lcl_data_lancamento = lcl_data_lancamento;
		this.lcl_observacao = lcl_observacao;
	}


	public int getLcl_codigo() {
		return lcl_codigo;
	}


	public void setLcl_codigo(int lcl_codigo) {
		this.lcl_codigo = lcl_codigo;
	}


	public int getLcl_lc_codigo() {
		return lcl_lc_codigo;
	}


	public void setLcl_lc_codigo(int lcl_lc_codigo) {
		this.lcl_lc_codigo = lcl_lc_codigo;
	}


	public String getLcl_cod_conta() {
		return lcl_cod_conta;
	}


	public void setLcl_cod_conta(String lcl_cod_conta) {
		this.lcl_cod_conta = lcl_cod_conta;
	}


	public String getLcl_debito() {
		return lcl_debito;
	}


	public void setLcl_debito(String lcl_debito) {
		this.lcl_debito = lcl_debito;
	}


	public String getLcl_credito() {
		return lcl_credito;
	}


	public void setLcl_credito(String lcl_credito) {
		this.lcl_credito = lcl_credito;
	}


	public Date getLcl_data_lancamento() {
		return lcl_data_lancamento;
	}


	public void setLcl_data_lancamento(Date lcl_data_lancamento) {
		this.lcl_data_lancamento = lcl_data_lancamento;
	}


	public String getLcl_observacao() {
		return lcl_observacao;
	}


	public void setLcl_observacao(String lcl_observacao) {
		this.lcl_observacao = lcl_observacao;
	}
	
	
}
