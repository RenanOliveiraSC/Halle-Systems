package DTO;

import java.sql.Time;
import java.util.Date;

import br.com.entra21.amostradetalentos.model.Agenda;

public class AgendaDTO {

	private int codigo;
	private String observacao;
	private Date dataSistema;
	private Date dataInicio;
	private Date dataTermino;
	private Time horaInicio;
	private Time horaTermino;
	private String lembrete;
	private String aviso;
	private Boolean ativo;
	private Boolean fechado;

	public AgendaDTO() {

	}

	public AgendaDTO(int codigo, String observacao, Date dataSistema, Date dataInicio, Date dataTermino,
			Time horaInicio, Time horaTermino, String lembrete, String aviso, Boolean ativo, Boolean fechado) {
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

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraTermino() {
		return horaTermino;
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

	public Agenda toAgenda() {
		return new Agenda(this.codigo, this.observacao, DateUtils.parseData(this.dataSistema, this.dataInicio, this.dataTermino), this.horaInicio, this.horaTermino, this.lembrete,this.aviso,this.ativo, this.fechado),
				null);
	}
}
