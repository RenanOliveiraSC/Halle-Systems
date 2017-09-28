package br.com.entra21.amostradetalentos.dto;

public class ServicoPrestadoMiniDTO {

	private Integer codigo;
	private String descricao;

	public ServicoPrestadoMiniDTO() {

	}

	public ServicoPrestadoMiniDTO(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
