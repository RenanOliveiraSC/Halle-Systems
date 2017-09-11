package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;

public class ProdutoDAO {

	private final Connection con;

	public ProdutoDAO(Connection con) {
		this.con = con;
	}
}
