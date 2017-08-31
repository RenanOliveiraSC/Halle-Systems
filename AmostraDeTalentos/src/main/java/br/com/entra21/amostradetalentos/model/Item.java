package br.com.entra21.amostradetalentos.model;

public class Item extends Item_Servico {

	private double estoqueMax;
	private double estoqueMin;
	private double deposito;
	private Fabricante fabricante;

	public Item(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			double unidadeDeCompra, double porUnidadeDeCompra, String nomeUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, double unidadeDeVenda, double porUnidadeDeVenda, String nomeUnidadeDeVenda,
			double qtdePorVenda, String observacao, String anexo, double estoqueMax, double estoqueMin, double deposito,
			Fabricante fabricante) {
		super(codigo, descricao, familia, ativo, listaDePreco, unidadeDeCompra, porUnidadeDeCompra, nomeUnidadeDeCompra,
				qtdePorCompra, nomeUnidadeVenda, unidadeDeVenda, porUnidadeDeVenda, nomeUnidadeDeVenda, qtdePorVenda,
				observacao, anexo);
		this.estoqueMax = estoqueMax;
		this.estoqueMin = estoqueMin;
		this.deposito = deposito;
		this.fabricante = fabricante;
	}

	public Item() {
		super();
	}

	public double getEstoqueMax() {
		return estoqueMax;
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

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
