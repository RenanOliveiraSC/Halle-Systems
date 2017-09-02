package br.com.entra21.amostradetalentos.model;

public abstract class ProdutoServico {

	private Integer codigo;
	private String descricao;
	private Familia familia;
	private boolean ativo;
	private ListaDePreco listaDePreco;
	private double unidadeDeCompra;
	private double porUnidadeDeCompra;
	private String nomeUnidadeDeCompra;
	private double qtdePorCompra;
	private String nomeUnidadeVenda;
	private double unidadeDeVenda;
	private double porUnidadeDeVenda;
	private String nomeUnidadeDeVenda;
	private double qtdePorVenda;
	private String observacao;
	private String anexo;

	public ProdutoServico() {
		super();
	}

	public ProdutoServico(Integer codigo, String descricao, Familia familia, boolean ativo, ListaDePreco listaDePreco,
			double unidadeDeCompra, double porUnidadeDeCompra, String nomeUnidadeDeCompra, double qtdePorCompra,
			String nomeUnidadeVenda, double unidadeDeVenda, double porUnidadeDeVenda, String nomeUnidadeDeVenda,
			double qtdePorVenda, String observacao, String anexo) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.familia = familia;
		this.ativo = ativo;
		this.listaDePreco = listaDePreco;
		this.unidadeDeCompra = unidadeDeCompra;
		this.porUnidadeDeCompra = porUnidadeDeCompra;
		this.nomeUnidadeDeCompra = nomeUnidadeDeCompra;
		this.qtdePorCompra = qtdePorCompra;
		this.nomeUnidadeVenda = nomeUnidadeVenda;
		this.unidadeDeVenda = unidadeDeVenda;
		this.porUnidadeDeVenda = porUnidadeDeVenda;
		this.nomeUnidadeDeVenda = nomeUnidadeDeVenda;
		this.qtdePorVenda = qtdePorVenda;
		this.observacao = observacao;
		this.anexo = anexo;

	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
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

	public double getUnidadeDeCompra() {
		return unidadeDeCompra;
	}

	public void setUnidadeDeCompra(double unidadeDeCompra) {
		this.unidadeDeCompra = unidadeDeCompra;
	}

	public double getPorUnidadeDeCompra() {
		return porUnidadeDeCompra;
	}

	public void setPorUnidadeDeCompra(double porUnidadeDeCompra) {
		this.porUnidadeDeCompra = porUnidadeDeCompra;
	}

	public String getNomeUnidadeDeCompra() {
		return nomeUnidadeDeCompra;
	}

	public void setNomeUnidadeDeCompra(String nomeUnidadeDeCompra) {
		this.nomeUnidadeDeCompra = nomeUnidadeDeCompra;
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

	public double getUnidadeDeVenda() {
		return unidadeDeVenda;
	}

	public void setUnidadeDeVenda(double unidadeDeVenda) {
		this.unidadeDeVenda = unidadeDeVenda;
	}

	public double getPorUnidadeDeVenda() {
		return porUnidadeDeVenda;
	}

	public void setPorUnidadeDeVenda(double porUnidadeDeVenda) {
		this.porUnidadeDeVenda = porUnidadeDeVenda;
	}

	public String getNomeUnidadeDeVenda() {
		return nomeUnidadeDeVenda;
	}

	public void setNomeUnidadeDeVenda(String nomeUnidadeDeVenda) {
		this.nomeUnidadeDeVenda = nomeUnidadeDeVenda;
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

}
