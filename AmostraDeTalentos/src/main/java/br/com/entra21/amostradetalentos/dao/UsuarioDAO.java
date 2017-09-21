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

	public UsuarioLogin login(UsuarioLogin usuario) {
		String sql = "select * from USUARIO_LOGIN WHERE USUL_LOGIN = ? AND USUL_SENHA = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.execute();
			ResultSet rs = stmt.getResultSet();
			if (rs.next()) {
				usuario.setSenha(null);
				return usuario;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
		return null;
	}
}
