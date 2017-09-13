package br.com.entra21.amostradetalentos.model;

public class PlanoDeContas {
	
	
	private int codigo;
	private String nome_conta;
	private int saldo;
	private String conta_caixa;
	private String conta_ativa;
	private String confidencial;
	private String centro_de_custo;
	private String codigo_externo;
	
	public PlanoDeContas(int codigo, String nome_conta, int saldo,
			String conta_caixa, String conta_ativa, String confidencial, String centro_de_custo,
			String codigo_externo) {
		super();
		this.codigo = codigo;
		this.nome_conta = nome_conta;
		this.saldo = saldo;
		this.conta_caixa = conta_caixa;
		this.conta_ativa = conta_ativa;
		this.confidencial = confidencial;
		this.centro_de_custo = centro_de_custo;
		this.codigo_externo = codigo_externo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome_conta() {
		return nome_conta;
	}
	public void setNome_conta(String nome_conta) {
		this.nome_conta = nome_conta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getConta_caixa() {
		return conta_caixa;
	}
	public void setConta_caixa(String conta_caixa) {
		this.conta_caixa = conta_caixa;
	}
	public String getConta_ativa() {
		return conta_ativa;
	}
	public void setConta_ativa(String conta_ativa) {
		this.conta_ativa = conta_ativa;
	}
	public String getConfidencial() {
		return confidencial;
	}
	public void setConfidencial(String confidencial) {
		this.confidencial = confidencial;
	}
	public String getCentro_de_custo() {
		return centro_de_custo;
	}
	public void setCentro_de_custo(String centro_de_custo) {
		this.centro_de_custo = centro_de_custo;
	}
	public String getCodigo_externo() {
		return codigo_externo;
	}
	public void setCodigo_externo(String codigo_externo) {
		this.codigo_externo = codigo_externo;
	}
	
	
}
