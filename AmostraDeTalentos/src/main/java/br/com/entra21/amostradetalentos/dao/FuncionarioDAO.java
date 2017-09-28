package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.FuncionarioMiniDTO;
import br.com.entra21.amostradetalentos.model.Funcionario;

public class FuncionarioDAO {

	private final Connection con;

	public FuncionarioDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Funcionario funcionario) throws SQLException {
		String sql = "INSERT INTO FUNCIONARIO (FUN_CODIGO, FUN_NOME, FUN_SOBRENOME, FUN_EMAIL, FUN_TELEFONE, FUN_USU_CODIGO) VALUES (SEQ_FUNCIONARIO.NEXTVAL,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setString(2, funcionario.getSobrenome());
		statement.setString(3, funcionario.getEmail());
		statement.setString(4, funcionario.getTelefone());
		statement.setInt(5, funcionario.getTipoFuncinario().getCodigo());
		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Funcionario funcionario) throws SQLException {
		String sql = "UPDATE FUNCIONARIO SET FUN_NOME = ?, FUN_SOBRENOME = ?, "
				+ " FUN_EMAIL = ?, FUN_TELEFONE = ?, FUN_USU_CODIGO = ? "
				+ " WHERE FUN_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, funcionario.getNome());
		statement.setString(2, funcionario.getSobrenome());
		statement.setString(3, funcionario.getEmail());
		statement.setString(4, funcionario.getTelefone());
		statement.setLong(5, funcionario.getTipoFuncinario().getCodigo());
		statement.setInt(6, funcionario.getCodigo());
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE FUNCIONARIO WHERE FUN_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(0, id);

		return statement.executeUpdate() > 0;
	}
	
	public List<FuncionarioMiniDTO> listarSelect() throws SQLException {
		List<FuncionarioMiniDTO> lista = new ArrayList<>();
		String sql = "SELECT FUN_CODIGO, FUN_NOME FROM FUNCIONARIO ";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("FUN_CODIGO");
					String nome = rs.getString("FUN_NOME");

					lista.add(new FuncionarioMiniDTO(codigo, nome));
				}
			}
		}
		return lista;
	}

}
