package exceptions;

public class AtuendoInvalidoException extends RuntimeException{

	public AtuendoInvalidoException(String mensaje) {
		super("Atuendo Invalido!" + mensaje);
	}

}
