package br.com.entra21.amostradetalentos.model;

public class Endereco {

	private int codigo;
	private String tipo_de_logradouro;
	private String rua;
	private int rua_numero;
	private String complemento;
	private String cep;
	private String bairro;
	private Cidade cidade;

	public Endereco() {

	}

	public Endereco(int codigo, String tipo_de_logradouro, String rua, int rua_numero, String complemento, String cep,
			String bairro, Cidade cidade) {
		super();
		this.codigo = codigo;
		this.tipo_de_logradouro = tipo_de_logradouro;
		this.rua = rua;
		this.rua_numero = rua_numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco(int codigo, String tipo_de_logradouro, String rua, int rua_numero, String complemento, String cep,
			String bairro) {
		super();
		this.codigo = codigo;
		this.tipo_de_logradouro = tipo_de_logradouro;
		this.rua = rua;
		this.rua_numero = rua_numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo_de_logradouro() {
		return tipo_de_logradouro;
	}

	public void setTipo_de_logradouro(String tipo_de_logradouro) {
		this.tipo_de_logradouro = tipo_de_logradouro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getRua_numero() {
		return rua_numero;
	}

	public void setRua_numero(int rua_numero) {
		this.rua_numero = rua_numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
