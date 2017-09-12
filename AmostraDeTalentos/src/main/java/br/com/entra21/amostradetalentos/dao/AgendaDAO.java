package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
<<<<<<< HEAD
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
=======
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
>>>>>>> branch 'master' of https://github.com/RenanOliveiraSC/Halle-Systems.git

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

	private final Connection con;

	public AgendaDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(Agenda agenda) throws SQLException{
		String sql =  "INSERT INTO AGENDA (AG_CODIGO, AG_OBSERVACAO, AG_DATA_DO_SISTEMA, AG_DATA_DE_INICIO, AG_DATA_DE_TERMINO, AG_HORA_INICIO, AG_HORA_TERMINO, AG_LEMBRETE, AG_AVISO, AG_ATIVO, AG_FECHADO, AG_SER_CODIGO) VALUES (SEQ_AGENDA.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, agenda.getObservacao());
		statement.setDate(2, (Date)agenda.getData_do_sistema());
		statement.setDate(3, (Date)agenda.getData_de_inicio());
		statement.setDate(4, (Date)agenda.getData_de_termino());
		statement.setTime(5, agenda.getHora_inicio());
		statement.setTime(6, agenda.getHora_termino());
		statement.setString(7, agenda.getLembrete());
		statement.setString(8, agenda.getAviso());
		statement.setBoolean(9, agenda.getAtivo());
		statement.setBoolean(10, agenda.getFechado());
		statement.setInt(11, agenda.getServico().getCodigo());
				
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int id, String bairro) throws SQLException {
		String sql = "UPDATE ENDERECO SET END_BAIRRO = ? WHERE END_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, bairro);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
}
