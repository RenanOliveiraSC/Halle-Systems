package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Fornecedor;

public class FornecedorDAO {

	private final Connection con;

	public FornecedorDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Fornecedor fornecedor)
			throws SQLException {
		String sql = "INSERT INTO FORNECEDOR(FOR_CODIGO, FOR_NOME, FOR_CONTATO, FOR_CNPJ, FOR_TELEFONE, FOR_CELULAR, FOR_EMAIL, FOR_TIPF_CODIGO, FOR_END_CODIGO) VALUES (SEQ_FORNECEDOR.NEXTVAL,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, fornecedor.getNome());
		statement.setString(2, fornecedor.getContato());
		statement.setString(3, fornecedor.getCnpj());
		statement.setString(4, fornecedor.getTelefone());
		statement.setString(5, fornecedor.getCelular());
		statement.setString(6, fornecedor.getEmail());
		statement.setInt(7, fornecedor.getTipoFornecedor().getCodigo());
		statement.setInt(8, fornecedor.getEndereco().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterarNome(int id, String nome) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_NOME = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarContato(int id, String contato) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_CONTATO = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, contato);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarCnpj(int id, String cnpj) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_CNPJ = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cnpj);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarTelefone(int id, String telefone) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_TELEFONE = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, telefone);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarCelular(int id, String celular) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_CELULAR = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, celular);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarEmail(int id, String email) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_EMAIL = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, email);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarTipoFornecedor(int id, String tipoFornecedor) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_TIPF_CODIGO = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, tipoFornecedor);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarEndereco(int id, String endereco) throws SQLException {
		String sql = "UPDATE FORNECEDOR SET FOR_END_CODIGO = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, endereco);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE FORNECEDOR WHERE FOR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}
}
