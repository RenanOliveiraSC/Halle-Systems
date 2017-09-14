package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.ListaPrecoDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.ListaDePreco;

public class ListaDePrecoService {

	public void inserir(String nome, double fator) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ListaPrecoDAO(con).inserir(nome, fator);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ListaPrecoDAO(con).alterarNome(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ListaPrecoDAO(con).excluir(codigo);
		}
	}

	public List<ListaDePreco> listarListaDePreco() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new ListaPrecoDAO(con).lista();
		}
	}
}
