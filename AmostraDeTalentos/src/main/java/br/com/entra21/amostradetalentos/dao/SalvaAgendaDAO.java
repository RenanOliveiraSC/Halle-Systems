package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.SalvaAgenda;

public class SalvaAgendaDAO {

	private final Connection con;

	public SalvaAgendaDAO(Connection con) {
		this.con = con;
	}

	public boolean inserirSalvaAgenda(SalvaAgenda salvaAgenda) throws SQLException {
		String sql = "INSERT INTO SALVA_AGENDA (SAL_CODIGO, SAL_AG_CODIGO, SAL_CLI_CODIGO, SAL_FUN_CODIGO, SAL_SP_CODIGO) VALUES (SEQ_SALVA_AGENDA.NEXTVAL, ?, ?, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		
		statement.setInt(1, salvaAgenda.getAgenda().getCodigo());
		statement.setInt(2, salvaAgenda.getCliente().getCodigo());
		statement.setInt(3, salvaAgenda.getFuncionario().getCodigo());
		statement.setInt(4, salvaAgenda.getServicoProduto().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE SALVA_AGENDA WHERE SAL_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

}
