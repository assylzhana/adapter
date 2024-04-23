package adapter.adapter.services;

import adapter.adapter.models.WeatherData;

public interface WeatherService {
    WeatherData getWeather(String city);
}