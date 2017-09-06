package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.PaisDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.*;
import br.com.entra21.amostradetalentos.model.Pais;

public class PaisService {

	public void inserir(String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PaisDAO(con).inserir(nome);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PaisDAO(con).alterar(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PaisDAO(con).excluir(codigo);
		}
	}

	public List<Pais> listarPaises() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new PaisDAO(con).lista();
		}
	}
}
