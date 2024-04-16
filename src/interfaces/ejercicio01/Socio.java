package interfaces.ejercicio01;

public class Socio implements Comparable<Socio>{

	private int id;
	private String nombre = "";
	private int edad;	
	
	public Socio(int id, String nombre, int edad) {
		super();
		if (id > 0) {
			this.id = id;
		}
		
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if (edad > 0) {
			this.edad = edad;
		}
		
	}
	
	public String toString() {
		String res = "";
		res += "id: " + this.id + "\n";
		res += "Nombre: " + this.nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		return res;
	}

	@Override
	public int compareTo(Socio o) {
		int res = 0;
		
		if(this.id < o.id) {
			res = -1;
		} else if (this.id > o.id) {
			res = 1;
		}
		
		return res;
	}
	
	
}
