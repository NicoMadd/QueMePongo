package domain;

public class SasterSanJuan extends Sastre {
	
	
	public SasterSanJuan() {
		fabricarUniforme();
		
		/*
		agregarPrendaCalzado(new zapatillas_blancas());
		agregarPrendaInferior(new pantalon_acetato_gris());
		agregarPrendaSuperior(new chomba_verde_pique());*/
	}

	
	
	/*
	 * No se necesita validacion son constructores unicos
	 */
	@Override
	Prenda fabricarParteSuperior() {
        borrador = new Borrador(REMERA);
        borrador.asignarColorPrimario(new Color(colorVerde));
        borrador.asignarMaterial(PIQUE);
        return borrador.crearPrenda();
	}

	@Override
	Prenda fabricarParteInferior() {
        borrador = new Borrador(PANTALON);
        borrador.asignarColorPrimario(Color(new Color(GRIS));
        borrador.asignarMaterial(ACETATO);
        return borrador.crearPrenda(); 
	}

	@Override
	Prenda fabricarCalzado() {
        borrador = new Borrador(ZAPATILLAS)
        borrador.asignarColorPrimario(new Color(BLANCAS));
        borrador.asignarMaterial(??);
        return borrador.crearPrenda(); 
	}

}
