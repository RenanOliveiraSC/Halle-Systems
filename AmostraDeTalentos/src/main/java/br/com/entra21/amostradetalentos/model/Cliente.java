package br.com.entra21.amostradetalentos.model;

import java.util.Date;

public class Cliente {
	
	
	private int cli_cliente;
	private String cli_nome;
	private String cli_sobrenome;
	private int cli_grupo;
	private int cli_limite_de_credito;
	private String cli_cpf;
	private String cli_endereco;
	private String cli_telefone;
	private String cli_celular;
	private String cli_email;
	private Date cli_data_nascimento;
	private String cli_sexo;
	private String cli_profissao;
	private int cli_pai_mae;
	
	
	public Cliente(int cli_cliente, String cli_nome, String cli_sobrenome, int cli_grupo, int cli_limite_de_credito,
			String cli_cpf, String cli_endereco, String cli_telefone, String cli_celular, String cli_email,
			Date cli_data_nascimento, String cli_sexo, String cli_profissao, int cli_pai_mae) {
		super();
		this.cli_cliente = cli_cliente;
		this.cli_nome = cli_nome;
		this.cli_sobrenome = cli_sobrenome;
		this.cli_grupo = cli_grupo;
		this.cli_limite_de_credito = cli_limite_de_credito;
		this.cli_cpf = cli_cpf;
		this.cli_endereco = cli_endereco;
		this.cli_telefone = cli_telefone;
		this.cli_celular = cli_celular;
		this.cli_email = cli_email;
		this.cli_data_nascimento = cli_data_nascimento;
		this.cli_sexo = cli_sexo;
		this.cli_profissao = cli_profissao;
		this.cli_pai_mae = cli_pai_mae;
	}
	
	public int getCli_cliente() {
		return cli_cliente;
	}
	public void setCli_cliente(int cli_cliente) {
		this.cli_cliente = cli_cliente;
	}
	public String getCli_nome() {
		return cli_nome;
	}
	public void setCli_nome(String cli_nome) {
		this.cli_nome = cli_nome;
	}
	public String getCli_sobrenome() {
		return cli_sobrenome;
	}
	public void setCli_sobrenome(String cli_sobrenome) {
		this.cli_sobrenome = cli_sobrenome;
	}
	public int getCli_grupo() {
		return cli_grupo;
	}
	public void setCli_grupo(int cli_grupo) {
		this.cli_grupo = cli_grupo;
	}
	public int getCli_limite_de_credito() {
		return cli_limite_de_credito;
	}
	public void setCli_limite_de_credito(int cli_limite_de_credito) {
		this.cli_limite_de_credito = cli_limite_de_credito;
	}
	public String getCli_cpf() {
		return cli_cpf;
	}
	public void setCli_cpf(String cli_cpf) {
		this.cli_cpf = cli_cpf;
	}
	public String getCli_endereco() {
		return cli_endereco;
	}
	public void setCli_endereco(String cli_endereco) {
		this.cli_endereco = cli_endereco;
	}
	public String getCli_telefone() {
		return cli_telefone;
	}
	public void setCli_telefone(String cli_telefone) {
		this.cli_telefone = cli_telefone;
	}
	public String getCli_celular() {
		return cli_celular;
	}
	public void setCli_celular(String cli_celular) {
		this.cli_celular = cli_celular;
	}
	public String getCli_email() {
		return cli_email;
	}
	public void setCli_email(String cli_email) {
		this.cli_email = cli_email;
	}
	public Date getCli_data_nascimento() {
		return cli_data_nascimento;
	}
	public void setCli_data_nascimento(Date cli_data_nascimento) {
		this.cli_data_nascimento = cli_data_nascimento;
	}
	public String getCli_sexo() {
		return cli_sexo;
	}
	public void setCli_sexo(String cli_sexo) {
		this.cli_sexo = cli_sexo;
	}
	public String getCli_profissao() {
		return cli_profissao;
	}
	public void setCli_profissao(String cli_profissao) {
		this.cli_profissao = cli_profissao;
	}
	public int getCli_pai_mae() {
		return cli_pai_mae;
	}
	public void setCli_pai_mae(int cli_pai_mae) {
		this.cli_pai_mae = cli_pai_mae;
	}
	
	
	
}
