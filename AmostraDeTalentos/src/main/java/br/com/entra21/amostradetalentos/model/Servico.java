package br.com.entra21.amostradetalentos.model;

import br.com.entra21.amostradetalentos.dto.ServicosDTO;
import br.com.entra21.amostradetalentos.utils.DecimalFormatUtils;

public class Servico extends ProdutoServico {

	public Servico() {
		super();
	}

	public Servico(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			double preco, String nomeUnidadeDeCompra, double porUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, double porunidadeDeVenda, double qtdePorVenda, String observacao, String anexo) {

		super(codigo, descricao, familia, ativo, listaDePreco, preco, nomeUnidadeDeCompra, porUnidadeDeCompra,
				qtdePorCompra, nomeUnidadeVenda, porunidadeDeVenda, qtdePorVenda, observacao, anexo);
	}

	public Servico(Integer codigo, String descricao) {
		super(codigo, descricao);
	}

	public Servico(double preco) {
		super(preco);
	}

	public ServicosDTO toDTO() {

		return new ServicosDTO(this.getCodigo(), this.getDescricao(), this.getFamilia(), this.isAtivo(),
				this.getListaDePreco(), DecimalFormatUtils.formatDouble(this.getPreco()), this.getNomeUnidadeDeCompra(),
				DecimalFormatUtils.formatDouble(this.getPorUnidadeDeCompra()), this.getQtdePorCompra(),
				this.getNomeUnidadeVenda(), DecimalFormatUtils.formatDouble(this.getPorUnidadeDeVenda()),
				this.getQtdePorVenda(), this.getObservacao(), this.getAnexo());
	}
}
