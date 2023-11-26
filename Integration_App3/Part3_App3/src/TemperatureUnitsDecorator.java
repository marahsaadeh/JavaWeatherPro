public abstract class TemperatureUnitsDecorator extends WeatherDecorator {
    public TemperatureUnitsDecorator(WeatherData weatherData) {
        super(weatherData);
    }

  @Override
    public abstract String getWeatherInfo();
//  { return super.getWeatherInfo()+"Temperature Units Decoration";}
  

    public abstract double convertProcess(double temperature);

}


 