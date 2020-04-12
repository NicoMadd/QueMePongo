package domain;

import exceptions.GuardarropaContienePrendaException;
import exceptions.PrendaInvalidaException;

public class main {

	public static void main(String[] args) throws GuardarropaContienePrendaException, PrendaInvalidaException {
		
		System.out.println("Iniciando");
		User madd = new User("Madd");
		User carlos = new User("Carlos");
		User juan = new User("Juan");
		

		Prenda remeraAzul = new Prenda(TipoPrenda.REMERA);
		madd.queMePongo.indicarColorPrenda(remeraAzul, Color.AZUL);
		madd.queMePongo.indicarMaterialPrenda(remeraAzul, Material.ALGODON);
		madd.queMePongo.agregarPrenda(remeraAzul);
		
		Prenda pantalon = new Prenda(TipoPrenda.PANTALON);
		madd.queMePongo.indicarColorPrenda(pantalon, Color.AZUL);
		madd.queMePongo.indicarMaterialPrenda(pantalon, Material.ALGODON);
		madd.queMePongo.agregarPrenda(pantalon);
		System.out.println(madd.queMePongo.aQueCategoriaPertenece(pantalon));
		
		
	}

}
