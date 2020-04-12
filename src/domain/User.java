package domain;

import exceptions.*;

public class User {
	static int idGlobal=0;
	int id;
	String nombre;
	Atuendo atuendo;
	QueMePongo queMePongo;
	
	public User(String unNombre) {
		this.id = idGlobal++;
		this.nombre = unNombre;
		this.queMePongo = new QueMePongo();
		this.atuendo = new Atuendo();
	}
	
	public Atuendo queTraigoPuesto() throws AtuendoInvalidoException {
		return getAtuendo(); 
	}
		
	public void indicarQueTraigoPuesto() throws AtuendoInvalidoException {
		ingresarAtuendo();
	}

	private Atuendo getAtuendo() throws AtuendoInvalidoException {
		try{
			atuendo.validar();
		}catch (AtuendoInvalidoException e) {
			e.getMessage();
			System.out.println("Debe agregar un atuendo antes para poder obtenerlo");
		}
		return atuendo;
	}
	
	private void validarAtuendo(Atuendo atuendo) throws AtuendoInvalidoException{
		atuendo.validar();
	}
	
	public void ingresarAtuendo() throws AtuendoInvalidoException{
		Atuendo unAtuendo = new Atuendo();
		validarAtuendo(unAtuendo);
		this.atuendo=unAtuendo;
	}
}
