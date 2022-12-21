import java.math.BigDecimal;

import desconto.CalculadoraDeDescontos;
import orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 5);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
		System.out.println(calc.calcular(primeiro) + " De desconto");
		System.out.println(calc.calcular(segundo) + " De desconto");

	}

}
