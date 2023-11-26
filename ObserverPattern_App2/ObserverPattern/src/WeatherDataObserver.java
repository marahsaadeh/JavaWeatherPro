
public interface WeatherDataObserver {

    void update(double temperature, double humidity, double windSpeed, String precipitationType);
}
