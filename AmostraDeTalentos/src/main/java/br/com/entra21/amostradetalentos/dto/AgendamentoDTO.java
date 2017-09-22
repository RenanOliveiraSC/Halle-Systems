package br.com.entra21.amostradetalentos.dto;

import java.util.Date;

import br.com.entra21.amostradetalentos.model.Agendamento;

public class AgendamentoDTO {

	private int codigo;
	private Date horarioAgendadoInicio;
	private Date horarioAgendadoFim;
	private String observacao;
	private Long codigoCliente;
	private Long codigoFuncionario;
	private boolean ativo;
	private boolean concluido;

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
		return new Agendamento(); 
	}
}
