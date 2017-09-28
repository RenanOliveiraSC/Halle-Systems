package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.ClienteDTO;
import br.com.entra21.amostradetalentos.dto.ClienteMiniDTO;
import br.com.entra21.amostradetalentos.model.Cliente;

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

	public boolean alterarCliente(ClienteDTO cliente) throws SQLException {
		String sql = "UPDATE CLIENTE SET CLI_NOME = ?, CLI_SOBRENOME = ?, CLI_CPF = ?, CLI_TELEFONE = ?, "
				+ " CLI_CELULAR = ?, CLI_EMAIL = ?, CLI_DATA_NASCIMENTO = ?, CLI_SEXO = ?, "
				+ " CLI_PROFISSAO = ?, CLI_PAI_MAE = ?, CLI_GRU_CODIGO = ?, CLI_END_CODIGO = ?"
				+ " WHERE CLI_CODIGO = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getSobrenome());
		statement.setString(3, cliente.getCpf());
		statement.setString(4, cliente.getTelefone());
		statement.setString(5, cliente.getCelular());
		statement.setString(6, cliente.getEmail());
		statement.setDate(7, (Date) cliente.getData_nascimento());
		statement.setString(8, cliente.getSexo());
		statement.setString(9, cliente.getProfissao());
		statement.setInt(10, cliente.getPai_mae());
		statement.setInt(11, cliente.getGrupocliente().getCodigo());
		statement.setInt(12, cliente.getEndereco().getCodigo());
		statement.setInt(13, cliente.getCodigo());
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
	
	public List<ClienteMiniDTO> listarSelect() throws SQLException {
		List<ClienteMiniDTO> lCliente = new ArrayList<>();

		String sql = "select CLI_CODIGO, CLI_NOME, CLI_SOBRENOME from CLIENTE";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("CLI_CODIGO");
					String nome = rs.getString("CLI_NOME");
					String sobreNome = rs.getString("CLI_SOBRENOME");

					ClienteMiniDTO cliente = new ClienteMiniDTO(id, nome +" "+ sobreNome + " ("+id+")");
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
