package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.TipoClienteDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.TipoCliente;

public class TipoClienteService {
	
	public void inserir(String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoClienteDAO(con).inserir(nome);
		}
	}
	
	public void alterar(int id, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoClienteDAO(con).alterar(id, nome);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoClienteDAO(con).excluir(id);
		}
	}
	
	public List<TipoCliente> lista() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new TipoClienteDAO(con).lista();
		}
	}

}
