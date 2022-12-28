package pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import cliente.Cliente;
import orcamento.Orcamento;

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
	
	public void executar() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.qtdItens);
		Pedido pedido = new Pedido(cliente,LocalDateTime.now(),orcamento);
		
		System.out.println("SALVAR PEDIDO NO BANCO");
		System.out.println("ENVIAR EMAIL COM DADOS DO NOVO PEDIDO");
	}
	
	
}
