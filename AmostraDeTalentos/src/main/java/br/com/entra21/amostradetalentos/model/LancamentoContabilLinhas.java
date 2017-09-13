package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabilLinhas {

	private int codigo;
	private int lancamentoCodigo;
	private String codigoConta;
	private double debito;
	private double credito;
	// inserir no banco de dados o campo datalançamento *Renan*//
	private Date dataLancamento;
	private Date dataVencimento;
	private String observacao;

	public LancamentoContabilLinhas(int codigo, int lancamentoCodigo, String codigoConta, double debito, double credito,
			Date dataLancamento, String observacao) {
		super();
		this.codigo = codigo;
		this.lancamentoCodigo = lancamentoCodigo;
		this.codigoConta = codigoConta;
		this.debito = debito;
		this.credito = credito;
		this.dataLancamento = dataLancamento;
		this.dataVencimento = dataVencimento;
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

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
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

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}
