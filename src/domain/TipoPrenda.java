package domain;

import java.util.List;

import exceptions.TipoPrendaInvalidaException;

public abstract class TipoPrenda{
	CategoriaPrenda categoriaPrenda;
	List<Color> coloresValidos;//COLORES VALIDOS
	List<Material> materialesValidos;//MATERIALES VALIDOS
	
	public Color asignarColor(Color color) {
		if(coloresValidos.contains(color))
			return color;
		else
			throw new TipoPrendaInvalidaException("Color no valido!");
	}
	
	public Material asignarMaterial(Material material) {
		if(materialesValidos.contains(material))
			return material;
		else
			throw new TipoPrendaInvalidaException("Material no valido!");
	}
	
	public CategoriaPrenda getCategoria() {
		return categoriaPrenda;
	}

	
}
