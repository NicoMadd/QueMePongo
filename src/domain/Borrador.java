package domain;

public class Borrador {
	TipoPrenda tipoPrenda;
	Color colorPrimario;
	Color colorSecundario;
	Material material;
	Float temperatura;
	
	public Borrador(TipoPrenda tipoPrenda) {
		
		validateNonNull(tipoPrenda);
		this.tipoPrenda = tipoPrenda;
	}
	
	public Prenda crearPrenda() {
		validateNonNull(colorPrimario);
		validateNonNull(material);
		validateNonNull(temperatura);
		return new Prenda(tipoPrenda, colorPrimario, colorSecundario, material, temperatura);
	}
	
	public void asignarColorPrimario(Float temperatura) {
		this.temperatura = temperatura;
	}
	
	public void asignarColorPrimario(Color color) {
		this.colorPrimario = tipoPrenda.asignarColor(color);
	}
	
	public void asignarColorSecundario(Color color) {
		this.colorSecundario = tipoPrenda.asignarColor(color);
	}
	
	public void asignarMaterial(Material material) {
		this.material = tipoPrenda.asignarMaterial(material);
	}

}
