package exceptions;

public class GuardarropaContienePrendaException extends RuntimeException{

	public GuardarropaContienePrendaException() {
		super("Esta Prenda ya pertenece al guardarropa");
	}

}
