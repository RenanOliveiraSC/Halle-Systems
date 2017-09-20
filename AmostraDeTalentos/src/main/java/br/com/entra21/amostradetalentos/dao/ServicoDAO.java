package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.ServicosDTO;
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

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE SERVICO WHERE SER_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<ServicosDTO> lista() throws SQLException {
		List<ServicosDTO> lServico = new ArrayList<>();

		String sql = "select * from SERVICO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("SER_CODIGO");
					String descricao = rs.getString("SER_NOME");

					lServico.add(new Servico(codigo, descricao).toDTO());
				}
			}
		}

		return lServico;

	}

	public Servico buscarServicoPorCodigo(int codigo) throws SQLException {
		Servico servico = null;
		
		String sql = "SELECT SER_NOME FROM SERVICO WHERE SER_CODIGO = ?;";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, codigo);

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("SER_CODIGO");
					String descricao = rs.getString("SER_NOME");

					servico = new Servico(id, descricao);
				}
			}
		}
		return servico;

	}
}
