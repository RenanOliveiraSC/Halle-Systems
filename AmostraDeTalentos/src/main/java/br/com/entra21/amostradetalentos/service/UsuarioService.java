package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.UsuarioDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.UsuarioLogin;

public class UsuarioService {

	public UsuarioLogin login(UsuarioLogin usuario) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new UsuarioDAO(con).login(usuario);
		}
	}

}
