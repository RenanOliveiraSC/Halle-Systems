package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.EstadoDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Estado;

public class EstadoService {

	public void inserir(String nome, String sigla) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new EstadoDAO(con).inserir(nome, sigla);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new EstadoDAO(con).alterar(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new EstadoDAO(con).excluir(codigo);
		}
	}

	public List<Estado> listarEstados() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new EstadoDAO(con).lista();
		}
	}
}
