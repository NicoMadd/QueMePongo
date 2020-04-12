package domain;

import exceptions.PrendaInvalidaException;

public class Prenda {
	CategoriaPrenda categoriaPrenda;
	Color color;
	Material material;
	public Prenda(CategoriaPrenda unaCategoriaDePrenda) {
		this.material = Material.NINGUNO;
		this.color = Color.NINGUNO;
		this.categoriaPrenda = unaCategoriaDePrenda;
	}
	
	public void validar() throws PrendaInvalidaException{
		if(color.equals(Color.NINGUNO)) {
			throw new PrendaInvalidaException("Prenda Invalida! La prenda no tiene un color asignado");
		}
		if(material == Material.NINGUNO) {
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
		return categoriaPrenda;
	}

	public boolean esParteSuperior() {
		return categoriaPrenda==CategoriaPrenda.PARTE_SUPERIOR;
	}
	
	public boolean esParteInferior() {
		return categoriaPrenda==CategoriaPrenda.PARTE_INFERIOR;
	}
	
	public boolean esCalzado() {
		return categoriaPrenda==CategoriaPrenda.CALZADO;
	}
	
	public boolean esAccesorio() {
		return categoriaPrenda==CategoriaPrenda.ACCESORIO;
	}

	public void setColor(Color unColor) {
		this.color = unColor;	
	}
	

}
