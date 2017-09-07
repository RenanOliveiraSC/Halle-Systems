package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.TipoFuncionario;

public class TipoUsuarioDAO {

	private final Connection con;

	public TipoUsuarioDAO(Connection con) {
		this.con = con;
	}

	// verificar a questão do tipo de usuário no banco, no java só tem nome.
	public boolean inserir(TipoFuncionario tipoUsuario) throws SQLException {
		String sql = "INSERT INTO USUARIO (USU_CODIGO, USU_NOME) VALUES (SEQ_USUARIO.NEXTVAL,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, tipoUsuario.getNome());
		return statement.executeUpdate() > 0;
	}

	public boolean alterarNome(int id, String nome) throws SQLException {
		String sql = "UPDATE USUARIO SET USU_NOME = ? WHERE USU_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE USUARIO WHERE USU_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}
}
