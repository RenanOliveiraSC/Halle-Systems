package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.SalvaAgendaDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.SalvaAgenda;

public class SalvaAgendaService {
	
	public void inserirSalvaAgenda(SalvaAgenda salvaAgenda) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new SalvaAgendaDAO(con).inserirSalvaAgenda(salvaAgenda);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new SalvaAgendaDAO(con).excluir(id);
		}
	}

}
