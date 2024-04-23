package interfaces.ejercicio03;

public class Gato extends AnimalDomestico{

	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}

	@Override
	public boolean hacerCaso() {
		boolean haceCaso = false;
		double valor = Math.random();
		
		if (valor <= 0.05) {
			haceCaso = true;
		}
		return haceCaso;
	}

	public void toserBolaPelo() {
		System.out.println("Tosiendo...");
	}
}
