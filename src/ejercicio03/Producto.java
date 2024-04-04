package ejercicio03;

public class Producto {

	private String nombre = "";
	private double precio;

	public Producto() {

	}

	public Producto(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (precio >= 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	public double calcular(int cantidad) {
		return precio*cantidad;
	}

	public String toString() {
		String res = "Producto: " + this.nombre + "\n";
		res += "Precio: " + this.precio + "\n";
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		
		Producto p = (Producto) o;
		
		if(p.nombre.equals(this.nombre)) {
			res = true;
		}
		
		return res;
	}
}
