package DTO;

import br.com.entra21.amostradetalentos.model.Deposito;
import br.com.entra21.amostradetalentos.model.Fabricante;
import br.com.entra21.amostradetalentos.model.Produto;

public class ProdutoDTO {

	private double estoqueMax;
	private double estoqueMin;
	private Deposito deposito;
	private Fabricante fabricante;
	
	public ProdutoDTO() {	
	}
	
	public ProdutoDTO (double estoqueMax, double estoqueMin, Deposito deposito, Fabricante fabricante) {
		this.estoqueMax = estoqueMax;
		this.estoqueMin = estoqueMin;
		this.deposito = deposito;
		this.fabricante = fabricante;
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
		return new Produto(
		this.estoqueMax,
		this.estoqueMin,
		this.deposito,
		this.fabricante
		);
				
	}
}
