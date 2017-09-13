package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.FuncionarioDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Funcionario;
import br.com.entra21.amostradetalentos.model.TipoFuncionario;

public class FuncionarioService {

	public void inserir(Funcionario funcionario, TipoFuncionario tipofuncionario) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(con).inserir(funcionario, tipofuncionario);
		}
	}

	public void alterarNome(Integer id, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(con).alterarNome(id, nome);
		}
	}

	public void alterarSobreNome(Integer id, String sobreNome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(con).alterarSobreNome(id, sobreNome);
		}
	}

	public void alterarEmail(Integer id, String email) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(con).alterarEmail(id, email);
		}
	}
}
