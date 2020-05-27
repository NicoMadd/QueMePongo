package domain;

import java.util.List;

public class GeneradorSugerencias {
	Clima clima = new Clima();
	
	public List<Atuendo> generarSugerenciasDesde(List<Prenda> prendasAptas);

	
	public List<Atuendo> generarSugerenciasPorTemperaturaActual(List<Prenda> prendasAptas){
		
		return generarSugerenciasDesde(prendasAptas.filter(prenda -> prenda.esAptaATemperatura( clima.temperatura() ) ) );
	}
}