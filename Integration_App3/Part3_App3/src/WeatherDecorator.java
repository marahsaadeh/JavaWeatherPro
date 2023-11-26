
public abstract class WeatherDecorator implements WeatherData {

    private WeatherData weatherData;

    public WeatherDecorator(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public String getWeatherInfo() {
    
          return weatherData.getWeatherInfo();

    }

}

