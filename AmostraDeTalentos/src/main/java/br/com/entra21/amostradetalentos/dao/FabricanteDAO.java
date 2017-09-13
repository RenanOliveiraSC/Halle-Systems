package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Fabricante;

public class FabricanteDAO {

	private final Connection con;

	public FabricanteDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(String nome) throws SQLException {
		String sql = "INSERT INTO FABRICANTE (FAB_CODIGO, FAB_NOME) VALUES (SEQ_FABRICANTE.NEXTVAL,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE FABRICANTE SET FAB_NOME = ? WHERE FAB_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE FABRICANTE WHERE FAB_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Fabricante> lista() {
		// TODO Auto-generated method stub
		return null;
	}
}