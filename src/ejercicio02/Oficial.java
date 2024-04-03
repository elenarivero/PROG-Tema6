package ejercicio02;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
	}

	public String toString() {
		String res = super.toString(); // Empleado nombre -> Operario
		res += " -> Oficial";
		return res;
	}
}
