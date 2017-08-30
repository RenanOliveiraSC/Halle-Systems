package br.com.entra21.amostradetalentos.model;

public class ParceiroDeNegocio {

	private Integer codigo;
	private String nome;
	private GrupoPn grupoPn;
	private double limiteDeCredito;
	private ListaDePreco listaDePreco;
	private String cpf;
	private Endereco endereco;

	public ParceiroDeNegocio() {
		super();
	}

	public ParceiroDeNegocio(Integer codigo, String nome, GrupoPn grupoPn, double limiteDeCredito,
			ListaDePreco listaDePreco, String cpf, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.grupoPn = grupoPn;
		this.limiteDeCredito = limiteDeCredito;
		this.listaDePreco = listaDePreco;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GrupoPn getGrupoPn() {
		return grupoPn;
	}

	public void setGrupoPn(GrupoPn grupoPn) {
		this.grupoPn = grupoPn;
	}

	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public ListaDePreco getListaDePreco() {
		return listaDePreco;
	}

	public void setListaDePreco(ListaDePreco listaDePreco) {
		this.listaDePreco = listaDePreco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
