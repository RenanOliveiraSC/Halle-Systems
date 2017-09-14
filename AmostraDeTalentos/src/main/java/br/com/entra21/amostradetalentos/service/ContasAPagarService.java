package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.AgendaDAO;
import br.com.entra21.amostradetalentos.dao.ContasAPagarDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.Agenda;
import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;

public class ContasAPagarService {
	
	public void inserir(ContasAPagar aPagar, FormaDePagamento formadepagamento) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new ContasAPagarDAO(con).inserir(aPagar, formadepagamento);
		}
	}

	public void alterar(String observacao, String nome) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new AgendaDAO(con).alterar(codigo, nome);
		}
	}

	public void excluir(Integer codigo) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new AgendaDAO(con).excluir(codigo);
		}
	}

	public List<Agenda> listarAgenda() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new AgendaDAO(con).lista();
		}
	}
}
