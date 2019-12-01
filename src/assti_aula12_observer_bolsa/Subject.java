package assti_aula12_observer_bolsa;

public interface Subject {

	public void addObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();
	
}
