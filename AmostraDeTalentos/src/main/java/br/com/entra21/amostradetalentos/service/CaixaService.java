package br.com.entra21.amostradetalentos.service;

import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.CaixaDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Agenda;
import br.com.entra21.amostradetalentos.model.Caixa;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;


public class CaixaService {

	
	public void inserir(Agenda agenda, FormaDePagamento formaDePagamento) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CaixaDAO(con).inserir(agenda, formaDePagamento);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CaixaDAO(con).excluir(id);
		}
	}
	
	public List<Caixa> listarCaixa() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
		return new CaixaDAO(con).lista();
		}
	}
	
}
