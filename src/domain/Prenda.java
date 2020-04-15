package domain;

import java.util.Collection;
import java.util.HashSet;

import exceptions.PrendaInvalidaException;

public class Prenda {
	TipoPrenda tipoPrenda;
	Color color;
	Material material;
	Collection<FactorClima> preferenciaClimatica;
	public Prenda(TipoPrenda unTipoPrenda) {
		this.tipoPrenda = unTipoPrenda;
		this.material = Material.NINGUNO;
		this.color = Color.NINGUNO;
		this.preferenciaClimatica = new HashSet<FactorClima>();
		this.preferenciaClimatica.add(unTipoPrenda.getClimaOptimo());
	}
	
	public void validar() throws PrendaInvalidaException{
		if(color.equals(Color.NINGUNO)) {
			throw new PrendaInvalidaException("Prenda Invalida! La prenda no tiene un color asignado");
		}
		if(material == Material.NINGUNO) {
			throw new PrendaInvalidaException("Prenda Invalida! La prenda no tiene un material asignado");
		}
		if(preferenciaClimatica.isEmpty()) {
			throw new PrendaInvalidaException("Prenda Invalida! La prende no tiene preferencia climatica");
		}
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public CategoriaPrenda getCategoriaPrenda() {
		return tipoPrenda.getCategoriaPrenda();
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

	public void setColor(Color unColor) {
		this.color = unColor;	
	}

}
