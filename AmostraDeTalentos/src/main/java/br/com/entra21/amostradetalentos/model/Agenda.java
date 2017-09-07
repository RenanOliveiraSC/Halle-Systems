package br.com.entra21.amostradetalentos.model;

import java.sql.Time;
import java.util.Date;

public class Agenda {
	
	
	private int codigo;
	private String observacao;
	private Date dataSistema;
	private Date dataInicio;
	private Date dataTermino;
	private Time horaInicio;
	private Time horaTermino;
	private String lembrete;
	private String aviso;
	private String ativo;
	private String fechado;
	private String ser_codigo;
	private String atribuido_para;
	public Agenda(int codigo, String observacao, Date dataSistema, Date dataInicio, Date dataTermino,
			Time horaInicio, Time horaTermino, String lembrete, String aviso, String ativo, String fechado,
			String ser_codigo, String atribuido_para) {
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
		this.ser_codigo = ser_codigo;
		this.atribuido_para = atribuido_para;
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
	public Date getData_do_sistema() {
		return dataSistema;
	}
	public void setData_do_sistema(Date dataSistema) {
		this.dataSistema = dataSistema;
	}
	public Date getData_de_inicio() {
		return dataInicio;
	}
	public void setData_de_inicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getData_de_termino() {
		return dataTermino;
	}
	public void setData_de_termino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public Time getHora_inicio() {
		return horaInicio;
	}
	public void setHora_inicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Time getHora_termino() {
		return horaTermino;
	}
	public void setHora_termino(Time horaTermino) {
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
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public String getFechado() {
		return fechado;
	}
	public void setFechado(String fechado) {
		this.fechado = fechado;
	}
	public String getSer_codigo() {
		return ser_codigo;
	}
	public void setSer_codigo(String ser_codigo) {
		this.ser_codigo = ser_codigo;
	}
	public String getAtribuido_para() {
		return atribuido_para;
	}
	public void setAtribuido_para(String atribuido_para) {
		this.atribuido_para = atribuido_para;
	}
	
	
}
