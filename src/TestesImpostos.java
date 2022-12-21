import java.math.BigDecimal;

import imposto.CalculadoraImpostos;
import imposto.ICMS;
import orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraImpostos calc = new CalculadoraImpostos();
		System.out.println(calc.calcular(orcamento, new ICMS()));

	}

}
