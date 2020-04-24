package domain;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.PartialResultException;

public class Atuendo {
	Prenda calzado;
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda accesorio;
	
	public Atuendo() {
		this.calzado = null;
		this.accesorio = null;
		this.prendaSuperior = null;
		this.prendaInferior = null;
	}
	
	private boolean contienePrendasNecesarias(){
		return calzado.esCalzado() &&
			prendaInferior.esParteInferior() &&
			prendaSuperior.esParteSuperior();
	}
	
	public void validar(){
		if(!contienePrendasNecesarias()) {
			throw new AtuendoInvalidoException("El atuendo no contiene las prendas necesarias para su "
												+ "validacion. Estas son un UNICO CALZADO, UNA UNICA "
												+ "PARTE SUPERIOR Y UNA UNICA PARTE INFERIOR");
		}
	}
	
	public void agregarPrendaAccesorio(Prenda unaPrenda) {
		if(unaPrenda.esAccesorio())
			accesorio=unaPrenda;
		else
			throw new UniformeInvalidoException("La prenda " + unaPrenda + "no es accesorio");
	}
	
	public void agregarPrendaSuperior(Prenda unaPrenda) {
		if(unaPrenda.esParteSuperior())
			prendaSuperior=unaPrenda;
		else
			throw new UniformeInvalidoException("La prenda " + unaPrenda + "no es parte superior");
	}
	
	public void agregarPrendaCalzado(Prenda unaPrenda) {
		if(unaPrenda.esCalzado())
			calzado=unaPrenda;
		else
			throw new UniformeInvalidoException("La prenda " + unaPrenda + "no es calzado");
	}
	
	public void agregarPrendaInferior(Prenda unaPrenda) {
		if(unaPrenda.esParteInferior())
			prendaInferior=unaPrenda;
		else
			throw new UniformeInvalidoException("La prenda " + unaPrenda + "no es parte inferior");
	}

}
