package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.FornecedorDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.Fornecedor;
import br.com.entra21.amostradetalentos.model.TipoFornecedor;

public class FornecedorService {

	public void inserir(Fornecedor fornecedor, TipoFornecedor tipofornecedor, Endereco endereco) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).inserir(fornecedor, tipofornecedor, endereco);
		}
	}

	public void alterarNome(Integer id, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, nome);
		}
	}

	public void alterarContato(Integer id, String contato) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, contato);
		}
	}

	public void alterarCnpj(Integer id, String cnpj) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, cnpj);
		}
	}

	public void alterarTelefone(Integer id, String telefone) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, telefone);
		}
	}

	public void alterarCelular(Integer id, String celular) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, celular);
		}
	}

	public void alterarEmail(Integer id, String email) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, email);
		}
	}

	public void alterarTipoFornecedor(Integer id, String tipoFornecedor) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, tipoFornecedor);
		}
	}

	public void alterarEndereco(Integer id, String endereco) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(id, endereco);
		}
	}

	public void excluir(Integer id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).excluir(id);
		}
	}
}
