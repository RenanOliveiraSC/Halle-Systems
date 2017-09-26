package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.ClienteDTO;
import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.TipoCliente;

public class ClienteDAO {

	private final Connection con;

	public ClienteDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO CLIENTE (CLI_CODIGO, CLI_NOME, CLI_SOBRENOME, CLI_CPF, CLI_TELEFONE, CLI_CELULAR, CLI_EMAIL, CLI_DATA_NASCIMENTO, CLI_SEXO, CLI_PROFISSAO, CLI_PAI_MAE, CLI_GRU_CODIGO, CLI_END_CODIGO) VALUES (SEQ_CLIENTE.NEXTVAL, ?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement statement = con.prepareStatement(sql);

		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getSobrenome());
		statement.setString(3, cliente.getCpf());
		statement.setString(4, cliente.getTelefone());
		statement.setString(5, cliente.getCelular());
		statement.setString(6, cliente.getEmail());
		statement.setDate(7, new Date(cliente.getData_nascimento().getTime()));
		statement.setString(8, cliente.getSexo());
		statement.setString(9, cliente.getProfissao());
		statement.setInt(10, cliente.getPai_mae());
		statement.setInt(11, cliente.getGrupocliente().getCodigo());
		statement.setInt(12, cliente.getEndereco().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterarNome(int id, String nome) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_NOME = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarSobrenome(int id, String sobreNome) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_SOBRENOME = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, sobreNome);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarCpf(int id, String cpf) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_CPF = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cpf);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarTelefone(int id, String telefone) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_TELEFONE = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, telefone);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarCelular(int id, String celular) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_CELULAR = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, celular);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarEmail(int id, String email) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_EMAIL = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, email);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarDataNascimento(int id, String dataNascimento) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_DATA_NASCIMENTO = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, dataNascimento);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarSexo(int id, String sexo) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_SEXO = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, sexo);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarProfissao(int id, String profissao) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_PROFISSAO = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, profissao);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarPaiMae(int id, String paiMae) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_PAI_MAE = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, paiMae);
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarGrupoCliente(int id, TipoCliente grupoCliente) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_GRU_CODIGO = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, grupoCliente.getCodigo());
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean alterarEndereco(int id, Endereco endereco) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_END_CODIGO = ? WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, endereco.getCodigo());
		statement.setInt(2, id);
		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE CLIENTE WHERE CLI_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<ClienteDTO> listarClientes() throws SQLException {
		List<ClienteDTO> lCliente = new ArrayList<>();

		String sql = "select * from CLIENTE";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					int id = rs.getInt("CLI_CODIGO");
					String nome = rs.getString("CLI_NOME");
					String sobreNome = rs.getString("CLI_SOBRENOME");
					String cpf = rs.getString("CLI_CPF");
					String telefone = rs.getString("CLI_TELEFONE");
					String celular = rs.getString("CLI_CELULAR");
					String email = rs.getString("CLI_EMAIL");
					Date dataNascimento = rs.getDate("CLI_DATA_NASCIMENTO");
					String sexo = rs.getString("CLI_SEXO");
					String profissao = rs.getString("CLI_PROFISSAO");
					int paiMae = rs.getInt("CLI_PAI_MAE");

					ClienteDTO cliente = new ClienteDTO(id, nome, sobreNome, cpf, telefone, celular, email,
							dataNascimento, sexo, profissao, paiMae);
					lCliente.add(cliente);
				}
			}
		}

		return lCliente;

	}

	public ClienteDTO buscaPorId() throws SQLException {
		ClienteDTO cliente = null;
		String sql = "select * from CLIENTE";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					int id = rs.getInt("CLI_CODIGO");
					String nome = rs.getString("CLI_NOME");
					String sobreNome = rs.getString("CLI_SOBRENOME");
					String cpf = rs.getString("CLI_CPF");
					String telefone = rs.getString("CLI_TELEFONE");
					String celular = rs.getString("CLI_CELULAR");
					String email = rs.getString("CLI_EMAIL");
					Date dataNascimento = rs.getDate("CLI_DATA_NASCIMENTO");
					String sexo = rs.getString("CLI_SEXO");
					String profissao = rs.getString("CLI_PROFISSAO");
					int paiMae = rs.getInt("CLI_PAI_MAE");

					cliente = new ClienteDTO(id, nome, sobreNome, cpf, telefone, celular, email,
							dataNascimento, sexo, profissao, paiMae);
				}
			}
		}

		return cliente;

	}
}
