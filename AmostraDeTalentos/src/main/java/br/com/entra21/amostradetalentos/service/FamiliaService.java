package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.FamiliaDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Familia;

public class FamiliaService {

	public void inserir(String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FamiliaDAO(con).inserir(nome);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FamiliaDAO(con).alterar(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FamiliaDAO(con).excluir(codigo);
		}
	}

	public List<Familia> listarFamilias() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new FamiliaDAO(con).lista();
		}
	}
}
