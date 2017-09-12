package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import br.com.entra21.amostradetalentos.model.Agenda;

public class AgendaDAO {
	
   	private final Connection con;

	public AgendaDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(Agenda agenda) throws SQLException{
		String sql =  "INSERT INTO AGENDA (AG_CODIGO, AG_OBSERVACAO, AG_DATA_DO_SISTEMA, AG_DATA_DE_INICIO, AG_DATA_DE_TERMINO, AG_HORA_INICIO, AG_HORA_TERMINO, AG_LEMBRETE, AG_AVISO, AG_ATIVO, AG_FECHADO, AG_SER_CODIGO) VALUES (SEQ_AGENDA.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, agenda.getObservacao());
		statement.setDate(2, (Date)agenda.getData_do_sistema());
		/*_______________________________________________________*/
		statement.setDate(3, (Date)agenda.getData_de_inicio());
		statement.setDate(4, (Date)agenda.getData_de_termino());
		statement.setTime(5, agenda.getHora_inicio());
		statement.setTime(6, agenda.getHora_termino());
		statement.setString(7, agenda.getLembrete());
		statement.setString(8, agenda.getAviso());
		statement.setBoolean(9, agenda.getAtivo());
		statement.setBoolean(10, agenda.getFechado());
		/*________________________________________________________*/
		statement.setInt(11, agenda.getServico().getCodigo());
				
		return statement.executeUpdate() > 0;
	}
	
	public  boolean alterarObservacao(int id, String bairro) throws SQLException {
		String sql = "UPDATE AGENDA SET AG_OBSERVACAO = ? WHERE AG_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, bairro);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
}
