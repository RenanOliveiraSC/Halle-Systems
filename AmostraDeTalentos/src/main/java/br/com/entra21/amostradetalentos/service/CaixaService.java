package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.CaixaDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Caixa;


public class CaixaService {

	
	public void inserir(Caixa caixa) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CaixaDAO(con).inserir(caixa);
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
