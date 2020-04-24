package domain;


import exceptions.PrendaInvalidaException;

public class Prenda {
	TipoPrenda tipoPrenda;
	Color colorPrimario;
	Color colorSecundario;
	Material material;
	public Prenda(TipoPrenda unTipoPrenda) {
		this.tipoPrenda = unTipoPrenda;
		this.colorPrimario = null;
		this.colorSecundario = null;
		this.material = null;
	}
	
	public void validar(){
		if(tipoPrenda.equals(null)) {
			throw new PrendaInvalidaException("La prenda no tiene un tipo asignado");
		}
		if(colorPrimario.equals(null)) {
			throw new PrendaInvalidaException("La prenda no tiene un color asignado");
		}
		if(material.equals(null)) {
			throw new PrendaInvalidaException("La prenda no tiene un material asignado");
		}
	}
	
	public void asignarColorPrimario(Color color) {
		colorPrimario = tipoPrenda.asignarColor(color);
	}
	
	public void asignarColorSecundario(Color color) {
		colorSecundario = tipoPrenda.asignarColor(color);
	}
	
	public void asignarMaterial(Material material) {
		material = tipoPrenda.asignarMaterial(material);
	}
	
	public CategoriaPrenda getCategoriaPrenda() {
		return tipoPrenda.getCategoria();
	}

	public boolean esParteSuperior() {
		return getCategoriaPrenda()==CategoriaPrenda.PARTE_SUPERIOR;
	}
	
	public boolean esParteInferior() {
		return getCategoriaPrenda()==CategoriaPrenda.PARTE_INFERIOR;
	}
	
	public boolean esCalzado() {
		return getCategoriaPrenda()==CategoriaPrenda.CALZADO;
	}
	
	public boolean esAccesorio() {
		return getCategoriaPrenda()==CategoriaPrenda.ACCESORIO;
	}

}
