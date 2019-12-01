package assti_aula12_observer_bolsa;

public class Inicio {

	public static void main(String[] args) {
		
		GeradorDeValores geradorDeValores = new GeradorDeValores();
		Investidor1 i1 = new Investidor1();
		geradorDeValores.addObserver(i1);
		geradorDeValores.iniciar();
	}

}
