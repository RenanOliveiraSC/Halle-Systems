package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.ServicoDAO;
import br.com.entra21.amostradetalentos.dto.ServicosDTO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Servico;

public class ServicoService {
	
	public void inserir(Servico servico) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ServicoDAO(con).inserir(servico);
		}
	}
	
	public void excluir(int id) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ServicoDAO(con).excluir(id);
		}
	}
	
	public List<ServicosDTO> listar() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new ServicoDAO(con).lista();
		}
	}

}
