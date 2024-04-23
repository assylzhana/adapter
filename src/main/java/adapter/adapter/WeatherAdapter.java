package adapter.adapter;

import adapter.adapter.models.WeatherData;
import adapter.adapter.services.OpenWeatherMapService;
import adapter.adapter.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherAdapter implements WeatherService {
    @Autowired
    private OpenWeatherMapService openWeatherMapService;

    @Override
    public WeatherData getWeather(String city) {
        return openWeatherMapService.getWeather(city);
    }
}