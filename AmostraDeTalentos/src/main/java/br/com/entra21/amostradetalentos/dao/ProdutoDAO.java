package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Deposito;
import br.com.entra21.amostradetalentos.model.Fabricante;
import br.com.entra21.amostradetalentos.model.Familia;
import br.com.entra21.amostradetalentos.model.ListaDePreco;
import br.com.entra21.amostradetalentos.model.Produto;

public class ProdutoDAO {

	private final Connection con;

	public ProdutoDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Produto produto, Fabricante fabricante, ListaDePreco lista, Familia familia,
			Deposito deposito) throws SQLException {
		String sql = "INSERT INTO PRODUTO,PRO_CODIGO,PRO_DESCRICAO, PRO_FAM_CODIGO,PRO_COD_LISTADEPRECO,PRO_PRECO,PRO_NOME_UNIDADE_COMPRA,PRO_PORUNIDADE_DE_COMPRA, PRO_QRTDE_POR_COMPRA,PRO_NOME_UNIDADE_VENDA, PRO_PORUNIDADE_DE_VENDA,PRO_QTDE_POR_VENDA, PRO_OBSERVACAO, PRO_ESTOQUE_MIN, PRO_ESTOQUE_MAX, PRO_ATIVO, PRO_ANEXO,PRO_FAB_CODIGO, PRO_COD_DEPOSITO) VALUES (SEQ_PRODUTO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, produto.getDescricao());
		statement.setInt(2, produto.getFamilia().getCodigo());
		statement.setInt(3, produto.getListaDePreco().getCodigo());
		statement.setDouble(4, produto.getPreco());
		statement.setString(5, produto.getNomeUnidadeDeCompra());
		statement.setDouble(6, produto.getPorUnidadeDeCompra());
		statement.setDouble(7, produto.getQtdePorCompra());
		statement.setString(8, produto.getNomeUnidadeVenda());
		statement.setDouble(9, produto.getPorUnidadeDeVenda());
		statement.setDouble(10, produto.getQtdePorVenda());
		statement.setString(11, produto.getObservacao());
		statement.setDouble(12, produto.getEstoqueMin());
		statement.setDouble(13, produto.getEstoqueMax());
		statement.setBoolean(14, produto.isAtivo());
		statement.setString(15, produto.getAnexo());
		statement.setInt(16, produto.getFabricante().getCodigo());
		statement.setInt(17, produto.getDeposito().getCodigo());
		return statement.executeUpdate() > 0;
	}

	public boolean alterarDescricao(int id, String descricao) throws SQLException {
		String sql = "UPDATE PRODUTO SET PRO_DESCRICAO = ? WHERE PRO_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, descricao);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarFamilia(int id, String familia) throws SQLException {
		String sql = "UPDATE PRODUTO SET PRO_FAM_CODIGO = ? WHERE PRO_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, familia);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE PRODUTO WHERE PRO_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}
}
