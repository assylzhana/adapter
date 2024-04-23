package adapter.adapter.controller;

import adapter.adapter.WeatherAdapter;
import adapter.adapter.models.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherAdapter weatherAdapter;
    @GetMapping("/{city}")
    public WeatherData getWeather(@PathVariable String city) {
        return weatherAdapter.getWeather(city);
    }
}