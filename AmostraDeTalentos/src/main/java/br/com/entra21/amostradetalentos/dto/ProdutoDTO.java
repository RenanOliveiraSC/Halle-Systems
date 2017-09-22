package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Deposito;
import br.com.entra21.amostradetalentos.model.Fabricante;
import br.com.entra21.amostradetalentos.model.Familia;
import br.com.entra21.amostradetalentos.model.ListaDePreco;
import br.com.entra21.amostradetalentos.model.Produto;
import br.com.entra21.amostradetalentos.utils.DecimalFormatUtils;

public class ProdutoDTO extends ProdutoServicoDTO {

	private double estoqueMax;
	private double estoqueMin;
	private Deposito deposito;
	private Fabricante fabricante;

	public double getEstoqueMax() {
		return estoqueMax;
	}

	public ProdutoDTO() {
	}

	public ProdutoDTO(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			String preco, String nomeUnidadeDeCompra, String porUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, String porUnidadeDeVenda, double qtdePorVenda, String observacao, String anexo,
			double estoqueMax, double estoqueMin, Deposito deposito, Fabricante fabricante) {
		super(codigo, descricao, familia, ativo, listaDePreco, preco, nomeUnidadeDeCompra, porUnidadeDeCompra,
				qtdePorCompra, nomeUnidadeVenda, porUnidadeDeVenda, qtdePorVenda, observacao, anexo);
		this.estoqueMax = estoqueMax;
		this.estoqueMin = estoqueMin;
		this.deposito = deposito;
		this.fabricante = fabricante;
	}

	public ProdutoDTO(Integer codigo, String descricao) {
		super(codigo, descricao);
	}

	@Override
	public String toString() {
		return "nome: " + this.getDescricao() + " familia " + this.getFamilia().getNome() + " fabricante "
				+ this.getFabricante().getNome() + " preco " + this.getPreco() + " porUnidade "
				+ this.getPorUnidadeDeCompra();
	}

	public void setEstoqueMax(double estoqueMax) {
		this.estoqueMax = estoqueMax;
	}

	public double getEstoqueMin() {
		return estoqueMin;
	}

	public void setEstoqueMin(double estoqueMin) {
		this.estoqueMin = estoqueMin;
	}

	public Deposito getDeposito() {
		return deposito;
	}

	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Produto toProduto() {
		return new Produto(this.getCodigo(), this.getDescricao(), this.getFamilia(), this.isAtivo(),
				this.getListaDePreco(), DecimalFormatUtils.parseDecimal(this.getPreco()), this.getNomeUnidadeDeCompra(),
				DecimalFormatUtils.parseDecimal(this.getPorUnidadeDeCompra()), this.getQtdePorCompra(),
				this.getNomeUnidadeVenda(), DecimalFormatUtils.parseDecimal(this.getPorUnidadeDeVenda()),
				this.getQtdePorVenda(), this.getObservacao(), this.getAnexo(), this.estoqueMax, this.estoqueMin,
				this.deposito, this.fabricante);
	}
}
