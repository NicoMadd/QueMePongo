package domain;


public class Uniforme {
	Prenda calzado;
	Prenda prendaSuperior;
	Prenda prendaInferior;
	
	public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
		agregarPrendaCalzado(calzado);
		agregarPrendaInferior(parteInferior);
		agregarPrendaSuperior(parteSuperior);
	}
	

    
	private void agregarPrendaSuperior(Prenda parteSuperior) {
		this.prendaSuperior = parteSuperior;
		
	}

	private void agregarPrendaInferior(Prenda parteInferior) {
		this.prendaSuperior = parteInferior;
		
	}

	private void agregarPrendaCalzado(Prenda calzado) {
		this.prendaSuperior = calzado;
		
	}
	
	
}
