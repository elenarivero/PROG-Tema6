package pruebas;

import excepciones.EdadNegativaException;

public class Prueba {

	public static void main(String[] args) {
		Empleado e;
		try {
			Persona p = new Empleado("Pepe", -5, 1.80, 2000);
			
			if(p instanceof Empleado){
				e = (Empleado) p;
				System.out.println(e);
			} else {
				System.out.println("Objetos no compatibles");
			}
		} catch(EdadNegativaException exc) {
			exc.printStackTrace();
		}
	}
}
