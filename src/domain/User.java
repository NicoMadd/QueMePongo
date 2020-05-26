package domain;

import java.util.LinkedList;

import java.util.List;

/*
 * La clase usuario tendra su propio atuendo
 * que este podra ser incluido o no en la generacion. Tambien tendra un nombre y una id para identidad.
*/


public class User {
	static int idGlobal=0;
	int id;
	String nombre;
	Uniforme atuendo;
	Guardarropa guardarropa;
	Borrador prendaBorrador;
	List<Uniforme> uniformes;
	
	public User(String unNombre) {
		this.id = idGlobal++;
		this.nombre = unNombre;
		this.guardarropa = new Guardarropa();
		this.atuendo = null;
		this.uniformes = new LinkedList<>();
	}
	
	public void crearBorrador(TipoPrenda tipoPrenda) {
		this.prendaBorrador = new Borrador(tipoPrenda);
	}
	
	public void agregarPrenda(){
		guardarropa.agregar(prendaBorrador.crearPrenda());
		prendaBorrador=null;
		
	}
	


}
