
public class PrecipitationDecorator extends WeatherDecorator {
    private ClimateData climateData;

    public PrecipitationDecorator(WeatherData weatherData,ClimateData objClimateData) {
        super(weatherData);
        this.climateData = objClimateData;
    }

    @Override
    public String getWeatherInfo() {
        return super.getWeatherInfo()+ "\nPrecipitation Info: " + climateData.getPrecipitationType();
    }
   
}
 

