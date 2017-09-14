package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.FormaPagamentoDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;

public class FormaPagamentoService {
	
	public void inserir(String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new FormaPagamentoDAO(con).inserir(nome);
		}
	}
	
	public void alterar(int id, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new FormaPagamentoDAO(con).alterar(id, nome);
		}
	}
	
	public void excluir(int id) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new FormaPagamentoDAO(con).excluir(id);
		}
	}
	
	public List<FormaDePagamento> lista() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new FormaPagamentoDAO(con).lista();
		}
	}

}
