package assti_aula12_observer_bolsa;

import java.text.DecimalFormat;

public class Investidor1 extends Bolsa {
	
	@Override
	public void negocio(double n, double x) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		df.format(1234.36); 
		System.out.print("Valor de compra: " + df.format(n) + "\nValor de venda: " + df.format(x));
		if (n >= x) {
			System.out.println("\nNegócio fechado: ");
		}else {
			System.out.println("\nNégocio negado");
		}
	}
	
}
