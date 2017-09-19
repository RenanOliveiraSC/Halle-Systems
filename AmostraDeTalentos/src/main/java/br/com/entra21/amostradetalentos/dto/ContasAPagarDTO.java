package br.com.entra21.amostradetalentos.dto;

import java.util.Date;

import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;
import br.com.entra21.amostradetalentos.model.Fornecedor;

public class ContasAPagarDTO {

	private int codigo;
	private Fornecedor fornecedor;
	private FormaDePagamento formaDePagamento;
	private Date dataLancamento;
	private int diasAtraso;
	private Double total;
	private Double saldo;
	private Double desconto;
	private Double pagamentoTotal;

	public ContasAPagarDTO() {
	}

	public ContasAPagarDTO(int codigo, Fornecedor fornecedor, FormaDePagamento formaDePagamento, Date dataLancamento,
			int diasAtraso, Double total, Double saldo, Double desconto, Double pagamentoTotal) {
		super();
		this.codigo = codigo;
		this.fornecedor = fornecedor;
		this.formaDePagamento = formaDePagamento;
		this.dataLancamento = dataLancamento;
		this.diasAtraso = diasAtraso;
		this.total = total;
		this.saldo = saldo;
		this.desconto = desconto;
		this.pagamentoTotal = pagamentoTotal;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getDiasAtraso() {
		return diasAtraso;
	}

	public void setDiasAtraso(int diasAtraso) {
		this.diasAtraso = diasAtraso;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getPagamentoTotal() {
		return pagamentoTotal;
	}

	public void setPagamentoTotal(Double pagamentoTotal) {
		this.pagamentoTotal = pagamentoTotal;
	}

	public ContasAPagar toContasAPagar() {
		return new ContasAPagar(this.codigo, this.fornecedor.getCodigo(), this.formaDePagamento.getCodigo(),
				this.getDataLancamento(), this.getDiasAtraso(), this.getTotal(), this.getSaldo(), this.getSaldo(),
				this.getPagamentoTotal());
	}

}
