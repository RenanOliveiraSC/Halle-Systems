package br.com.entra21.amostradetalentos.model;

import br.com.entra21.amostradetalentos.dto.ProdutoDTO;
import br.com.entra21.amostradetalentos.utils.DecimalFormatUtils;

public class Produto extends ProdutoServico {

	private double estoqueMax;
	private double estoqueMin;
	private Deposito deposito;
	private Fabricante fabricante;

	public double getEstoqueMax() {
		return estoqueMax;
	}

	public Produto() {
	}

	public Produto(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			double preco, String nomeUnidadeDeCompra, double porUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, double porUnidadeDeVenda, double qtdePorVenda, String observacao, String anexo,
			double estoqueMax, double estoqueMin, Deposito deposito, Fabricante fabricante) {
		super(codigo, descricao, familia, ativo, listaDePreco, preco, nomeUnidadeDeCompra, porUnidadeDeCompra,
				qtdePorCompra, nomeUnidadeVenda, porUnidadeDeVenda, qtdePorVenda, observacao, anexo);
		this.estoqueMax = estoqueMax;
		this.estoqueMin = estoqueMin;
		this.deposito = deposito;
		this.fabricante = fabricante;
	}

	public Produto(Integer codigo, String descricao) {
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

	public ProdutoDTO toDTO() {
		return new ProdutoDTO(getCodigo(), getDescricao(), getFamilia(), isAtivo(), getListaDePreco(),
				DecimalFormatUtils.formatDecimal(this.getPreco()), getNomeUnidadeDeCompra(),
				DecimalFormatUtils.formatDecimal(this.getPorUnidadeDeCompra()), getQtdePorCompra(), getNomeUnidadeVenda(),
				DecimalFormatUtils.formatDecimal(this.getPorUnidadeDeVenda()), getQtdePorVenda(), getObservacao(),
				getAnexo(), this.estoqueMax, this.estoqueMin, this.deposito, this.fabricante);
	}

}
