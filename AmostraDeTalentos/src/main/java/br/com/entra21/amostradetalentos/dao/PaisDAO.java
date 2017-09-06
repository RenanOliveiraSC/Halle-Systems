package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Pais;

public class PaisDAO {

	private final Connection con;

	public PaisDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String nome) throws SQLException{
		String sql = "INSERT INTO PAIS (PAIS_CODIGO, PAIS_NOME) VALUES (SEQ_PAIS.nextval, ?)";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int id, String nome) throws SQLException{
		String sql = "UPDATE PAIS SET PAIS_NOME = ? WHERE PAIS_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException{
		String sql = "DELETE PAIS WHERE PAIS_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Pais> lista() throws SQLException {
		List<Pais> paises = new ArrayList<>();

		String sql = "select * from PAIS";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("PAIS_CODIGO");
					String nome = rs.getString("PAIS_NOME");
					Pais pais = new Pais(id, nome);
					paises.add(pais);
				}
			}
		}

		return paises;

	}

}
