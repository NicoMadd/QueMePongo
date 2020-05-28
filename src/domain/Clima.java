package domain;


public class Clima {
	IClima apiClima;
	
	
	Clima(){
		this.apiClima = new AccuWeatherAdapter.getInstance();
	}
	
	
	public void cambiarAdministradorClima(IClima climaAdmin) {
		//solo lo puede hacer un administrador
		apiClima = climaAdmin;
	}
	
	public Float temperatura() {
		return apiClima.temperatura();
	}
	
}



