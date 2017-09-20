package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Familia;
import br.com.entra21.amostradetalentos.model.ListaDePreco;
import br.com.entra21.amostradetalentos.model.Servico;

import br.com.entra21.amostradetalentos.utils.*;

public class ServicosDTO extends ProdutoServicoDTO {

	public ServicosDTO(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			String preco, String nomeUnidadeDeCompra, String porUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, String porUnidadeDeVenda, double qtdePorVenda, String observacao, String anexo) {
		super(codigo, descricao, familia, ativo, listaDePreco, preco, nomeUnidadeDeCompra, porUnidadeDeCompra,
				qtdePorCompra, nomeUnidadeVenda, porUnidadeDeVenda, qtdePorVenda, observacao, anexo);
	}

	public ServicosDTO(Integer codigo, String descricao) {
		super(codigo, descricao);
	}

	public ServicosDTO() {

	}

	public Servico toServico() {
		return new Servico(this.getCodigo(), this.getDescricao(), this.getFamilia(), this.isAtivo(),
				this.getListaDePreco(), DecimalFormatUtils.parseDouble(this.getPreco()), this.getNomeUnidadeDeCompra(),
				DecimalFormatUtils.parseDouble(this.getPorUnidadeDeCompra()), this.getQtdePorCompra(),
				this.getNomeUnidadeVenda(), DecimalFormatUtils.parseDouble(this.getPorUnidadeDeVenda()),
				this.getQtdePorVenda(), this.getObservacao(), this.getAnexo());
	}

}
