package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Agenda;
import br.com.entra21.amostradetalentos.utils.DateUtils;
import br.com.entra21.amostradetalentos.utils.TimeUtils;

public class AgendaDTO {

	private int codigo;
	private String observacao;
	private String dataSistema;
	private String dataInicio;
	private String dataTermino;
	private String horaInicio;
	private String horaTermino;
	private String lembrete;
	private String aviso;
	private Boolean ativo;
	private Boolean fechado;

	public AgendaDTO() {

	}

	public AgendaDTO(int codigo, String observacao, String dataSistema, String dataInicio, String dataTermino,
			String horaInicio, String horaTermino, String lembrete, String aviso, Boolean ativo, Boolean fechado) {
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

	public String getDataSistema() {
		return dataSistema;
	}

	public void setDataSistema(String dataSistema) {
		this.dataSistema = dataSistema;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(String horaTermino) {
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

	public Agenda toAgenda() {
		return new Agenda(
				this.codigo, 
				this.observacao,
				DateUtils.parseData(this.dataSistema, DateUtils.PATTERN_DATA_PADRAO),
				DateUtils.parseData(this.dataInicio, DateUtils.PATTERN_DATA_PADRAO), 
				DateUtils.parseData(this.dataTermino, DateUtils.PATTERN_DATA_PADRAO),
				TimeUtils.parseTime(this.horaInicio, TimeUtils.PATTERN_TIME_PADRAO),
				TimeUtils.parseTime(this.horaTermino, TimeUtils.PATTERN_TIME_PADRAO),
				this.lembrete,
				this.aviso,
				this.ativo, 
				this.fechado
				);
	}
}
