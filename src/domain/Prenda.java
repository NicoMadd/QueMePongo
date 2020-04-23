package domain;


import exceptions.PrendaInvalidaException;

public class Prenda {
	TipoPrenda tipoPrenda;
	Color colorPrimario;
	Color colorSecunadario;
	Material material;
	public Prenda(TipoPrenda unTipoPrenda, Material material, Color colorPrimario, Color colorSecundario) {
		validar(unTipoPrenda, material, colorPrimario);
		this.tipoPrenda = unTipoPrenda;
		this.material = material;
		this.colorPrimario = colorPrimario;
	}
	
	public void validar(TipoPrenda unTipoPrenda, Material material, Color color){
		if(unTipoPrenda.equals(null)) {
			throw new PrendaInvalidaException("La prenda no tiene un tipo asignado");
		}
		if(color.equals(null)) {
			throw new PrendaInvalidaException("La prenda no tiene un color asignado");
		}
		if(material.equals(null)) {
			throw new PrendaInvalidaException("Prenda Invalida! La prenda no tiene un material asignado");
		}
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
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
