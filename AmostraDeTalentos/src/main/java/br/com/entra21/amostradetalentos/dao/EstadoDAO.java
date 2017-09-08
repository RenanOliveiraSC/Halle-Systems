package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Estado;
import br.com.entra21.amostradetalentos.model.Pais;

public class EstadoDAO {
	private final Connection con;

	public EstadoDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(String nome, String sigla) throws SQLException {
		String sql = "INSERT INTO ESTADO (EST_CODIGO, EST_NOME, EST_SIGLA, EST_PAIS_CODIGO) VALUES (SEQ_ESTADO.NEXTVAL, ?, ?, 1);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setString(2, sigla);

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE ESTADO SET EST_NOME = ? WHERE EST_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE ESTADO WHERE EST_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Estado> lista() throws SQLException {
		List<Estado> lEstados = new ArrayList<>();

		String sql = "select * from ESTADO E INNER JOIN PAIS P ON ES.EST_PAIS_COD = P.PAIS_CODIGO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nomePais = rs.getString("PAIS_NOME");

					int idEst = rs.getInt("EST_CODIGO");
					String nomeEst = rs.getString("EST_NOME");
					String sigla = rs.getString("EST_SIGLA");
					int idPais = rs.getInt("EST_PAIS_COD");

					Pais pais = new Pais(idPais, nomePais);

					Estado estado = new Estado(idEst, nomeEst, sigla, pais);
					lEstados.add(estado);
				}
			}
		}

		return lEstados;

	}
}
