package br.com.entra21.amostradetalentos.model;

public class SalvaAgenda {
	
	private int codigo;
	private Agendamento agenda;
	private Cliente cliente;
	private Funcionario funcionario;
	private ServicoProduto servicoProduto;
	
	
	public SalvaAgenda() {
		super();
	}


	public SalvaAgenda(int codigo, Agendamento agenda, Cliente cliente, Funcionario funcionario,
			ServicoProduto servicoProduto) {
		super();
		this.codigo = codigo;
		this.agenda = agenda;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.servicoProduto = servicoProduto;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Agendamento getAgenda() {
		return agenda;
	}


	public void setAgenda(Agendamento agenda) {
		this.agenda = agenda;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public ServicoProduto getServicoProduto() {
		return servicoProduto;
	}


	public void setServicoProduto(ServicoProduto servicoProduto) {
		this.servicoProduto = servicoProduto;
	}
	
	
	
	
}
