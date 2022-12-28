package pedido;

import java.time.LocalDateTime;

import orcamento.Orcamento;

public class GerarPedidoHandler {

	//Construtor com injeção de dependências(repository, service, etc...)
	
	public void execute(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
		Pedido pedido = new Pedido(dados.getCliente(),LocalDateTime.now(),orcamento);
		
		System.out.println("SALVAR PEDIDO NO BANCO");
		System.out.println("ENVIAR EMAIL COM DADOS DO NOVO PEDIDO");
	}
}
