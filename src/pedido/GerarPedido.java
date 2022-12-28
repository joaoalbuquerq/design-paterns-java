package pedido;

import java.math.BigDecimal;

import cliente.Cliente;

public class GerarPedido {

	private Cliente cliente;
	private BigDecimal valorOrcamento;
	private int qtdItens;
	
	public GerarPedido(Cliente cliente, BigDecimal valorOrcamento, int qtdItens) {
		super();
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.qtdItens = qtdItens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQtdItens() {
		return qtdItens;
	}
	
	
}
