package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Funcionario;
import br.com.entra21.amostradetalentos.model.TipoFuncionario;

public class FuncionarioDAO {

	private final Connection con;

	public FuncionarioDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Funcionario funcionario, TipoFuncionario tipofuncionario) throws SQLException {
		String sql = "INSERT INTO FUNCIONARIO (FUN_CODIGO, FUN_NOME, FUN_SOBRENOME, FUN_EMAIL, FUN_TELEFONE, FUN_USU_CODIGO) VALUES (SEQ_FUNCIONARIO.NEXTVAL,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setString(2, funcionario.getSobrenome());
		statement.setString(2, funcionario.getEmail());
		statement.setString(2, funcionario.getTelefone());
		statement.setInt(2, funcionario.getTipoFuncinario().getCodigo());
		return statement.executeUpdate() > 0;
	}

	public boolean alterarNome(int id, String nome) throws SQLException {
		String sql = "UPDATE FUNCIONARIO SET FUN_NOME = ? WHERE FUN_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarSobreNome(int id, String sobreNome) throws SQLException {
		String sql = "UPDATE FUNCIONARIO SET FUN_SOBRENOME = ? WHERE FUN_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, sobreNome);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarEmail(int id, String email) throws SQLException {
		String sql = "UPDATE FUNCIONARIO SET FUN_EMAIL = ? WHERE FUN_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, email);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarTelefone(int id, String telefone) throws SQLException {
		String sql = "UPDATE FUNCIONARIO SET FUN_TELEFONE = ? WHERE FUN_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, telefone);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarTipoFuncionario(int id, String tipoFuncionario) throws SQLException {
		String sql = "UPDATE FUNCIONARIO SET FUN_USU_CODIGO = ? WHERE FUN_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, tipoFuncionario);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}
}
