package excepciones;

public class EdadNegativaException extends Exception {
	
	@Override
	public String toString() {
		return "EdadNegativaException: Edad negativa";
	}
	
	@Override
	public String getMessage() {
		return "EdadNegativaException: Edad negativa";
	}
}
