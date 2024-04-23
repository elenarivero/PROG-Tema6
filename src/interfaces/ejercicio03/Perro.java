package interfaces.ejercicio03;

public class Perro extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("Guau");
		
	}

	@Override
	public boolean hacerCaso() {
		boolean haceCaso = false;
		double valor = Math.random();
		
		if(valor >= 0.1) {
			haceCaso = true;
		}
		
		return haceCaso;
	}

	public void sacarPaseo() {
		System.out.println("Salir de paseo...");
	}
}
