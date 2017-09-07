package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.EnderecoDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.Estado;

public class EnderecoService {

	public void inserir(String nome, Estado estado) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			Endereco endereco = new Endereco();
			new EnderecoDAO(con).inserir(endereco);
		}
	}

	public void alterar(Integer codigo, String bairro) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new EnderecoDAO(con).alterarBairro(codigo, bairro);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new EnderecoDAO(con).excluir(codigo);
		}
	}

	public List<Endereco> listarEnderecos() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new EnderecoDAO(con).lista();
		}
	}
}
