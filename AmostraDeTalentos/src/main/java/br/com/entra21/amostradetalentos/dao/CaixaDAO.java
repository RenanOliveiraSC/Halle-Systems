package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Caixa;

public class CaixaDAO {

	private final Connection con;

	public CaixaDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Caixa caixa) throws SQLException {
		String sql = "INSERT INTO CAIXA (CX_CODIGO, CX_SAL_CODIGO, CX_FORMA_CODIGO) VALUES (SEQ_CAIXA.nextval, ?, ?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, caixa.getAgendamento().getCodigo());
		statement.setInt(2, caixa.getFormaPag().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE CAIXA WHERE CX_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Caixa> lista() throws SQLException {
		List<Caixa> lCaixa = new ArrayList<>();

		String sql = "select * from CAIXA";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int id = rs.getInt("CX_CODIGO");
					
					
					Caixa caixa = new Caixa(id);
					lCaixa.add(caixa);
				}
			}
		}

		return lCaixa;

	}

}
