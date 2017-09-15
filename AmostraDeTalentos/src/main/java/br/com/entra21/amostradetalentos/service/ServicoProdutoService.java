package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.ServicoProdutoDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.ServicoProduto;

public class ServicoProdutoService {
	
	public void inserirSalvaAgenda(ServicoProduto servicoProduto) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new ServicoProdutoDAO(con).inserirServicoProduto(servicoProduto);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new ServicoProdutoDAO(con).excluir(id);
		}
	}

}
