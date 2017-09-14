package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.ProdutoDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Produto;

public class ProdutoService {

	public void inserir(Produto produto) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ProdutoDAO(con).inserir(produto);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ProdutoDAO(con).excluir(codigo);
		}
	}

	public List<Produto> listarProdutos() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new ProdutoDAO(con).lista();
		}
	}
	
//	public List<Produto> listarNomeProdutos() throws SQLException {
//		try (Connection con = new ConnectionPoolOracle().getConnection()) {
//			return new ProdutoDAO(con).lista();
//		}
//	}
}
