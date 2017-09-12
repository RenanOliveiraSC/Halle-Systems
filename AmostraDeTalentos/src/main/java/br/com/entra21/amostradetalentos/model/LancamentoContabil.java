package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class LancamentoContabil {

	private int codigo;
	private Contas_a_Pagar contasAPagar;
	private Contas_a_Receber contasAReceber;
	private Date dataLancamento;
	private String observacao;
	
	
	public LancamentoContabil(int codigo, Contas_a_Receber contasAReceber, Contas_a_Pagar contasAPagar, Date dataLancamento,
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
	public Contas_a_Pagar getContasAPagar() {
		return contasAPagar;
	}
	public void setContasAPagar(Contas_a_Pagar contasAPagar) {
		this.contasAPagar = contasAPagar;
	}
	public Contas_a_Receber getContasAReceber() {
		return contasAReceber;
	}
	public void setContasAReceber(Contas_a_Receber contasAReceber) {
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
