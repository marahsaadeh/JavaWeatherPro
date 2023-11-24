

public class WindSpeedDecorator extends WeatherDecorator {
    private ClimateData climateData;
    public WindSpeedDecorator(WeatherData weatherData,ClimateData objClimateData) {
        super(weatherData);
        this.climateData = objClimateData;
    }

    @Override
    public String getWeatherInfo() {
        return super.getWeatherInfo()+"\nWind Speed Decoration:"+ climateData. getWindSpeed();
    }

 

}



   


