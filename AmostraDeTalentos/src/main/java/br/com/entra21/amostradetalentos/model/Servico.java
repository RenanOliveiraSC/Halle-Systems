package br.com.entra21.amostradetalentos.model;

public class Servico extends Item_Servico {

	public Servico() {
		super();
	}

	public Servico(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			double unidadeDeCompra, double porUnidadeDeCompra, String nomeUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, double unidadeDeVenda, double porUnidadeDeVenda, String nomeUnidadeDeVenda,
			double qtdePorVenda, String observacao, String anexo) {
		super(codigo, descricao, familia, ativo, listaDePreco, unidadeDeCompra, porUnidadeDeCompra, nomeUnidadeDeCompra,
				qtdePorCompra, nomeUnidadeVenda, unidadeDeVenda, porUnidadeDeVenda, nomeUnidadeDeVenda, qtdePorVenda,
				observacao, anexo);
	}

}
