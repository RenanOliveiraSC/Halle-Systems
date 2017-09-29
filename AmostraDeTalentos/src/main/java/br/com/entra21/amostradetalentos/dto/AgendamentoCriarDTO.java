package br.com.entra21.amostradetalentos.dto;

public class AgendamentoCriarDTO {

	private String data;
	private String observacao;
	private String codigoCliente;
	private String codigoFuncionario;
	private String codigoServico;

	public AgendamentoCriarDTO(String data, String observacao, String codigoCliente, 
			String codigoFuncionario, String codigoServico) {
		this.data = data;
		this.observacao = observacao;
		this.codigoCliente = codigoCliente;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoServico = codigoServico;
	}

	public AgendamentoCriarDTO() {

	}


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}

}
