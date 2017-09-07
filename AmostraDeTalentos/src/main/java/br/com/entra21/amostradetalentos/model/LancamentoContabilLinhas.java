package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabilLinhas {

	
	private int codigo;
	private int lc_codigo;
	private String cod_conta;
	private String debito;
	private String credito;
	private Date data_lancamento;
	private String observacao;
	public LancamentoContabilLinhas(int codigo, int lc_codigo, String cod_conta, String debito, String credito,
			Date data_lancamento, String observacao) {
		super();
		this.codigo = codigo;
		this.lc_codigo = lc_codigo;
		this.cod_conta = cod_conta;
		this.debito = debito;
		this.credito = credito;
		this.data_lancamento = data_lancamento;
		this.observacao = observacao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getLc_codigo() {
		return lc_codigo;
	}
	public void setLc_codigo(int lc_codigo) {
		this.lc_codigo = lc_codigo;
	}
	public String getCod_conta() {
		return cod_conta;
	}
	public void setCod_conta(String cod_conta) {
		this.cod_conta = cod_conta;
	}
	public String getDebito() {
		return debito;
	}
	public void setDebito(String debito) {
		this.debito = debito;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
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
