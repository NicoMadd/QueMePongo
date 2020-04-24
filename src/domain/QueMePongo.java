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
	private void validarPrenda(Prenda unaPrenda){
		if(guardarropa.contiene(unaPrenda)) {
			throw new GuardarropaContienePrendaException();
		}
		unaPrenda.validar();
	}
	
	public void instanciarPrenda()
	


	
	public Color getColorPrincipal() {
		return colores.getFirst();
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
	

	
	public void indicarColorSecundarioPrenda(Color color) {
		agregarColorSecundario(color);
	}
	

}
