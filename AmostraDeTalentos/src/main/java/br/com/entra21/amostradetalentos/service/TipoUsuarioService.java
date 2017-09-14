package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.TipoUsuarioDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.TipoFuncionario;

public class TipoUsuarioService {
	
	public void inserir(TipoFuncionario tipoUsuario) throws SQLException {
		try(Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoUsuarioDAO(con).inserir(tipoUsuario);
		}
	}
	
	public void alterarNome(int id, String nome) throws SQLException {
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			new TipoUsuarioDAO(con).alterarNome(id, nome);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new TipoUsuarioDAO(con).excluir(id);
		}
	}

}
