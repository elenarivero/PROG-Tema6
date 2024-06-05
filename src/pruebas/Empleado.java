package pruebas;

import excepciones.EdadNegativaException;

public class Empleado extends Persona {
	
	private double salario;
	String altura = "";

	public Empleado(String nombre, int edad, double altura, double salario) throws EdadNegativaException {
		super(nombre, edad, altura);
		this.salario = salario;
	}
	
	public Empleado(double salario) {
		super(); // Es el constructor de la clase Persona
		this.salario = salario;
	}



	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res += super.toString() + "\n";
		res += "Salario: " + this.salario;
		
		return res;
	}
	
}
