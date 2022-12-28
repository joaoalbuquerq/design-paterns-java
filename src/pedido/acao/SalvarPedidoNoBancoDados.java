package pedido.acao;

import pedido.Pedido;

public class SalvarPedidoNoBancoDados implements AcaoAposGerarPedido{
	public void executarAcao(Pedido pedido) {
		System.out.println("SALVANDO PEDIDO NO BANCO");
	}
}
