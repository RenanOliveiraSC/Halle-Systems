package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Cidade;

public class CidadeDAO {

	private final Connection con;

	public CidadeDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Cidade cidade) throws SQLException {
		String sql = "INSERT INTO CIDADE (CID_CODIGO, CID_NOME, CID_EST_CODIGO) VALUES (SEQ_CIDADE.NEXTVAL, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cidade.getNome());
		statement.setInt(2, cidade.getEstado().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE CIDADE SET CID_NOME = ? WHERE CID_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE CIDADE WHERE CID_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Cidade> lista() throws SQLException {
		List<Cidade> lCidade = new ArrayList<>();

		String sql = "select * from CIDADE";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("CID_CODIGO");
					String nome = rs.getString("CID_NOME");
					Cidade cidade = new Cidade(id, nome);
					lCidade.add(cidade);
				}
			}
		}

		return lCidade;

	}
}
