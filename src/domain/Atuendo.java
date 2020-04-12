package domain;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class Atuendo {
	List<Prenda> prendas;
	
	public Atuendo() {
		this.prendas = new ArrayList<>();
		/* El usuario ingresa solo hasta 4 prendas, y minimo 3,
		*  deben ser una de cada categoria,(solo hay 4), excluyendo los accesorios, !!!se valida aca!!!
		*  en caso de excepcion informa el error correspondiente.
		*/	}
	
	private boolean contienePrendasNecesarias() throws AtuendoInvalidoException{
		return prendas.stream().anyMatch( prenda -> prenda.esCalzado()) &&
			prendas.stream().anyMatch(prenda -> prenda.esParteInferior()) &&
			prendas.stream().anyMatch( prenda -> prenda.esParteSuperior());
	}
	
	public void validar() throws AtuendoInvalidoException{
		if(prendas.isEmpty()) {
			throw new AtuendoInvalidoException("Atuendo Invalido! El atuendo no contiene prendas");
		}
		if(prendas.size()<3 || prendas.size()>4) {
			throw new AtuendoInvalidoException("Atuendo Invalido! Le faltan prendas o tiene de mas!");
		
		}else if(!contienePrendasNecesarias()) {
			throw new AtuendoInvalidoException("Atuendo Invalido! El atuendo no contiene las prendas necesarias para su "
												+ "validacion. Estas son un UNICO CALZADO, UNA UNICA "
												+ "PARTE SUPERIOR Y UNA UNICA PARTE INFERIOR");
		}
	}

	public void agregarPrenda(Prenda unaPrenda) {
		prendas.add(unaPrenda);
	}
}
