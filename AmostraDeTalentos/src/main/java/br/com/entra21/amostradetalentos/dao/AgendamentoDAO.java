package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.AgendamentoDTO;
import br.com.entra21.amostradetalentos.model.Agendamento;

public class AgendamentoDAO {

	private final Connection con;

	public AgendamentoDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Agendamento agendamento) throws SQLException {
		String sql = "INSERT INTO AGENDAMENTO (AG_CODIGO, AG_OBSERVACAO, AG_DATA_INICIO, AG_DATA_TERMINO, AG_ATIVO, "
				+ "AG_CONCLUIDO, AG_CLI_CODIGO, AG_FUN_CODIGO, AG_SP_CODIGO) VALUES (SEQ_AGENDA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);

		statement.setString(0, agendamento.getObservacao());
		statement.setDate(1, (Date) agendamento.getDataHoraInicio());
		statement.setDate(2, (Date) agendamento.getDataHoraFim());
		statement.setBoolean(3, agendamento.isAtivo());
		statement.setBoolean(4, agendamento.isConcluido());
		statement.setLong(5, agendamento.getCliente().getCodigo());
		statement.setLong(6, agendamento.getFuncionario().getCodigo());
		statement.setLong(7, agendamento.getServicoPrestado().getCodigo());

		return statement.executeUpdate() > 0;
	}


	public boolean alterarAgendamento(Agendamento agendamento) throws SQLException {
		String sql = "UPDATE AGENDAMENTO SET AG_OBSERVACAO = ?, "
				+ " AG_OBSERVACAO = ?, "
				+ " AG_DATA_INICIO = ?, "
				+ " AG_DATA_TERMINO = ?, "
				+ " AG_FUN_CODIGO = ?, "
				+ " AG_SP_CODIGO = ? "
				+ " WHERE AG_CODIGO = ? ";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(0, agendamento.getObservacao());
		statement.setDate(1, (Date) agendamento.getDataHoraInicio());
		statement.setDate(2, (Date) agendamento.getDataHoraFim());
		statement.setLong(3, agendamento.getFuncionario().getCodigo());
		statement.setLong(4, agendamento.getServicoPrestado().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean cancelarAgendamento(int id) throws SQLException {
		String sql = "UPDATE AGENDAMENTO SET AG_ATIVO = 1 WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(0, id);

		return statement.executeUpdate() > 0;
	}

	public boolean concluirAgendamento(int id) throws SQLException {
		String sql = "UPDATE AGENDAMENTO SET AG_CONCLUIDO = 0 WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(0, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE AGENDAMENTO WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(0, id);

		return statement.executeUpdate() > 0;
	}

	public List<AgendamentoDTO> lista() throws SQLException {
		List<AgendamentoDTO> lAgenda = new ArrayList<>();

		String sql = "select * from AGENDAMENTO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("AG_CODIGO");
					String observacao = rs.getString("AG_OBSERVACAO");
					Date dataHoraInicio = rs.getDate("AG_DATA_INICIO");
					Date dataHoraFim = rs.getDate("AG_DATA_TERMINO");
					boolean ativo = rs.getBoolean("AG_ATIVO");
					boolean concluido = rs.getBoolean("AG_CONCLUIDO");
					Long codigoCliente = rs.getLong("AG_CLI_CODIGO"); 
					Long codigoFuncionario = rs.getLong("AG_FUN_CODIGO");
					Long codigoServico = rs.getLong("AG_SP_CODIGO");

//					lAgenda.add(new Agendamento(id, dataHoraInicio, dataHoraFim, observacao, 
//							ativo, concluido, cliente, funcionario, servicoPrestado).toDTO);
				
				}
			}
		}
		return lAgenda;
	}
	
	public AgendamentoDTO getAgendamentoPeloCodigo(int codigo) throws SQLException {
		String sql = "select * from AGENDAMENTO WHERE AG_CODIGO = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(0, codigo);
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				if (rs.next()) {
					int id = rs.getInt("AG_CODIGO");
					String observacao = rs.getString("AG_OBSERVACAO");
					Date dataHoraInicio = rs.getDate("AG_DATA_INICIO");
					Date dataHoraFim = rs.getDate("AG_DATA_TERMINO");
					boolean ativo = rs.getBoolean("AG_ATIVO");
					boolean concluido = rs.getBoolean("AG_CONCLUIDO");
					Long codigoCliente = rs.getLong("AG_CLI_CODIGO"); 
					Long codigoFuncionario = rs.getLong("AG_FUN_CODIGO");
					Long codigoServico = rs.getLong("AG_SP_CODIGO");

//					return new Agendamento(id, dataHoraInicio, dataHoraFim, observacao, 
//							ativo, concluido, cliente, funcionario, servicoPrestado).toDTO();
				
				}
			}
		}
		return null;
	}

}