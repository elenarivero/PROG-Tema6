package interfaces;

public interface Sonido {
	void voz();
	default void vozDurmiendo() {
		System.out.println("Zzzzz");
	}
}
