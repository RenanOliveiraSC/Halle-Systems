package br.com.entra21.amostradetalentos.model;

import java.sql.Time;
import java.util.Date;

import br.com.entra21.amostradetalentos.utils.DateUtils;
import br.com.entra21.amostradetalentos.utils.TimeUtils;
import dto.AgendaDTO;

public class Agenda {

	private int codigo;
	private String observacao;
	private Date dataSistema;
	private Date dataInicio;
	private Date dataTermino;
	private Date horaInicio;
	private Date horaTermino;
	private String lembrete;
	private String aviso;
	private Boolean ativo;
	private Boolean fechado;

	public Agenda(int codigo, 
			String observacao, 
			Date dataSistema, 
			Date dataInicio, 
			Date dataTermino, 
			Date horaInicio,
			Date horaTermino, 
			String lembrete, 
			String aviso, 
			Boolean ativo, 
			Boolean fechado) {
		super();
		
		this.codigo = codigo;
		this.observacao = observacao;
		this.dataSistema = dataSistema;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
		this.lembrete = lembrete;
		this.aviso = aviso;
		this.ativo = ativo;
		this.fechado = fechado;
	}
	
	@Override
	public String toString() {
		return this.getCodigo() + " " + this.getAviso() + " " + this.getDataInicio() + " " + this.getHoraInicio();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataSistema() {
		return dataSistema;
	}

	public void setDataSistema(Date dataSistema) {
		this.dataSistema = dataSistema;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(Date horaTermino) {
		this.horaTermino = horaTermino;
	}

	public void setHoraTermino(Time horaTermino) {
		this.horaTermino = horaTermino;
	}

	public String getLembrete() {
		return lembrete;
	}

	public void setLembrete(String lembrete) {
		this.lembrete = lembrete;
	}

	public String getAviso() {
		return aviso;
	}

	public void setAviso(String aviso) {
		this.aviso = aviso;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getFechado() {
		return fechado;
	}

	public void setFechado(Boolean fechado) {
		this.fechado = fechado;
	}
	
	public AgendaDTO toDTO() {
		return new AgendaDTO(this.getCodigo(), 
				this.getObservacao(),
				DateUtils.formatData(this.getDataSistema(), DateUtils.PATTERN_DATA_PADRAO),
				DateUtils.formatData(this.getDataInicio(), DateUtils.PATTERN_DATA_PADRAO), 
				DateUtils.formatData(this.getDataTermino(), DateUtils.PATTERN_DATA_PADRAO),
				TimeUtils.formatTime(this.getHoraInicio(), TimeUtils.PATTERN_TIME_PADRAO),
				TimeUtils.formatTime(this.getHoraTermino(), TimeUtils.PATTERN_TIME_PADRAO),
				this.getLembrete(),
				this.getAviso(),
				this.getAtivo(), 
				this.getFechado());
	}

}
