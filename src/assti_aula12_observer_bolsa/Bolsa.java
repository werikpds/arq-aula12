package assti_aula12_observer_bolsa;

public abstract class Bolsa implements Observer{
	
	public abstract void negocio (double n, double x);

	@Override
	public void update (double n, double x) {
		negocio(n, x);
	}
	
	
	

}
