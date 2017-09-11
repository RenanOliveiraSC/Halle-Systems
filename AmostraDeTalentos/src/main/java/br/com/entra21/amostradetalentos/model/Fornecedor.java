package br.com.entra21.amostradetalentos.model;

public class Fornecedor {

	private Integer codigo;
	private String nome;
	private TipoFornecedor tipoFornecedor;
	private String contato;
	private String cnpj;
	private Endereco endereco;
	private String telefone;
	private String celular;
	private String email;

	public Fornecedor() {
		super();
	}

	public Fornecedor(Integer codigo, String nome, TipoFornecedor tipoFornecedor, String contato, String cnpj,
			Endereco endereco, String telefone, String celular, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipoFornecedor = tipoFornecedor;
		this.contato = contato;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}

	public Fornecedor(String nome, TipoFornecedor tipoFornecedor, String contato, String cnpj, Endereco endereco,
			String telefone, String celular, String email) {
		this.nome = nome;
		this.tipoFornecedor = tipoFornecedor;
		this.contato = contato;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
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

}
