package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Estado;

public class EstadoDAO {

	private final Connection con;

	public EstadoDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String nome) throws SQLException{
		String sql = "INSERT INTO ESTADO (EST_CODIGO, EST_NOME) VALUES (SEQ_ESTADO.nextval, ?)";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int id, String nome) throws SQLException{
		String sql = "UPDATE PAIS SET EST_NOME = ? WHERE EST_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException{
		String sql = "DELETE PAIS WHERE ESTADO_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 
		return statement.executeUpdate() > 0;
	}

//	public List<Pais> lista() throws SQLException {
//		List<Pais> paises = new ArrayList<>();
//
//		String sql = "select * from PAIS";
//		try (PreparedStatement stmt = con.prepareStatement(sql)) {
//			stmt.execute();
//			try (ResultSet rs = stmt.getResultSet()) {
//				while (rs.next()) {
//					int id = rs.getInt("pai_codigo");
//					String nome = rs.getString("pai_nome");
//					Pais pais = new Pais(id, nome);
//					paises.add(pais);
//				}
//			}
//		}
//
//		return paises;
//
//	}
}
