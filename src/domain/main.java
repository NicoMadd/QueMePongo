package domain;

import exceptions.*;

public class main {

	public main() throws GuardarropaContienePrendaException, PrendaInvalidaException {
		
		System.out.println("Iniciando");
		User juan = new User("Juan");
		

		Prenda remeraAzul = new Prenda(TipoPrenda.REMERA);
		juan.queMePongo.indicarColorPrenda(remeraAzul, Color.AZUL);
		juan.queMePongo.indicarMaterialPrenda(remeraAzul, Material.ALGODON);
		juan.queMePongo.agregarPrenda(remeraAzul);
		
		Prenda pantalon = new Prenda(TipoPrenda.PANTALON, Material.ALGODON, Color(23,34,55));
		juan.queMePongo.indicarColorPrenda(pantalon, Color.AZUL);
		juan.queMePongo.indicarMaterialPrenda(pantalon, Material.ALGODON);
		juan.queMePongo.agregarPrenda(pantalon);
		System.out.println(juan.queMePongo.aQueCategoriaPertenece(pantalon));
		
		
	}

}
