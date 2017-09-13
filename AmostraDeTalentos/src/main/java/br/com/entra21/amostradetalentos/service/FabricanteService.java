package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.FabricanteDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Fabricante;

public class FabricanteService {

	public void inserir(String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FabricanteDAO(con).inserir(nome);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FabricanteDAO(con).alterar(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FabricanteDAO(con).excluir(codigo);
		}
	}

	public List<Fabricante> listarFabricante() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new FabricanteDAO(con).lista();
		}
	}
}
