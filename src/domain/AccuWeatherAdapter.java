
public class AccuWeatherAdapter implements IClima{
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	
	List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);
	
	public Float temperatura() {
		return condicionesClimaticas.get(0).get("Temperature").get("Value"); //Devuelve temperatura en Farenheit
	}
}
