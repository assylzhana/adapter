package adapter.adapter.services;

import adapter.adapter.models.WeatherData;
import org.springframework.stereotype.Service;

@Service
public class OpenWeatherMapService implements WeatherService {
    @Override
    public WeatherData getWeather(String city) {
        WeatherData weatherData = new WeatherDataImpl();
        weatherData.setCity(city);
        return weatherData;
    }
}