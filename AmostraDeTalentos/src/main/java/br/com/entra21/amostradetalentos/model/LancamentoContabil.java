package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabil {

	private int codigo;
	private ContasAPagar contasAPagar;
	private ContasAReceber contasAReceber;
	private Date dataLancamento;
	private String observacao;
	
	public LancamentoContabil(int codigo, ContasAReceber contasAReceber, ContasAPagar contasAPagar, Date dataLancamento,
			String observacao) {
		super();
		this.codigo = codigo;
		this.contasAReceber = contasAReceber;
		this.contasAPagar = contasAPagar;
		this.dataLancamento = dataLancamento;
		this.observacao = observacao;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public ContasAPagar getContasAPagar() {
		return contasAPagar;
	}
	public void setContasAPagar(ContasAPagar contasAPagar) {
		this.contasAPagar = contasAPagar;
	}
	public ContasAReceber getContasAReceber() {
		return contasAReceber;
	}
	public void setContasAReceber(ContasAReceber contasAReceber) {
		this.contasAReceber = contasAReceber;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
		
}
