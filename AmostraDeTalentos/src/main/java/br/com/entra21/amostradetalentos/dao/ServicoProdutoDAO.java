package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.ServicoPrestadoMiniDTO;
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
	
	public List<ServicoPrestadoMiniDTO> listarSelect() throws SQLException {
		List<ServicoPrestadoMiniDTO> lista = new ArrayList<>();
		String sql = "SELECT SP_CODIGO, SER_NOME FROM SERVICO_PRODUTO "
				+ " INNER JOIN SERVICO ON SP_SER_CODIGO = SER_CODIGO ";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("SP_CODIGO");
					String descricaoServico = rs.getString("SER_NOME");

					lista.add(new ServicoPrestadoMiniDTO(codigo, descricaoServico));
				}
			}
		}
		return lista;
	}

}
