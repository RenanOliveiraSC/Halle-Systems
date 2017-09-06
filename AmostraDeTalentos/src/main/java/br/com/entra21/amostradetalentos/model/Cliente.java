package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class Cliente {
	
	
	private int cliente;
	private String nome;
	private String sobrenome;
	private int grupo;
	private int limite_de_credito;
	private String cpf;
	private String endereco;
	private String elefone;
	private String celular;
	private String email;
	private Date data_nascimento;
	private String sexo;
	private String profissao;
	private int pai_mae;
	public Cliente(int cliente, String nome, String sobrenome, int grupo, int limite_de_credito, String cpf,
			String endereco, String elefone, String celular, String email, Date data_nascimento, String sexo,
			String profissao, int pai_mae) {
		super();
		this.cliente = cliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.grupo = grupo;
		this.limite_de_credito = limite_de_credito;
		this.cpf = cpf;
		this.endereco = endereco;
		this.elefone = elefone;
		this.celular = celular;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.profissao = profissao;
		this.pai_mae = pai_mae;
	}
	
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	public int getLimite_de_credito() {
		return limite_de_credito;
	}
	public void setLimite_de_credito(int limite_de_credito) {
		this.limite_de_credito = limite_de_credito;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getElefone() {
		return elefone;
	}
	public void setElefone(String elefone) {
		this.elefone = elefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getPai_mae() {
		return pai_mae;
	}
	public void setPai_mae(int pai_mae) {
		this.pai_mae = pai_mae;
	}
	
	
		
}
