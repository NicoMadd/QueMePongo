package domain;

import java.util.LinkedList;
import java.util.List;

import exceptions.*;

/*
 * En la clase User se tendra referencia a una clase QueMePongo que permite hacer la generacion de conjuntos. La clase usuario tendra su propio atuendo
 * que este podra ser incluido o no en la generacion. Tambien tendra un nombre y una id para identidad.
*/


public class User {
	static int idGlobal=0;
	int id;
	String nombre;
	Uniforme atuendo;
	Guardarropa guardarropa;
	Prenda prendaBorrador;
	List<Uniforme> uniformes;
	
	public User(String unNombre) {
		this.id = idGlobal++;
		this.nombre = unNombre;
		this.guardarropa = new Guardarropa();
		this.atuendo = null;
		this.uniformes = new LinkedList<>();
	}
	
	
	public void agregarPrenda(){
		prendaBorrador.validar();
		guardarropa.agregar(prendaBorrador);
		prendaBorrador=null;
		
	}
	
	public void crearPrenda(TipoPrenda unTipoPrenda) {
		this.prendaBorrador = new Prenda(unTipoPrenda);
	}
	
	public void agregarColorPrimarioPrenda(Color color) {
		prendaBorrador.asignarColorPrimario(color);
	}
	
	public void agregarColorSecundario(Color color) {
		prendaBorrador.asignarColorSecundario(color);
	}
	
	public void asignarMaterialPrenda(Material material) {
		prendaBorrador.asignarMaterial(material);
	}

}
