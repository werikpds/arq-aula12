package assti_aula12_observer_bolsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorDeValores implements Subject {
	List <Observer> observers;
	private Random gerador;
	private double compra;
	private double venda;
	
	public GeradorDeValores() {
		observers = new ArrayList<>();
		gerador = new Random();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(compra, venda);
		}
	}
	
	public void iniciar() {
		while (true) {
			compra = 20 + gerador.nextDouble()*5;
			venda = 20 + gerador.nextDouble()*5;
			notifyObservers();
			System.out.println("========================================================");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
