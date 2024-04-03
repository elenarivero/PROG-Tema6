package pruebas;

public class Persona {
	protected String nombre;
	protected int edad;
	protected double altura;
	
	
	public Persona() {
		super();
	}

	
	public Persona(String nombre, int edad, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}


	public String toString() {
		String res = "";
		res += nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		res += "Altura: " + this.altura;
		
		return res;
	}
	
}
