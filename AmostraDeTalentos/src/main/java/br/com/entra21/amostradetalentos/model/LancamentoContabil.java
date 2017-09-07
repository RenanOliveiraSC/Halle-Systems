package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabil {

	private int codigo;
	private String contasAReceberCodigo;
	private String contasAPagarCodigo;
	private Date dataLancamento;
	private String observacao;
	public LancamentoContabil(int codigo, String contasAReceberCodigo, String contasAPagarCodigo, Date dataLancamento,
			String observacao) {
		super();
		this.codigo = codigo;
		this.contasAReceberCodigo = contasAReceberCodigo;
		this.contasAPagarCodigo = contasAPagarCodigo;
		this.dataLancamento = dataLancamento;
		this.observacao = observacao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCar_codigo() {
		return contasAReceberCodigo;
	}
	public void setCar_codigo(String contasAReceberCodigo) {
		this.contasAReceberCodigo = contasAReceberCodigo;
	}
	public String getCap_codigo() {
		return contasAPagarCodigo;
	}
	public void setCap_codigo(String contasAPagarCodigo) {
		this.contasAPagarCodigo = contasAPagarCodigo;
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
