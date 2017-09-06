package br.com.entra21.amostradetalentos.model;

public class Endereco {

	private int end_codigo;
	private String end_tipo_de_logradouro;
	private String end_rua;
	private int end_rua_numero;
	private String end_complemento;
	private String end_cep;
	private String end_bairro;
	private int end_cid_codigo;
	
	public Endereco(int end_codigo, String end_tipo_de_logradouro, String end_rua, int end_rua_numero,
			String end_complemento, String end_cep, String end_bairro, int end_cid_codigo) {
		super();
		this.end_codigo = end_codigo;
		this.end_tipo_de_logradouro = end_tipo_de_logradouro;
		this.end_rua = end_rua;
		this.end_rua_numero = end_rua_numero;
		this.end_complemento = end_complemento;
		this.end_cep = end_cep;
		this.end_bairro = end_bairro;
		this.end_cid_codigo = end_cid_codigo;
	}

	public int getEnd_codigo() {
		return end_codigo;
	}

	public void setEnd_codigo(int end_codigo) {
		this.end_codigo = end_codigo;
	}

	public String getEnd_tipo_de_logradouro() {
		return end_tipo_de_logradouro;
	}

	public void setEnd_tipo_de_logradouro(String end_tipo_de_logradouro) {
		this.end_tipo_de_logradouro = end_tipo_de_logradouro;
	}

	public String getEnd_rua() {
		return end_rua;
	}

	public void setEnd_rua(String end_rua) {
		this.end_rua = end_rua;
	}

	public int getEnd_rua_numero() {
		return end_rua_numero;
	}

	public void setEnd_rua_numero(int end_rua_numero) {
		this.end_rua_numero = end_rua_numero;
	}

	public String getEnd_complemento() {
		return end_complemento;
	}

	public void setEnd_complemento(String end_complemento) {
		this.end_complemento = end_complemento;
	}

	public String getEnd_cep() {
		return end_cep;
	}

	public void setEnd_cep(String end_cep) {
		this.end_cep = end_cep;
	}

	public String getEnd_bairro() {
		return end_bairro;
	}

	public void setEnd_bairro(String end_bairro) {
		this.end_bairro = end_bairro;
	}

	public int getEnd_cid_codigo() {
		return end_cid_codigo;
	}

	public void setEnd_cid_codigo(int end_cid_codigo) {
		this.end_cid_codigo = end_cid_codigo;
	}
	
	
	
	
}
