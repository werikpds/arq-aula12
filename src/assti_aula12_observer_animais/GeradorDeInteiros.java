package assti_aula12_observer_animais;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorDeInteiros implements Subject {
	List <Observer> observers;
	private Random gerador;
	private int n;

	public GeradorDeInteiros() {
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
		for (Observer o : observers)
			o.update(n);
	}
	
	public void iniciar() {
		while (true) {
			n = gerador.nextInt(10) + 1;
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
