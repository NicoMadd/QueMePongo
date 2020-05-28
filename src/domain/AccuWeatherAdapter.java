package domain;

import java.util.List;
import java.util.Map;

public class AccuWeatherAdapter implements IClima{
	static AccuWeatherAPI apiClima = new AccuWeatherAPI();
	
	List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);
	
	static public AccuWeatherAPI getInstance() {
		return apiClima;
	}
	
	public Float temperatura() {
		return condicionesClimaticas.get(0).get("Temperature").get("Value"); //Devuelve temperatura en Farenheit
	}
}
