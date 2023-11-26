public class FahrenheitTemperatureUnitsDecorator extends TemperatureUnitsDecorator {
    private ClimateData objClimateData;

    public FahrenheitTemperatureUnitsDecorator(WeatherData weatherData, ClimateData objClimateData) {
        super(weatherData);
        this.objClimateData = objClimateData;
    }

    @Override
    public String getWeatherInfo() {
        double temp = objClimateData.getTemperatureInCelsius();
        double fahrenheitTemperature = convertProcess(temp);

        return "\nTemperature Units Decoration :" + fahrenheitTemperature + " Fahrenheit";
    }

    @Override
    public double convertProcess(double celsius) {
          //The temperature in the database is stored in Celsius units
        return (celsius * 1.8) + 32;
    }
}




