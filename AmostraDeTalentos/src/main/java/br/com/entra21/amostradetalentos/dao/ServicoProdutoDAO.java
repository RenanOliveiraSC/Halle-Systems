package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.ServicoProduto;

public class ServicoProdutoDAO {

	private final Connection con;

	public ServicoProdutoDAO(Connection con) {
		this.con = con;
	}

	public boolean inserirServicoProduto(ServicoProduto servicoProduto) throws SQLException {
		String sql = "INSERT INTO SALVA_AGENDA (SP_CODIGO, SP_SER_CODIGO, SP_PRO_CODIGO) VALUES (SEQ_SERVICO_PRODUTO.NEXTVAL, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);

		statement.setInt(1, servicoProduto.getServico().getCodigo());
		statement.setInt(2, servicoProduto.getProduto().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE SERVICO_PRODUTO WHERE SP_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

}
