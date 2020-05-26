package domain;

abstract class Sastre {
	Prenda calzado;
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Borrador borrador;
	
    public Uniforme fabricarUniforme() {
    	return new Uniforme(this.fabricarParteSuperior(), this.fabricarParteInferior(), this.fabricarCalzado());
    }
    
    abstract Prenda fabricarParteSuperior();
    abstract Prenda fabricarParteInferior();
    abstract Prenda fabricarCalzado();

}
