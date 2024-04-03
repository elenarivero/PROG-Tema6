package ejercicio02;

public class Empleado {

	private String nombre;

	public Empleado(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public void setNombre(String nombre) {

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public String toString() {
		return "Empleado " + this.nombre;
	}

}
