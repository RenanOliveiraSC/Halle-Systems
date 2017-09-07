package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Familia;

public class FamiliaDAO {

	private final Connection con;

	public FamiliaDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(String nome) throws SQLException {
		String sql = "INSERT INTO FAMILIA (FAM_CODIGO, FAM_NOME) VALUES (SEQ_FAMILIA.NEXTVAL,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE FAMILIA SET FAM_NOME = ? WHERE FAM_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE FAMILIA WHERE FAM_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Familia> lista() throws SQLException {
		List<Familia> lFamilia = new ArrayList<>();

		String sql = "select * from FAMILIA";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("FAM_CODIGO");
					String nome = rs.getString("FAM_NOME");
					Familia familia = new Familia(id, nome);
					lFamilia.add(familia);
				}
			}
		}

		return lFamilia;

	}
}
