package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class DescontoOrcamentoValorMaior500 extends Desconto {
	
	public DescontoOrcamentoValorMaior500(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {		
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}
}
