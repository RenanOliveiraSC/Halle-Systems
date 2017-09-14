package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Agenda;

public class AgendaDAO {

	private final Connection con;

	public AgendaDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Agenda agenda) throws SQLException {
		String sql = "INSERT INTO AGENDA (AG_CODIGO, AG_OBSERVACAO, AG_DATA_SISTEMA, AG_DATA_INICIO, AG_DATA_TERMINO, AG_HORA_INICIO, "
				+ "AG_HORA_TERMINO, AG_LEMBRETE, AG_AVISO, AG_ATIVO, AG_FECHADO) VALUES (SEQ_AGENDA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);

		statement.setString(1, agenda.getObservacao());
		statement.setDate(2, (Date) agenda.getDataSistema());
		statement.setDate(3, (Date) agenda.getDataInicio());
		statement.setDate(4, (Date) agenda.getDataTermino());
		statement.setTime(5, agenda.getHoraInicio());
		statement.setTime(6, agenda.getHoraTermino());
		statement.setString(7, agenda.getLembrete());
		statement.setString(8, agenda.getAviso());
		statement.setBoolean(9, agenda.getAtivo());
		statement.setBoolean(10, agenda.getFechado());

		return statement.executeUpdate() > 0;
	}

	public boolean alterarNome(int id, String nome) throws SQLException {
		String sql = "UPDATE AGENDA SET LP_NOME = ? WHERE LP_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarObservacao(int id, String observacao) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_OBSERVACAO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, observacao);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarDataInicio(int id, Date datainicio) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_DATA_INICIO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setDate(1, datainicio);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarDataTermino(int id, Date datatermino) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_DATA_TERMINO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setDate(1, datatermino);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarHoraInicio(int id, Time horainicio) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_HORA_INICIO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setTime(1, horainicio);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarHoraTermino(int id, Time horatermino) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_HORA_TERMINO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setTime(1, horatermino);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarLembrete(int id, String lembrete) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_LEMBRETE = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, lembrete);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarAviso(int id, String aviso) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_AVISO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, aviso);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarAtivo(int id, String ativo) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_ATIVO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, ativo);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarFechado(int id, String fechado) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_FECHADO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, fechado);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE AGENDA WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Agenda> lista() throws SQLException {
		List<Agenda> agendas = new ArrayList<>();

		String sql = "select * from AGENDA";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					int id = rs.getInt("AG_CODIGO");
					String observacao = rs.getString("AG_OBSERVACAO");
					Date datasistema = rs.getDate("AG_DATA_SISTEMA");
					Date datainicio = rs.getDate("AG_DATA_INICIO");
					Date datatermino = rs.getDate("AG_DATA_TERMINO");
					Time horainicio = rs.getTime("AG_HORA_INICIO");
					Time horatermino = rs.getTime("AG_HORA_TERMINO");
					String lembrete = rs.getString("AG_LEMBRETE");
					String aviso = rs.getString("AG_AVISO");
					Boolean ativo = rs.getBoolean("AG_ATIVO");
					Boolean fechado = rs.getBoolean("AG_FECHADO");

					Agenda agenda = new Agenda(id, observacao, datasistema, datainicio, datatermino, horainicio,
							horatermino, lembrete, aviso, ativo, fechado);
					agendas.add(agenda);
				}
			}
		}

		return agendas;

	}

}
