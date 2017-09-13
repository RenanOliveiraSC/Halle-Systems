package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.DepositoDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Deposito;

public class DepositoService {

	public void inserir(String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new DepositoDAO(con).inserir(nome);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new DepositoDAO(con).alterar(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new DepositoDAO(con).excluir(codigo);
		}
	}

	public List<Deposito> listarFabricante() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new DepositoDAO(con).lista();
		}
	}
}
