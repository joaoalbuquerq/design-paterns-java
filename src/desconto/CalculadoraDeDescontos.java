package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto desconto = new DescontoOrcamentoMais5Itens(
			new DescontoOrcamentoValorMaior500(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
	
}
