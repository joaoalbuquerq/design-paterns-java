import java.math.BigDecimal;

import cliente.Cliente;
import pedido.GerarPedido;
import pedido.GerarPedidoHandler;

public class TestePedidos {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("joao", "129");
		
		GerarPedido geradorPedidos = new GerarPedido(cliente, BigDecimal.TEN, 10);
		GerarPedidoHandler handler = new GerarPedidoHandler(/*dependencias*/);
		handler.execute(geradorPedidos);
	}
	
}
