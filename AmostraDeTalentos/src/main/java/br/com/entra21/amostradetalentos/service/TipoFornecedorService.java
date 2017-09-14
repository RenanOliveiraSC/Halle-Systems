package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.TipoFornecedorDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.TipoFornecedor;

public class TipoFornecedorService {
	
	public void inserir(String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoFornecedorDAO(con).inserir(nome);
		}
	}
	
	public void alterar(int id, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoFornecedorDAO(con).alterar(id, nome);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoFornecedorDAO(con).excluir(id);
		}
	}
	
	public List<TipoFornecedor> lista() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new TipoFornecedorDAO(con).lista();
		}
	}

}
