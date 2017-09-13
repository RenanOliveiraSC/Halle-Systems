package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.FornecedorDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.TipoFornecedor;

public class FornecedorService {

	public void inserir(String nome, TipoFornecedor tipofornecedor, Endereco endereco) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).inserir(nome, tipofornecedor, endereco);
		}
	}

	public void alterar(Integer codigo, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new FornecedorDAO(con).alterarNome(codigo, nome);
		}
	}

}
