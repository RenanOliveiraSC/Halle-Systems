package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.CidadeDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Cidade;
import br.com.entra21.amostradetalentos.model.Estado;

public class CidadeService {

	public void inserir(String nome, Estado estado) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CidadeDAO(con).inserir(nome, estado);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CidadeDAO(con).alterar(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CidadeDAO(con).excluir(codigo);
		}
	}

	public List<Cidade> listarCidades() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CidadeDAO(con).lista();
		}
	}
}
