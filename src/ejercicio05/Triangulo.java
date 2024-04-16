package ejercicio05;

public class Triangulo extends Poligono {

	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo() {
		super(3);
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3); // this()
		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		if (lado2 > 0) {
			this.lado2 = lado2;
		}

		if (lado3 > 0) {
			this.lado3 = lado3;
		}

	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	@Override
	public double area() {
		double semiPerimetro = (lado1 + lado2 + lado3)/2;
		double area = Math.sqrt(semiPerimetro * (semiPerimetro-lado1) * (semiPerimetro-lado2)*(semiPerimetro-lado3));
		return area;
	}

	@Override
	public String toString() {
		return "Triángulo: " + lado1 + "x" + lado2 + "x" + lado3;
	}
}
