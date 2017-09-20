package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.ContasAPagarDAO;
import br.com.entra21.amostradetalentos.dao.ContasAReceberDAO;
import br.com.entra21.amostradetalentos.dto.ContasAReceberDTO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.ContasAReceber;

public class ContasAReceberService {

	public void inserir(ContasAReceber aReceber) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ContasAReceberDAO(con).inserir(aReceber);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new ContasAPagarDAO(con).excluir(codigo);
		}
	}

	public List<ContasAReceberDTO> listarContasAPagar() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new ContasAReceberDAO(con).listaContasAReceber();
		}
	}

	public List<ContasAReceberDTO> listarContasAReceber() {
		// TODO Auto-generated method stub
		return null;
	}
}