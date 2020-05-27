package domain;


public class Clima {
	IClima apiClima;
	
	
	Clima(){
		this.apiClima = new AccuWeatherAPI();
	}
	
	
	public cambiarAdministradoClima(IClima climaAdmin) {
		//solo lo puede hacer un administrador
		apiClima = climaAdmin;
	}
	
	public void temperatura() {
		return apiClima.temperatura();
	}
	
}



