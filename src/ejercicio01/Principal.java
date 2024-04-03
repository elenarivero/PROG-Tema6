package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		HoraExacta he = new HoraExacta(23, 59, 59);
		
		he.setMinutos(5);
		he.setHora(12);
		he.setSegundos(35);
		
		he.inc();
		
		System.out.println(he);

	}

}
