package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Agendamento;

public class AgendamentoDTO {

	private int codigo;
	private String horarioAgendadoInicio;
	private String horarioAgendadoFim;
	private String observacao;
	private String nomeCliente;
	private String nomeFuncionario;
	private String descricaoServico;
	private boolean ativo;
	private boolean concluido;

	public AgendamentoDTO(int codigo, String horarioAgendadoInicio, String horarioAgendadoFim, String observacao, 
			String nomeCliente, String nomeFuncionario, String descricaoServico, boolean ativo, boolean concluido) {
		this.codigo = codigo;
		this.horarioAgendadoInicio = horarioAgendadoInicio;
		this.horarioAgendadoFim = horarioAgendadoFim;
		this.observacao = observacao;
		this.nomeCliente = nomeCliente;
		this.nomeFuncionario = nomeFuncionario;
		this.descricaoServico = descricaoServico;
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

	public String getHorarioAgendadoInicio() {
		return horarioAgendadoInicio;
	}

	public void setHorarioAgendadoInicio(String horarioAgendadoInicio) {
		this.horarioAgendadoInicio = horarioAgendadoInicio;
	}

	public String getHorarioAgendadoFim() {
		return horarioAgendadoFim;
	}

	public void setHorarioAgendadoFim(String horarioAgendadoFim) {
		this.horarioAgendadoFim = horarioAgendadoFim;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
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
