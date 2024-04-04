package ejercicio03;

public class Perecedero extends Producto {

	private int diasCaducar;

	public Perecedero() {
		super();
	}

	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);

		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	public int getDiasCaducar() {
		return this.diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	@Override
	public double calcular(int cantidad) {
		double nuevoPrecio = super.calcular(cantidad);

		switch (diasCaducar) {
		case 1:
			nuevoPrecio /= 4;
			break;
		case 2:
			nuevoPrecio /=3;
			break;
		case 3:
			nuevoPrecio /= 2;
			break;
		}

		return nuevoPrecio;
	}
	
	public String toString() {
		String res = super.toString(); // Nombre + precio
		res += "Días a caducar: " + this.diasCaducar;
		return res;
	}
}
