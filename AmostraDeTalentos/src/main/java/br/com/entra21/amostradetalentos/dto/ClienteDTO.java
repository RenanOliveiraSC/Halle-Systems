package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.TipoCliente;
import br.com.entra21.amostradetalentos.utils.DateUtils;

public class ClienteDTO {

	private String codigo;
	private String nome;
	private String sobrenome;
	private String codigoGrupocliente;
	private String limite_de_credito;
	private String cpf;
	private String codigoEndereco;
	private String telefone;
	private String celular;
	private String email;
	private String data_nascimento;
	private String sexo;
	private String profissao;
	private String pai_mae;

	public ClienteDTO() {

	}

	public ClienteDTO(String codigo, String nome, String sobrenome, String codigoGrupocliente, String limite_de_credito,
			String cpf, String codigoEndereco, String telefone, String celular, String email, String data_nascimento,
			String sexo, String profissao, String pai_mae) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.codigoGrupocliente = codigoGrupocliente;
		this.limite_de_credito = limite_de_credito;
		this.cpf = cpf;
		this.codigoEndereco = codigoEndereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.profissao = profissao;
		this.pai_mae = pai_mae;
	}

	public ClienteDTO(String id, String nome2, String sobreNome2, String cpf2, String telefone2, String celular2,
			String email2, String dataNascimento, String sexo2, String profissao2, String paiMae) {
		this.codigo = id;
		this.nome = nome2;
		this.sobrenome = sobreNome2;
		this.cpf = cpf2;
		this.telefone = telefone2;
		this.celular = celular2;
		this.email = email2;
		this.data_nascimento = dataNascimento;
		this.sexo = sexo2;
		this.profissao = profissao2;
		this.pai_mae = paiMae;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getCodigoGrupocliente() {
		return codigoGrupocliente;
	}

	public void setCodigoGrupocliente(String codigoGrupocliente) {
		this.codigoGrupocliente = codigoGrupocliente;
	}

	public String getLimite_de_credito() {
		return limite_de_credito;
	}

	public void setLimite_de_credito(String limite_de_credito) {
		this.limite_de_credito = limite_de_credito;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCodigoEndereco() {
		return codigoEndereco;
	}

	public void setCodigoEndereco(String codigoEndereco) {
		this.codigoEndereco = codigoEndereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
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

	public String getPai_mae() {
		return pai_mae;
	}

	public void setPai_mae(String pai_mae) {
		this.pai_mae = pai_mae;
	}

	public Cliente toCliente() {
		return new Cliente(Integer.valueOf(this.codigo), this.nome, this.sobrenome, new TipoCliente(), 
				Integer.valueOf(this.limite_de_credito).intValue(), this.cpf, new Endereco(), this.telefone, 
				this.celular, this.email, DateUtils.parseData(this.data_nascimento, "dd/MM/yyyy"), 
				this.sexo, this.profissao, Integer.valueOf(this.pai_mae).intValue());
	}
}
