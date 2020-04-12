package exceptions;

public class GuardarropaContienePrendaException extends Exception{

	public GuardarropaContienePrendaException() {
		super("Esta Prenda ya pertenece al guardarropa");
	}

}
