package com.weatherservice;

import com.cdyne.ws.weatherws.ForecastReturn;
import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap;

public class MainRunner {
	
	

	public static void main(String[] args) {
		System.out.println("-- Start --");
		s_CityWeatherByZIP();
		s_GetCityForecastByZIP();
		
		System.out.println("-- End --");

	}
	
	private static void s_CityWeatherByZIP(){
		Weather service = new Weather();
		WeatherSoap soap = service.getWeatherSoap();
		// boston
		WeatherReturn resp = soap.getCityWeatherByZIP("02108");
		if (resp.isSuccess()) {
			System.out.println(resp);
		} else {
			System.out.println("Unable to find city");
		}
	}
	
	private static void s_GetCityForecastByZIP(){
		Weather service = new Weather();
		WeatherSoap soap = service.getWeatherSoap();
		
		ForecastReturn resp = 	soap.getCityForecastByZIP("02108");
		
	}
	

}
