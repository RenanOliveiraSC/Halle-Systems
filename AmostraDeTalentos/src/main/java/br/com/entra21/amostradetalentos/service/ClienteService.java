package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.ClienteDAO;
import br.com.entra21.amostradetalentos.dto.ClienteDTO;
import br.com.entra21.amostradetalentos.dto.ClienteMiniDTO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Cliente;

public class ClienteService {

	

	public void inserir(Cliente cliente) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).inserir(cliente);
		}
	}

	public void alterar(ClienteDTO cliente) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).alterarCliente(cliente);
		}
	}

	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ClienteDAO(con).excluir(id);
		}
	}
	
	public List<ClienteDTO> listar() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new ClienteDAO(con).listarClientes();
		}
	}
	
	public List<ClienteMiniDTO> listarSelect() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new ClienteDAO(con).listarSelect();
		}
	}

}
