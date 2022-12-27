package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
	
	
}
