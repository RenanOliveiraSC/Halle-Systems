package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.FuncionarioDAO;
import br.com.entra21.amostradetalentos.dto.FuncionarioMiniDTO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Funcionario;

public class FuncionarioService {

	public void inserir(Funcionario funcionario) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(con).inserir(funcionario);
		}
	}

	public void alterar(Funcionario funcionario) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FuncionarioDAO(con).alterar(funcionario);
		}
	}
	
	public boolean excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new FuncionarioDAO(con).excluir(id);
		}
	}

	public List<FuncionarioMiniDTO> listarSelect() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new FuncionarioDAO(con).listarSelect();
		}
	}
}
