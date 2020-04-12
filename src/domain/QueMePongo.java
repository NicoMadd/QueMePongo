package domain;
import java.util.LinkedList;

import exceptions.*;


public class QueMePongo {
	Guardarropa guardarropa;
	LinkedList<Color> colores;
	public QueMePongo() {
		this.guardarropa = new Guardarropa();
		this.colores = new LinkedList<>();
	}
	private void validarPrenda(Prenda unaPrenda) throws PrendaInvalidaException,GuardarropaContienePrendaException{
		if(guardarropa.contiene(unaPrenda)) {
			throw new GuardarropaContienePrendaException();
		}
		unaPrenda.validar();
	}
	
	public void agregarPrenda(Prenda unaPrenda) throws GuardarropaContienePrendaException, PrendaInvalidaException{
		validarPrenda(unaPrenda);
		guardarropa.agregar(unaPrenda);
	}

		
	public CategoriaPrenda aQueCategoriaPertenece(Prenda prenda){
		return prenda.getCategoriaPrenda();
	}
	
	public void indicarMaterialPrenda(Prenda prenda, Material material) {
		prenda.setMaterial(material);
	}
	
	public Color getColorPrincipal() {
		return colores.getFirst();
	}
	
	public void indicarColorPrenda(Prenda prenda, Color color) {
		prenda.setColor(color);
	}
	
	private void ponerPrimero(LinkedList<Color> lista, Color color) {
		if(lista.contains(color)) {
			lista.remove(color);
		}
		lista.addFirst(color);
	}
	
	private void ponerUltimo(LinkedList<Color> lista, Color color) {
		if(lista.contains(color)) {
			lista.remove(color);
		}
		lista.addLast(color);
	}
	
	public void agregarColorPrincipal(Color color){
		ponerPrimero(colores, color);
	}
	
	public void agregarColorSecundario(Color color) {
		ponerUltimo(colores, color);
	}
	
	public void indicarColorPrincipalPrenda(Color color) {
		agregarColorPrincipal(color);
	}
	
	public void indicarColorSecundarioPrenda(Color color) {
		agregarColorSecundario(color);
	}
	
	
	public void generarConjuntos(){

	}

}
