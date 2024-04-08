package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		int sumaPrecios = 0;
		int sumaLavadoras = 0;
		int sumaTelevisores = 0;
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		
		
		
		for(Electrodomestico elect : electrodomesticos) {
			elect.precioFinal();
		}
		
		for(Electrodomestico elect : electrodomesticos) {
			sumaPrecios += elect.getPrecioBase();
			
			if(elect instanceof Lavadora) {
				
			} else if (elect instanceof Television) {
				
			} 
		}
		
		
	}

}
