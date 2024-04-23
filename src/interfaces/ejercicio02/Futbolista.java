package interfaces.ejercicio02;

public class Futbolista implements Comparable<Futbolista> {

	private int numCamiseta;
	private String nombre = "";
	private int edad;
	private int numGoles;
	
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if(numCamiseta > 0 && numCamiseta <=99) {
			this.numCamiseta = numCamiseta;
		}
		
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if ( edad > 0 ) {
			this.edad = edad;
		}
		
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Nº camiseta: " + this.numCamiseta +"\n";
		res += "Nombre: " + this.nombre +"\n";
		res += "Edad: " + this.edad +"\n";
		res += "Nº goles: " + this.numGoles +"\n";
		res += "------------------------------------------\n";
		return res;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		Futbolista futbolista = (Futbolista) obj;
				
		if (this.numCamiseta == futbolista.numCamiseta 
				&& this.nombre.equals(futbolista.nombre)) {
			res = true;
		}
		
		return res;
	}

	@Override
	public int compareTo(Futbolista o) {
		int res;
		
		if(this.numCamiseta < o.numCamiseta) {
			res = -1;
		} else if (this.numCamiseta > o.numCamiseta) {
			res = 1;
		} else {
			res = this.nombre.compareTo(o.nombre);
		}
		return res;
	}
	
}
