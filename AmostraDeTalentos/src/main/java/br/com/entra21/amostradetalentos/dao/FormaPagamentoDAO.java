package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.FormaDePagamento;
import br.com.entra21.amostradetalentos.model.Pais;

public class FormaPagamentoDAO {

	private final Connection con;

	public FormaPagamentoDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(String nome) throws SQLException {
		String sql = "INSERT INTO FORMA_PAGAMENTO (FORMA_CODIGO, FORMA_NOME) VALUES (SEQ_FORMA_PAGAMENTO.nextval, ?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE FORMA_PAGAMENTO SET FORMA_NOME = ? WHERE FORMA_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE FORMA_PAGAMENTO WHERE FORMA_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<FormaDePagamento> lista() throws SQLException {
		List<FormaDePagamento> lFormasPagamento = new ArrayList<>();

		String sql = "select * from FORMA_PAGAMENTO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("FORMA_CODIGO");
					String nome = rs.getString("FORMA_NOME");

					FormaDePagamento formaDePagamento = new FormaDePagamento(id, nome);
					lFormasPagamento.add(formaDePagamento);
				}
			}
		}

		return lFormasPagamento;

	}
}
