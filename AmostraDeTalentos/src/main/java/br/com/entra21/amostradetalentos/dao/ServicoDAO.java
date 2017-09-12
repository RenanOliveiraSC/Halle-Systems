package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Estado;
import br.com.entra21.amostradetalentos.model.Pais;
import br.com.entra21.amostradetalentos.model.Servico;

public class ServicoDAO {

	private final Connection con;

	public ServicoDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Servico servico) throws SQLException {
		String sql = "INSERT INTO SERVICO (SER_CODIGO, SER_NOME, SER_PRECO, SER_ATIVO, SER_NOME_UNIDADE_COMPRA, SER_QTDE_UNIDADE_COMPRA, SER_NOME_EMBALAGEM_COMPRA, SER_NOME_UNIDADE_VENDA, SER_QTDE_UNIDADE_VENDA, SER_NOME_EMBALAGEM_VENDA, SER_QTDE_EMBALAGEM_VENDA, SER_OBSERVACAO, SER_FAM_CODIGO, SER_LP_CODIGO) VALUES (SEQ_SERVICO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, servico.getDescricao());
		statement.setDouble(2, servico.getPreco());

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

		String sql = "select * from ESTADO E INNER JOIN PAIS P ON E.EST_PAIS_CODIGO = P.PAIS_CODIGO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nomePais = rs.getString("PAIS_NOME");

					int idEst = rs.getInt("EST_CODIGO");
					String nomeEst = rs.getString("EST_NOME");
					String sigla = rs.getString("EST_SIGLA");
					int idPais = rs.getInt("EST_PAIS_CODIGO");

					Pais pais = new Pais(idPais, nomePais);

					Estado estado = new Estado(idEst, nomeEst, sigla, pais);
					lEstados.add(estado);
				}
			}
		}

		return lEstados;

	}
}
