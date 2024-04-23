package interfaces.ejercicio03;

public abstract class AnimalDomestico implements Animal {
	
	private String nombre = "";
	private String raza = "";
	private double peso;
	private String color = "";

	@Override
	public void comer() {
		this.peso += 0.1;
	}

	@Override
	public void dormir() {
		System.out.println("Zzzzz");
	}

	@Override
	public abstract void hacerRuido();

	public void vacunar() {
		System.out.println("Ya está vacunado");
	}
	
	public abstract boolean hacerCaso();
}
