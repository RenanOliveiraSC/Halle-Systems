package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Familia;
import br.com.entra21.amostradetalentos.model.ListaDePreco;
import br.com.entra21.amostradetalentos.model.Servico;

public class ServicosDTO extends ProdutoServicoDTO{

	
	
	public ServicosDTO(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			double preco, String nomeUnidadeDeCompra, double porUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, double porUnidadeDeVenda, double qtdePorVenda, String observacao, String anexo) {
		super(codigo, descricao, familia, ativo, listaDePreco, preco, nomeUnidadeDeCompra, porUnidadeDeCompra, qtdePorCompra,
				nomeUnidadeVenda, porUnidadeDeVenda, qtdePorVenda, observacao, anexo);
	}

	public ServicosDTO(Integer codigo, String descricao) {
		super(codigo, descricao);
	}

	public ServicosDTO() {

	}
	
	public Servico toServico() {
		return null;
	}
	
}
