package br.com.entra21.amostradetalentos.model;

import java.util.Date;

import br.com.entra21.amostradetalentos.dto.AgendamentoDTO;
import br.com.entra21.amostradetalentos.utils.DateUtils;

public class Agendamento {

	private int codigo;
	private Date dataHoraInicio;
	private Date dataHoraFim;
	private String observacao;
	private boolean ativo;
	private boolean concluido;
	private Cliente cliente;
	private Funcionario funcionario;
	private ServicoProduto servicoPrestado;

	public Agendamento() {
		// TODO Auto-generated constructor stub
	}

	public Agendamento(int codigo, Date dataHoraInicio, Date dataHoraFim, String observacao, boolean ativo,
			boolean concluido, Cliente cliente, Funcionario funcionario, ServicoProduto servicoPrestado) {
		super();
		this.codigo = codigo;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.observacao = observacao;
		this.ativo = ativo;
		this.concluido = concluido;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.servicoPrestado = servicoPrestado;
	}

	@Override
	public String toString() {
		return this.getCodigo() + " " + this.getObservacao() + " " + this.getDataHoraInicio() + " "
				+ this.getDataHoraFim();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ServicoProduto getServicoPrestado() {
		return servicoPrestado;
	}

	public void setServicoPrestado(ServicoProduto servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}

	public AgendamentoDTO toDTO() {
		return new AgendamentoDTO(this.codigo, DateUtils.formatData(this.dataHoraInicio, DateUtils.PATTERN_DATA_PADRAO),
				DateUtils.formatData(this.dataHoraFim, DateUtils.PATTERN_DATA_PADRAO), this.observacao,
				new Cliente().getNome(), new Funcionario().getNome(), new Servico().getDescricao(), this.ativo,
				this.concluido);
	}

}
