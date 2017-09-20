package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.Familia;
import br.com.entra21.amostradetalentos.model.ListaDePreco;

public abstract class ProdutoServicoDTO {

	private Integer codigo;
	private String descricao;
	private Familia familia;
	private boolean ativo;
	private ListaDePreco listaDePreco;
	private String preco;
	private String nomeUnidadeDeCompra;
	private String porUnidadeDeCompra;
	private double qtdePorCompra;
	private String nomeUnidadeVenda;
	private String porUnidadeDeVenda;
	private double qtdePorVenda;
	private String observacao;
	private String anexo;

	public ProdutoServicoDTO() {
		super();
	}

	public ProdutoServicoDTO(Integer codigo, String descricao, Familia familia, boolean ativo,
			ListaDePreco listaDePreco, String preco, String nomeUnidadeDeCompra, String porUnidadeDeCompra,
			double qtdePorCompra, String nomeUnidadeVenda, String porUnidadeDeVenda, double qtdePorVenda,
			String observacao, String anexo) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.familia = familia;
		this.ativo = ativo;
		this.listaDePreco = listaDePreco;
		this.nomeUnidadeDeCompra = nomeUnidadeDeCompra;
		this.porUnidadeDeCompra = porUnidadeDeCompra;
		this.qtdePorCompra = qtdePorCompra;
		this.nomeUnidadeVenda = nomeUnidadeVenda;
		this.porUnidadeDeVenda = porUnidadeDeVenda;
		this.qtdePorVenda = qtdePorVenda;
		this.observacao = observacao;
		this.anexo = anexo;

	}

	public ProdutoServicoDTO(Integer codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public ListaDePreco getListaDePreco() {
		return listaDePreco;
	}

	public void setListaDePreco(ListaDePreco listaDePreco) {
		this.listaDePreco = listaDePreco;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getNomeUnidadeDeCompra() {
		return nomeUnidadeDeCompra;
	}

	public void setNomeUnidadeDeCompra(String nomeUnidadeDeCompra) {
		this.nomeUnidadeDeCompra = nomeUnidadeDeCompra;
	}

	public String getPorUnidadeDeCompra() {
		return porUnidadeDeCompra;
	}

	public void setPorUnidadeDeCompra(String porUnidadeDeCompra) {
		this.porUnidadeDeCompra = porUnidadeDeCompra;
	}

	public double getQtdePorCompra() {
		return qtdePorCompra;
	}

	public void setQtdePorCompra(double qtdePorCompra) {
		this.qtdePorCompra = qtdePorCompra;
	}

	public String getNomeUnidadeVenda() {
		return nomeUnidadeVenda;
	}

	public void setNomeUnidadeVenda(String nomeUnidadeVenda) {
		this.nomeUnidadeVenda = nomeUnidadeVenda;
	}

	public String getPorUnidadeDeVenda() {
		return porUnidadeDeVenda;
	}

	public void setPorUnidadeDeVenda(String porUnidadeDeVenda) {
		this.porUnidadeDeVenda = porUnidadeDeVenda;
	}

	public double getQtdePorVenda() {
		return qtdePorVenda;
	}

	public void setQtdePorVenda(double qtdePorVenda) {
		this.qtdePorVenda = qtdePorVenda;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

}
