package br.com.entra21.amostradetalentos.model;

public class Forncedor {

	private Integer codigo;
	private String nome;
	private TipoFornecedor tipoFornecedor;
	private String contato;
	private String cnpj;
	private Endereco endereco;
	private String telefone;
	private String celular;
	private String email;
	private ContaContabil contaContabil;

	public Forncedor() {
		super();
	}

	public Forncedor(Integer codigo, String nome, TipoFornecedor tipoFornecedor, String contato, String cnpj,
			Endereco endereco, String telefone, String celular, String email, ContaContabil contaContabil) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipoFornecedor = tipoFornecedor;
		this.contato = contato;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.contaContabil = contaContabil;
	}

	public Forncedor(String nome, TipoFornecedor tipoFornecedor, String contato, String cnpj, Endereco endereco,
			String telefone, String celular, String email, ContaContabil contaContabil) {
		this.nome = nome;
		this.tipoFornecedor = tipoFornecedor;
		this.contato = contato;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.contaContabil = contaContabil;
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

	public TipoFornecedor getTipoFornecedor() {
		return tipoFornecedor;
	}

	public void setTipoFornecedor(TipoFornecedor tipoFornecedor) {
		this.tipoFornecedor = tipoFornecedor;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public ContaContabil getContaContabil() {
		return contaContabil;
	}

	public void setContaContabil(ContaContabil contaContabil) {
		this.contaContabil = contaContabil;
	}

}
