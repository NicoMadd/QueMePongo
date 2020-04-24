package exceptions;

public class TipoPrendaInvalidaException extends RuntimeException{

	public TipoPrendaInvalidaException(String mensaje) {
		super("TipoPrenda Invalida!" + mensaje);
	}

}