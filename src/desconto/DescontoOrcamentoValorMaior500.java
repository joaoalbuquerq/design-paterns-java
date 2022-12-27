package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class DescontoOrcamentoValorMaior500 extends Desconto {
	
	public DescontoOrcamentoValorMaior500(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {		
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
