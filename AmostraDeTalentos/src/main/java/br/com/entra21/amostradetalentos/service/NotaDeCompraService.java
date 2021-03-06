package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.NotaDeCompraDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Estado;
import br.com.entra21.amostradetalentos.model.NotaDeCompra;

public class NotaDeCompraService {
	
	public void inserir(NotaDeCompra notaDeCompra) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new NotaDeCompraDAO(con).inserir(notaDeCompra);
		}
	}
	
	public void alterarFornecedor(int id, String fornecedor) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new NotaDeCompraDAO(con).alterarFornecedor(id, fornecedor);
		}
	}
	
	public void alterarObservacao(int id, String observacao) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new NotaDeCompraDAO(con).alterarObservacao(id, observacao);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new NotaDeCompraDAO(con).excluir(id);
		}
	}
	
	public List<Estado> lista() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new NotaDeCompraDAO(con).lista();
		}
	}

}
