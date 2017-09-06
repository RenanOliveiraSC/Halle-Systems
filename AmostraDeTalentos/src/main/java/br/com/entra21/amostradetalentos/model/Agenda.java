package br.com.entra21.amostradetalentos.model;

import java.sql.Time;
import java.util.Date;

public class Agenda {
	
	
	private int codigo;
	private String observacao;
	private Date data_do_sistema;
	private Date data_de_inicio;
	private Date data_de_termino;
	private Time hora_inicio;
	private Time hora_termino;
	private String lembrete;
	private String aviso;
	private String ativo;
	private String fechado;
	private String ser_codigo;
	private String atribuido_para;
	public Agenda(int codigo, String observacao, Date data_do_sistema, Date data_de_inicio, Date data_de_termino,
			Time hora_inicio, Time hora_termino, String lembrete, String aviso, String ativo, String fechado,
			String ser_codigo, String atribuido_para) {
		super();
		this.codigo = codigo;
		this.observacao = observacao;
		this.data_do_sistema = data_do_sistema;
		this.data_de_inicio = data_de_inicio;
		this.data_de_termino = data_de_termino;
		this.hora_inicio = hora_inicio;
		this.hora_termino = hora_termino;
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
		return data_do_sistema;
	}
	public void setData_do_sistema(Date data_do_sistema) {
		this.data_do_sistema = data_do_sistema;
	}
	public Date getData_de_inicio() {
		return data_de_inicio;
	}
	public void setData_de_inicio(Date data_de_inicio) {
		this.data_de_inicio = data_de_inicio;
	}
	public Date getData_de_termino() {
		return data_de_termino;
	}
	public void setData_de_termino(Date data_de_termino) {
		this.data_de_termino = data_de_termino;
	}
	public Time getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(Time hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public Time getHora_termino() {
		return hora_termino;
	}
	public void setHora_termino(Time hora_termino) {
		this.hora_termino = hora_termino;
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
