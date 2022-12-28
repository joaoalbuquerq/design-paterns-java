import java.math.BigDecimal;
import java.util.Arrays;

import cliente.Cliente;
import pedido.GerarPedido;
import pedido.GerarPedidoHandler;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDados;

public class TestePedidos {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("joao", "129");
		
		GerarPedido geradorPedidos = new GerarPedido(cliente, BigDecimal.TEN, 10);
		GerarPedidoHandler handler = new GerarPedidoHandler(
				Arrays.asList(
						new SalvarPedidoNoBancoDados(), 
						new EnviarEmailPedido()
				));
		handler.execute(geradorPedidos);
	}
	
}
