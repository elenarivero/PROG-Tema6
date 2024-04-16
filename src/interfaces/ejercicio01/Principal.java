package interfaces.ejercicio01;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Socio[] socios = new Socio[4];
		
		Socio s1 = new Socio(1, "Manuel", 20);
		Socio s2 = new Socio(2, "Alejandra", 18);
		Socio s3 = new Socio(3, "María", 25);
		Socio s4 = new Socio(4, "Paco", 30);

		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s1));
		System.out.println(s3.compareTo(s3));
		System.out.println(s4.compareTo(s2));
		
		socios[0] = s4;
		socios[1] = s2;
		socios[2] = s1;
		socios[3] = s3;
		
		Arrays.sort(socios);
		System.out.println(Arrays.toString(socios));
	}

}
