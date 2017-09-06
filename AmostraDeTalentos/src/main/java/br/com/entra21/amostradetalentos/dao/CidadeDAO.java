package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Cidade;

public class CidadeDAO {

	private final Connection con;

	public CidadeDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String nome) throws SQLException{
		String sql = "INSERT INTO CIDADE (CID_CODIGO, CID_NOME) VALUES (SEQ_CIDADE.nextval, ?, CID_ESTADO_CODIGO)";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int id, String nome) throws SQLException{
		String sql = "UPDATE ESTADO SET EST_NOME = ? WHERE EST_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException{
		String sql = "DELETE ESTADO WHERE EST_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 
		return statement.executeUpdate() > 0;
	}

//	public List<Pais> lista() throws SQLException {
//		List<Pais> paises = new ArrayList<>();
//
//		String sql = "select * from ESTADO";
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
