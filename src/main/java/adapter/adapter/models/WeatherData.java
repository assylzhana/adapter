package adapter.adapter.models;

public interface WeatherData {
    String getCity();

    void setCity(String city);

    String getDescription();

    void setDescription(String description);

    double getTemperature();

    void setTemperature(double temperature);

    double getHumidity();

    void setHumidity(double humidity);
}