package interfaces;

public class Perro extends Animal implements Sonido {

	@Override
	public void voz() {
		System.out.println("Guau");
	}

	
}
