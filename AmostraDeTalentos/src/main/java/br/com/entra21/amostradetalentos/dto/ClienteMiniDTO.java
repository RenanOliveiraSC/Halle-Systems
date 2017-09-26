package br.com.entra21.amostradetalentos.dto;

public class ClienteMiniDTO {

	private Integer codigo;
	private String nome;
	private String cpf;

	public ClienteMiniDTO() {

	}

	public ClienteMiniDTO(int codigo, String nome, String cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
