package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Produto;
import br.com.entra21.amostradetalentos.service.ProdutoService;

public class TesteProduto {

	public static void main(String[] args) throws SQLException {

		ProdutoService produtoService = new ProdutoService();

		List<Produto> lProduto = produtoService.listarProdutos();
		for (Produto prod : lProduto) {
			System.out.println(prod.toString());
		}
	}
}
