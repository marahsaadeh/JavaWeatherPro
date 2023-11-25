public class HumidityDecorator extends WeatherDecorator {
    private ClimateData objClimateData;

    public HumidityDecorator(WeatherData weatherData, ClimateData objClimateData) {
        super(weatherData);
        this.objClimateData = objClimateData;
    }

    @Override
    public String getWeatherInfo() {
        return super.getWeatherInfo() + "\nHumidity Decoration: " + objClimateData.getHumidity();
    }
}
