package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;

public class SalvaAgendaDAO {
	private final Connection con;

	public SalvaAgendaDAO(Connection con) {
		this.con = con;
	}

}
