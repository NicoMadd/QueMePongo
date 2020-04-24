package domain;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class Uniforme extends Atuendo {
	
	public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
		agregarPrendaCalzado(calzado);
		agregarPrendaInferior(parteInferior);
		agregarPrendaSuperior(parteSuperior);
		agregarPrendaAccesorio(null);
	}
	
	@Override
	public void agregarPrendaAccesorio(Prenda unaPrenda) {
		throw new UniformeInvalidoException("No se puede agregar un Accesorio a un Uniforme");
		}
	
}
