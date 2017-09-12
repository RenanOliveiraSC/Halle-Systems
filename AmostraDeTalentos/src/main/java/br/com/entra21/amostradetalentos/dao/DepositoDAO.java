
package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Deposito;

public class DepositoDAO {
	
	private final Connection con; 

	public DepositoDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String deposito) throws SQLException{
		String sql = "INSERT INTO DEPOSITO (DEP_CODIGO, DEP_NOME) VALUES (SEQ_DEPOSITO.nextval, ?)";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, deposito);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int id, String deposito) throws SQLException{
		String sql = "UPDATE DEPOSITO SET DEP_NOME = ? WHERE DEP_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, deposito);
		statement.setInt(2, id);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException{
		String sql = "DELETE DEPOSITO WHERE DEP_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 
		return statement.executeUpdate() > 0;
	}
	
	public List<Deposito> lista() throws SQLException {
		List<Deposito> depositos = new ArrayList<>();

		String sql = "select * from DEPOSITO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("DEP_CODIGO");
					String nome = rs.getString("DEP_NOME");
					Deposito deposito = new Deposito(id, nome);
					depositos.add(deposito);
				}
			}
		}

		return depositos;

	}
}