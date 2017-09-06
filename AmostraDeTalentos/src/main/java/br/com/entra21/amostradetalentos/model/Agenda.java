package br.com.entra21.amostradetalentos.model;

import java.sql.Time;
import java.util.Date;

public class Agenda {
	
	
	private int ag_codigo;
	private String ag_observacao;
	private Date ag_data_do_sistema;
	private Date ag_data_de_inicio;
	private Date ag_data_de_termino;
	private Time ag_hora_inicio;
	private Time ag_hora_termino;
	private String ag_lembrete;
	private String ag_aviso;
	private String ag_ativo;
	private String ag_fechado;
	private String ag_ser_codigo;
	private String ag_atribuido_para;
	
	public Agenda(int ag_codigo, String ag_observacao, Date ag_data_do_sistema, Date ag_data_de_inicio, Date ag_data_de_termino,
			Time ag_hora_inicio, Time ag_hora_termino, String ag_lembrete, String ag_aviso, String ag_ativo, String ag_fechado, String ag_ser_codigo, 
			String ag_atribuido_para) {
		
		this.ag_codigo = ag_codigo;
		this.ag_observacao = ag_observacao;
		this.ag_data_do_sistema = ag_data_do_sistema;
		this.ag_data_de_inicio = ag_data_de_inicio;
		this.ag_data_de_termino = ag_data_de_termino;
		this.ag_hora_inicio = ag_hora_inicio;
		this.ag_hora_termino = ag_hora_termino;
		this.ag_lembrete = ag_lembrete;
		this.ag_aviso = ag_aviso;
		this.ag_ativo = ag_ativo;
		this.ag_fechado = ag_fechado;
		this.ag_ser_codigo = ag_ser_codigo;
		this.ag_atribuido_para = ag_atribuido_para;
		
	}
	public int getAg_codigo() {
		return ag_codigo;
	}
	public void setAg_codigo(int ag_codigo) {
		this.ag_codigo = ag_codigo;
	}
	public String getAg_observacao() {
		return ag_observacao;
	}
	public void setAg_observacao(String ag_observacao) {
		this.ag_observacao = ag_observacao;
	}
	public Date getAg_data_do_sistema() {
		return ag_data_do_sistema;
	}
	public void setAg_data_do_sistema(Date ag_data_do_sistema) {
		this.ag_data_do_sistema = ag_data_do_sistema;
	}
	public Date getAg_data_de_inicio() {
		return ag_data_de_inicio;
	}
	public void setAg_data_de_inicio(Date ag_data_de_inicio) {
		this.ag_data_de_inicio = ag_data_de_inicio;
	}
	public Date getAg_data_de_termino() {
		return ag_data_de_termino;
	}
	public void setAg_data_de_termino(Date ag_data_de_termino) {
		this.ag_data_de_termino = ag_data_de_termino;
	}
	public Time getAg_hora_inicio() {
		return ag_hora_inicio;
	}
	public void setAg_hora_inicio(Time ag_hora_inicio) {
		this.ag_hora_inicio = ag_hora_inicio;
	}
	public Time getAg_hora_termino() {
		return ag_hora_termino;
	}
	public void setAg_hora_termino(Time ag_hora_termino) {
		this.ag_hora_termino = ag_hora_termino;
	}
	public String getAg_lembrete() {
		return ag_lembrete;
	}
	public void setAg_lembrete(String ag_lembrete) {
		this.ag_lembrete = ag_lembrete;
	}
	public String getAg_aviso() {
		return ag_aviso;
	}
	public void setAg_aviso(String ag_aviso) {
		this.ag_aviso = ag_aviso;
	}
	public String getAg_ativo() {
		return ag_ativo;
	}
	public void setAg_ativo(String ag_ativo) {
		this.ag_ativo = ag_ativo;
	}
	public String getAg_fechado() {
		return ag_fechado;
	}
	public void setAg_fechado(String ag_fechado) {
		this.ag_fechado = ag_fechado;
	}
	public String getAg_ser_codigo() {
		return ag_ser_codigo;
	}
	public void setAg_ser_codigo(String ag_ser_codigo) {
		this.ag_ser_codigo = ag_ser_codigo;
	}
	public String getAg_atribuido_para() {
		return ag_atribuido_para;
	}
	public void setAg_atribuido_para(String ag_atribuido_para) {
		this.ag_atribuido_para = ag_atribuido_para;
	}
	
	
	
	
	
}
