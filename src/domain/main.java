package domain;

import exceptions.GuardarropaContienePrendaException;
import exceptions.PrendaInvalidaException;

public class main {

	public static void main(String[] args) throws GuardarropaContienePrendaException, PrendaInvalidaException {
		
		System.out.println("Iniciando");
		User madd = new User("Madd");
		User carlos = new User("Carlos");
		User juan = new User("Juan");
		
		Prenda remera = new Prenda(CategoriaPrenda.PARTE_SUPERIOR);
		madd.queMePongo.indicarColorPrenda(remera, Color.ROJO);
		madd.queMePongo.indicarMaterialPrenda(remera, Material.ALGODON);
		madd.queMePongo.agregarPrenda(remera);
		Prenda pantalonAzul = new Prenda(CategoriaPrenda.PARTE_INFERIOR);
		madd.queMePongo.indicarColorPrenda(pantalonAzul, Color.AZUL);
		madd.queMePongo.indicarMaterialPrenda(pantalonAzul, Material.JEAN);
		madd.queMePongo.agregarPrenda(pantalonAzul);
		Prenda zapasConverse = new Prenda(CategoriaPrenda.CALZADO);
		madd.queMePongo.indicarColorPrenda(zapasConverse, Color.AMARILLO);
		madd.queMePongo.indicarMaterialPrenda(zapasConverse, Material.CUERO);
		madd.queMePongo.agregarPrenda(zapasConverse);

	}

}
