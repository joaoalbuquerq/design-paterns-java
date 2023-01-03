import java.math.BigDecimal;

import orcamento.JavaHttpClient;
import orcamento.Orcamento;
import orcamento.RegistroOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registroAPIExterna = new RegistroOrcamento(new JavaHttpClient());
		registroAPIExterna.registrar(orcamento);
		
	}
}
