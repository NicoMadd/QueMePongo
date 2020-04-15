package domain;
import java.util.LinkedList;
import exceptions.*;

/* En la clase que me pongo hay un guardarropa que contendra todas las prendas validas para hacer el sorteo de atuendos
 * Tambien tendra una lista de colores de preferencia, siendo el primero el Principal y el resto de los que haya los secundarios.
 * La prenda primero se crea fuera de la clase y se le debe asignar un color y un material ya que por default tendra NINGUNO, 
 * lo cual la hace invalida. Para poder ser usada en el sorteo debe ser agregada desde el que me pongo, el cual valida si es
 * apta para ser sorteada.
 */


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
		/*
		 * Antes de empezar la generacion debe validar que haya al menos una parte superior, una parte inferior, y un calzado.
		 * Obtiene las prendas a utilizar filtrando por las preferencias, y luego crea combinaciones de atuendos con 
		 * al menos un calzado, una parte superior, y una inferior. A la vez habran las mismas combinaciones que estas pero incluyendo
		 * un accesorio. 
		 */
		

	}

}
