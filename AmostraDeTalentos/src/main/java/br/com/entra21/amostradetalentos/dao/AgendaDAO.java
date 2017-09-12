package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import br.com.entra21.amostradetalentos.model.Agenda;

public class AgendaDAO {
	
    private final Connection con;
	
	public AgendaDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String observacao, Date dataSistema, Date dataInicio, Date dataTermino, Time horaInicio, 
			Time horaTermino, String lembrete, String aviso, boolean ativo, boolean fechado) throws SQLException {
		String sql = "INSERT INTO AGENDA (AG_CODIGO, AG_OBSERVACAO, AG_DATA_SISTEMA, AG_DATA_INICIO, AG_DATA_TERMINO, AG_HORA_INICIO, "
				+ "AG_HORA_TERMINO, AG_LEMBRETE, AG_AVISO, AG_ATIVO, AG_FECHADO) VALUES (SEQ_AGENDA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, observacao);
		statement.setDate(2, dataSistema);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterarNome(int id, String nome) throws SQLException {
		String sql = "UPDATE LISTA_DE_PRECO SET LP_NOME = ? WHERE LP_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterarFator(int id, double fator) throws SQLException {
		String sql = "UPDATE LISTA_DE_PRECO SET LP_FATOR = ? WHERE LP_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setDouble(1, fator);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE LISTA_DE_PRECO WHERE LP_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}
	
	public List<ListaDePreco> lista() throws SQLException {
		List<ListaDePreco> lListaDePreco = new ArrayList<>();

		String sql = "select * from LISTA_DE_PRECO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("LP_CODIGO");
					String nome = rs.getString("LP_NOME");
					double fator = rs.getDouble("LP_FATOR");
					ListaDePreco listaDePreco = new ListaDePreco(id, nome, fator);
					lListaDePreco.add(listaDePreco);
				}
			}
		}

		return lListaDePreco;

	}

}
