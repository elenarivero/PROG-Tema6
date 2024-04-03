package pruebas;

public class Empleado extends Persona {
	private double salario;

	public Empleado(String nombre, int edad, double altura, double salario) {
		super(nombre, edad, altura);
		this.salario = salario;
	}
	
	public Empleado(double salario) {
		super(); // Es el constructor de la clase Persona
		this.salario = salario;
	}



	public String toString() {
		String res = "";
		
		res += super.toString() + "\n";
		res += "Salario: " + this.salario;
		
		
		return res;
	}
	
	
}
