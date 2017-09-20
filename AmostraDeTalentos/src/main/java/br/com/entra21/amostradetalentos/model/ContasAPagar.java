package br.com.entra21.amostradetalentos.model;

import java.util.Date;

import br.com.entra21.amostradetalentos.dto.ContasAPagarDTO;
import br.com.entra21.amostradetalentos.utils.DateUtils;
import br.com.entra21.amostradetalentos.utils.DecimalFormatUtils;

public class ContasAPagar {

	private int codigo;
	private Fornecedor fornecedor;
	private FormaDePagamento formaDePagamento;
	private Date dataLancamento;
	private int diasAtraso;
	private Double total;
	private Double saldo;
	private Double desconto;
	private Double pagamentoTotal;

	public ContasAPagar(int codigo, Fornecedor fornecedor, FormaDePagamento formaDePagamento, Date dataLancamento,
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

	public ContasAPagar() {

	}

	public ContasAPagar(int codigo2, Integer codigo3, Integer codigo4, Date dataLancamento2, int diasAtraso2,
			Double total2, Double saldo2, Double saldo3, Double pagamentoTotal2) {
		// TODO Auto-generated constructor stub
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

	public FormaDePagamento getForneceFormaDePagamentodor() {
		return formaDePagamento;
	}

	public void setForneceFormaDePagamentodor(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
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

	public ContasAPagarDTO toDTO() {
		return new ContasAPagarDTO(this.codigo, this.fornecedor, this.formaDePagamento,
				DateUtils.formatData(this.dataLancamento, DateUtils.PATTERN_DATA_PADRAO), this.diasAtraso,
				DecimalFormatUtils.formatDecimal(this.total), DecimalFormatUtils.formatDecimal(this.saldo),
				this.desconto, DecimalFormatUtils.formatDecimal(this.pagamentoTotal));
	}

}
