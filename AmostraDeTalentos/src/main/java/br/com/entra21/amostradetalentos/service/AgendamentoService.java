package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.AgendamentoDAO;
import br.com.entra21.amostradetalentos.dto.AgendamentoDTO;
import br.com.entra21.amostradetalentos.dto.AgendamentoMiniDTO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Agendamento;

public class AgendamentoService {

	public void inserir(Agendamento agenda) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new AgendamentoDAO(con).inserir(agenda);
		}
	}
	
	public void alterar(Agendamento agenda) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new AgendamentoDAO(con).alterarAgendamento(agenda);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new AgendamentoDAO(con).excluir(codigo);
		}
	}

	public List<AgendamentoMiniDTO> listarAgenda() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new AgendamentoDAO(con).lista();
		}
	}
	
	public AgendamentoDTO getAgendamentoPeloCodigo(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new AgendamentoDAO(con).getAgendamentoPeloCodigo(codigo.intValue());
		}
	}
}
