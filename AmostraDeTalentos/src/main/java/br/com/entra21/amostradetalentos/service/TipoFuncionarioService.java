package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.TipoFuncionarioDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.TipoFuncionario;

public class TipoFuncionarioService {
	
	public void inserir(String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoFuncionarioDAO(con).inserir(nome);
		}
	}
	
	public void alterar(int id, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoFuncionarioDAO(con).alterar(id, nome);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoFuncionarioDAO(con).excluir(id);
		}
	}
	
	public List<TipoFuncionario> lista() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new TipoFuncionarioDAO(con).lista();
		}
	}

}
