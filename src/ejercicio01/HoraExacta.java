package ejercicio01;

public class HoraExacta extends Hora {

	private int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);

		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}

	boolean setSegundos(int valor) {
		boolean res = false;

		if (valor >= 0 && valor <= 59) {
			this.segundos = valor;
			res = true;
		}

		return res;
	}

	@Override
	public void inc() {
		segundos++;
		
		if (segundos == 60) {
			segundos = 0;
			super.inc();
		}
	}
	
	@Override
	public String toString() {
		String res = super.toString(); // horas:minutos
		
		res += ":";
		
		if(segundos<10) {
			res+="0";
		}
		
		res += segundos;
		
		return res;
				
	}
	
}
