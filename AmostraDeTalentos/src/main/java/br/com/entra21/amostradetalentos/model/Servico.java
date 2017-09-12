package br.com.entra21.amostradetalentos.model;

public class Servico extends ProdutoServico {

	public Servico() {
		super();
	}

	public Servico(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			String nomeUnidadeDeCompra, double porUnidadeDeCompra, double qtdePorCompra, String nomeUnidadeVenda,
			double porunidadeDeVenda, double qtdePorVenda, String observacao, String anexo) {

		super(codigo, descricao, familia, ativo, listaDePreco, nomeUnidadeDeCompra, porUnidadeDeCompra, qtdePorCompra,
				nomeUnidadeVenda, porunidadeDeVenda, qtdePorVenda, observacao, anexo);
	}
}
