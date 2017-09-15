package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import DTO.AgendaDTO;
import br.com.entra21.amostradetalentos.dao.AgendaDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Agenda;

public class AgendaService {

	public void inserir(Agenda agenda) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new AgendaDAO(con).inserir(agenda);
		}
	}

	// public void alterarNome(Agenda agenda) throws SQLException {
	// try (Connection con = new ConnectionPoolOracle().getConnection()) {
	// new AgendaDAO(con).alterarNome(id, nome);
	// }
	// }

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new AgendaDAO(con).excluir(codigo);
		}
	}

	public List<AgendaDTO> listarAgenda() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new AgendaDAO(con).lista();
		}
	}
}
