package exceptions;

public class TramaInvalidaException extends RuntimeException{

	public TramaInvalidaException(String mensaje) {
		super("Trama Invalida!" + mensaje);
	}

}
