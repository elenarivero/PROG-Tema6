package ejercicio02;

public class Tecnico extends Operario {
	
	public Tecnico(String nombre) {
		super(nombre);
	}

	public String toString() {
		String res = super.toString(); // Empleado nombre -> Operario
		res += " -> Tecnico";
		return res;		
	}

}
