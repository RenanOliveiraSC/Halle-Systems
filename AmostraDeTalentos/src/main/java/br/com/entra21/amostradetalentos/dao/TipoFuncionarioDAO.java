package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.TipoFuncionario;

public class TipoFuncionarioDAO {
	
private final Connection con;
	
	public TipoFuncionarioDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String nome) throws SQLException {
		String sql = "INSERT INTO TIPO_FUNCIONARIO (TFUN_CODIGO, TFUN_NOME) VALUES (SEQ_TIPO_FUNCIONARIO.NEXTVAL, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE TIPO_FUNCIONARIO SET TFUN_NOME = ? WHERE TFUN_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE TIPO_FUNCIONARIO WHERE TFUN_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}
	
	public List<TipoFuncionario> lista() throws SQLException {
		List<TipoFuncionario> lTipoFuncionario = new ArrayList<>();

		String sql = "select * from TIPO_FUNCIONARIO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("TFUN_CODIGO");
					String nome = rs.getString("TFUN_NOME");
					TipoFuncionario tipoFuncionario = new TipoFuncionario(id, nome);
					lTipoFuncionario.add(tipoFuncionario);
				}
			}
		}

		return lTipoFuncionario;
	}
}
