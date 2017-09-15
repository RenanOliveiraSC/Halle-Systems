package DTO;

import java.util.Date;

import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.TipoCliente;

public class ClienteDTO {

	private Integer codigo;
	private String nome;
	private String sobrenome;
	private TipoCliente grupocliente;
	private int limite_de_credito;
	private String cpf;
	private Endereco endereco;
	private String telefone;
	private String celular;
	private String email;
	private Date data_nascimento;
	private String sexo;
	private String profissao;
	private int pai_mae;

	public ClienteDTO() {

	}

	public ClienteDTO(int codigo, String nome, String sobrenome, TipoCliente grupocliente, int limite_de_credito,
			String cpf, Endereco endereco, String telefone, String celular, String email, Date data_nascimento,
			String sexo, String profissao, int pai_mae) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.grupocliente = grupocliente;
		this.limite_de_credito = limite_de_credito;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.profissao = profissao;
		this.pai_mae = pai_mae;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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

	public TipoCliente getGrupocliente() {
		return grupocliente;
	}

	public void setGrupocliente(TipoCliente grupocliente) {
		this.grupocliente = grupocliente;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public Cliente toCliente() {
		return new Cliente(this.codigo, this.nome, this.sobrenome, this.grupocliente, this.limite_de_credito, this.cpf,
				this.endereco, this.telefone, this.celular, this.email, this.data_nascimento, this.sexo, this.profissao,
				this.pai_mae);
	}
}
