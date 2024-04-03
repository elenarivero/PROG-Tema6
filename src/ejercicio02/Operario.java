package ejercicio02;

public class Operario extends Empleado {

	public Operario(String nombre) {
		super(nombre);
	}

	public String toString() {
		String res = super.toString(); // Empleado nombre
		res += " -> Operario";
		return res;
	}
}
