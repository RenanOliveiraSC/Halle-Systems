package br.com.entra21.amostradetalentos.dto;

import java.util.Date;

import br.com.entra21.amostradetalentos.model.Agendamento;
import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.Funcionario;
import br.com.entra21.amostradetalentos.model.ServicoProduto;

public class AgendamentoDTO {

	private int codigo;
	private Date horarioAgendadoInicio;
	private Date horarioAgendadoFim;
	private String observacao;
	private Long codigoCliente;
	private Long codigoFuncionario;
	private Long codigoServico;
	private boolean ativo;
	private boolean concluido;

	public AgendamentoDTO(int codigo, Date horarioAgendadoInicio, Date horarioAgendadoFim, String observacao,
			Long codigoCliente, Long codigoFuncionario, Long codigoServico, boolean ativo, boolean concluido) {
		this.codigo = codigo;
		this.horarioAgendadoInicio = horarioAgendadoInicio;
		this.horarioAgendadoFim = horarioAgendadoFim;
		this.observacao = observacao;
		this.codigoCliente = codigoCliente;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoServico = codigoServico;
		this.ativo = ativo;
		this.concluido = concluido;
	}

	public AgendamentoDTO() {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getHorarioAgendadoInicio() {
		return horarioAgendadoInicio;
	}

	public void setHorarioAgendadoInicio(Date horarioAgendadoInicio) {
		this.horarioAgendadoInicio = horarioAgendadoInicio;
	}

	public Date getHorarioAgendadoFim() {
		return horarioAgendadoFim;
	}

	public void setHorarioAgendadoFim(Date horarioAgendadoFim) {
		this.horarioAgendadoFim = horarioAgendadoFim;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Long getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(Long codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public Long getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(Long codigoServico) {
		this.codigoServico = codigoServico;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public Agendamento toAgenda() {
		return new Agendamento(this.codigo, this.horarioAgendadoInicio, this.horarioAgendadoFim, this.observacao,
				this.ativo, this.concluido, new Cliente(), new Funcionario(), new ServicoProduto());
	}
}
