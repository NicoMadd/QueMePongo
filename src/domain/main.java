package domain;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Iniciando");
		User juan = new User("Juan");
		
		
	
		Prenda remera = Remera.instanciarPrenda();

		remera.indicarMaterial(Cuero);
		prenda.indicarColor(Rojo);
		unTipoPrenda.instanciarPrenda();
		
		
		
		
		
/*		
		Material tela = Material.TELA;
		System.out.println(tela.tipoTrama);
		tela.indicarTrama(Trama.CUADROS);
		System.out.println(tela.tipoTrama);
		
		Material cuero = Material.CUERO;
		System.out.println(cuero.tipoTrama);
		cuero.indicarTrama(Trama.CUADROS);
		System.out.println(cuero.tipoTrama);
		
	*/	
		
		
		
		
		
/*
		Prenda remeraAzul = new Prenda(TipoPrenda.REMERA);
		juan.queMePongo.indicarColorPrenda(remeraAzul, Color.AZUL);
		juan.queMePongo.indicarMaterialPrenda(remeraAzul, Material.ALGODON);
		juan.queMePongo.agregarPrenda(remeraAzul);
		
		Prenda pantalon = new Prenda(TipoPrenda.PANTALON, Material.ALGODON, Color(23,34,55));
		juan.queMePongo.indicarColorPrenda(pantalon, Color.AZUL);
		juan.queMePongo.indicarMaterialPrenda(pantalon, Material.ALGODON);
		juan.queMePongo.agregarPrenda(pantalon);
		System.out.println(juan.queMePongo.aQueCategoriaPertenece(pantalon));
	*/	
		
	}

}
