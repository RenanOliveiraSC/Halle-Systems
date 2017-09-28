package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Agendamento;
import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.Funcionario;
import br.com.entra21.amostradetalentos.model.ServicoProduto;
import br.com.entra21.amostradetalentos.utils.DateUtils;

public class AgendamentoDTO {

	private String codigo;
	private String data;
	private String observacao;
	private String codigoCliente;
	private String codigoFuncionario;
	private String codigoServico;
	private String ativo;
	private String concluido;

	public AgendamentoDTO(String codigo, String data, String observacao, String codigoCliente, 
			String codigoFuncionario, String codigoServico, String ativo, String concluido) {
		this.codigo = codigo;
		this.data = data;
		this.observacao = observacao;
		this.codigoCliente = codigoCliente;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoServico = codigoServico;
		this.ativo = ativo;
		this.concluido = concluido;
	}

	public AgendamentoDTO() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getConcluido() {
		return concluido;
	}

	public void setConcluido(String concluido) {
		this.concluido = concluido;
	}

	public Agendamento toAgenda() {
		return new Agendamento(Integer.valueOf(this.codigo), DateUtils.parseData(this.data, "yyyy-MM-dd HH:mm"), null, this.observacao, 
			"S".equals(this.ativo), "S".equals(this.concluido), new Cliente(), new Funcionario(), new ServicoProduto());
	}
}
