package pedido;

import java.time.LocalDateTime;
import java.util.List;

import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;

public class GerarPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;
	
	public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void execute(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
		Pedido pedido = new Pedido(dados.getCliente(),LocalDateTime.now(),orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
		
	}
}
