package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.ClienteDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.TipoCliente;

public class ClienteService {

	

	public void inserir(Cliente cliente) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).inserir(cliente);
		}
	}

	public void alterarNome(int id, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarNome(id, nome);
		}
	}

	public void alterarSobrenome(int id, String sobreNome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarSobrenome(id, sobreNome);
		}
	}

	public void alterarCpf(int id, String cpf) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarCpf(id, cpf);
		}
	}

	public void alterarTelefone(int id, String telefone) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarTelefone(id, telefone);
		}
	}

	public void alterarCelular(int id, String celular) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarCelular(id, celular);
		}
	}

	public void alterarEmail(int id, String email) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarEmail(id, email);
		}
	}

	public void alterarDataNascimento(int id, String dataNascimento) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarDataNascimento(id, dataNascimento);
		}
	}

	public void alterarSexo(int id, String sexo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarSexo(id, sexo);
		}
	}

	public void alterarProfissao(int id, String profissao) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarProfissao(id, profissao);
		}
	}

	public void alterarPaiMae(int id, String paiMae) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarPaiMae(id, paiMae);
		}
	}

	public void alterarGrupoCliente(int id, TipoCliente grupoCliente) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarGrupoCliente(id, grupoCliente);
		}
	}

	public void alterarEndereco(int id, Endereco endereco) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarEndereco(id, endereco);
		}
	}

	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).excluir(id);
		}
	}

}
