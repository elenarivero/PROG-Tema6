package pruebas;

public class Prueba {

	public static void main(String[] args) {
		Empleado e;
		
		Persona p = new Empleado("Pepe", 40, 1.80, 2000);
		
		if(p instanceof Empleado){
			e = (Empleado) p;
			System.out.println(e);
		} else {
			System.out.println("Objetos no compatibles");
		}

	}
}
