package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabilLinhas {

	
	private int codigo;
	private int lancamentoCodigo;
	private String codigoConta;
	private String debito;
	private String credito;
	private Date dataLancamento;
	private String observacao;
	public LancamentoContabilLinhas(int codigo, int lancamentoCodigo, String codigoConta, String debito, String credito,
			Date dataLancamento, String observacao) {
		super();
		this.codigo = codigo;
		this.lancamentoCodigo = lancamentoCodigo;
		this.codigoConta = codigoConta;
		this.debito = debito;
		this.credito = credito;
		this.dataLancamento = dataLancamento;
		this.observacao = observacao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getLc_codigo() {
		return lancamentoCodigo;
	}
	public void setLc_codigo(int lancamentoCodigo) {
		this.lancamentoCodigo = lancamentoCodigo;
	}
	public String getCod_conta() {
		return codigoConta;
	}
	public void setCod_conta(String codigoConta) {
		this.codigoConta = codigoConta;
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
		return dataLancamento;
	}
	public void setData_lancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
		
}
