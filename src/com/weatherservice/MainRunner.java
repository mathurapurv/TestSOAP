package com.weatherservice;

import java.util.List;

import com.cdyne.ws.weatherws.ArrayOfWeatherDescription;
import com.cdyne.ws.weatherws.Forecast;
import com.cdyne.ws.weatherws.ForecastReturn;
import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherDescription;
import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap;

/**
 * @author Apurv Mathur 
 *
 */
public class MainRunner {
	
	

	public static void main(String[] args) {
		System.out.println("-- Start --");
//		s_CityWeatherByZIP();
//		s_GetCityForecastByZIP();
		s_GetWeatherInformation();
		
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
		
		System.out.println("resp.isSuccess() : "+resp.isSuccess());
		System.out.println("resp.getResponseText()  : "+  resp.getResponseText()    );
		System.out.println("resp.getState()  : "+  resp.getState()    );
		System.out.println("resp.getCity()  : "+  resp.getCity()    );
		System.out.println(" resp.getWeatherStationCity()  : "+  resp.getWeatherStationCity()    );
		System.out.println("resp.getForecastResult().getForecast().size()   : "+   resp.getForecastResult().getForecast().size()   );
		
		for(Forecast f :resp.getForecastResult().getForecast() ){
			System.out.println("Forcast - Start : "+f.getDate());
			System.out.println("f.getTemperatures().getDaytimeHigh() : "+f.getTemperatures().getDaytimeHigh());
			System.out.println("f.getTemperatures().getMorningLow() : "+f.getTemperatures().getMorningLow());
			
			System.out.println("Forcast - End");
		}
	}
	
	private static void s_GetWeatherInformation() {
		Weather service = new Weather();
		WeatherSoap soap = service.getWeatherSoap();
		// boston
		ArrayOfWeatherDescription resp = soap.getWeatherInformation();
		List<WeatherDescription> wDescriptions = resp.getWeatherDescription();
		
		for(WeatherDescription wd : wDescriptions){
			System.out.println(wd);
		}
	}
	
	
	

}
