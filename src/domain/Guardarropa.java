package domain;

import java.util.LinkedList;

public class Guardarropa {
	LinkedList<Prenda> guardarropa;
	public Guardarropa() {
		this.guardarropa = new LinkedList<>();
	
	}
	
	public void agregar(Prenda unaPrenda) {
		guardarropa.add(unaPrenda);
	}
	
	public boolean contiene(Prenda unaPrenda) {
		return guardarropa.contains(unaPrenda);
	}
	

}
