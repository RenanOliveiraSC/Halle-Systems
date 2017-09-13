package br.com.entra21.amostradetalentos.model;

public class SalvaAgenda extends ProdutoServico {

	public SalvaAgenda() {
		super();
	}

	public SalvaAgenda(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			double preco, String nomeUnidadeDeCompra, double porUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, double porunidadeDeVenda, double qtdePorVenda, String observacao, String anexo) {

		super(codigo, descricao, familia, ativo, listaDePreco, preco, nomeUnidadeDeCompra, porUnidadeDeCompra,
				qtdePorCompra, nomeUnidadeVenda, porunidadeDeVenda, qtdePorVenda, observacao, anexo);
	}

}
