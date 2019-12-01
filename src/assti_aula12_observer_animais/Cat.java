package assti_aula12_observer_animais;

public class Cat extends Animal {

	@Override
	public void agir(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("z ");
		}
		System.out.println();
	}

}
