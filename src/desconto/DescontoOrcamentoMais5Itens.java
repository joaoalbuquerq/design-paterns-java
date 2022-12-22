package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class DescontoOrcamentoMais5Itens extends Desconto{
	
	public DescontoOrcamentoMais5Itens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		if(orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}
}
