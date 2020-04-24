package exceptions;

public class UniformeInvalidoException extends RuntimeException{

	public UniformeInvalidoException(String mensaje) {
		super("Uniforme Invalido!" + mensaje);
	}

}