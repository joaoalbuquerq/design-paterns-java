package pedido;

import java.time.LocalDateTime;

import cliente.Cliente;
import orcamento.Orcamento;

public class Pedido {
	private Cliente cliente;
	private LocalDateTime data;
	private Orcamento orcamento;
	
	public Pedido(Cliente cliente, LocalDateTime data, Orcamento orcamento) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}
	
	
	
}
