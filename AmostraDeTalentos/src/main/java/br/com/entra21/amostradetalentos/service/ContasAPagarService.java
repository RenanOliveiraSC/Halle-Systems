package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.ContasAPagarDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.ContasAPagar;

public class ContasAPagarService {

	public void inserir(ContasAPagar aPagar) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ContasAPagarDAO(con).inserir(aPagar);
		}
	}

	// public void alterarObservacao(String observacao, String nome) throws
	// SQLException {
	// try (Connection con = new ConnectionPoolOracle().getConnection()) {
	// new ContasAPagarDAO(con).alterarObservacao(1, observacao);
	// }
	// }

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ContasAPagarDAO(con).excluir(codigo);
		}
	}

	public List<ContasAPagar> listarContasAPagar() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new ContasAPagarDAO(con).listaContasAPagar();
		}
	}
}
