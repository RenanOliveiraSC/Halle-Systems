package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.UsuarioLogin;

public class UsuarioDAO {

	private final Connection con;

	public UsuarioDAO(Connection con) {
		this.con = con;
	}


	public boolean login(UsuarioLogin usuario){
		String sql = "select * from USUARIO_LOGIN WHERE USUL_LOGIN = ? AND USUL_SENHA = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1,usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.execute();
			ResultSet rs = stmt.getResultSet();
			if (rs.next()) {
				return true;
			}
		}catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
		return false;
	}
}
