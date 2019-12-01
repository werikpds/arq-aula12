package assti_aula12_observer_animais;

public interface Subject {
	
	public void addObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();

}
