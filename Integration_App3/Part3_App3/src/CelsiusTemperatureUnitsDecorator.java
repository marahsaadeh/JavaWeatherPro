public class CelsiusTemperatureUnitsDecorator extends TemperatureUnitsDecorator {
    private ClimateData objClimateData;
    public CelsiusTemperatureUnitsDecorator(WeatherData weatherData, ClimateData objClimateData) {
        super(weatherData);
        this.objClimateData = objClimateData;
    }

 
    @Override
    public String getWeatherInfo() {
       return "\nTemperature Units Decoration : "+ convertProcess(objClimateData.getTemperatureInCelsius())+" Celsius";
    }



    @Override
    public double convertProcess(double fahrenheit) {
        //return (fahrenheit - 32) * 0.5;
        //The temperature in the database is stored in Celsius units
        return objClimateData.getTemperatureInCelsius();
    }
}


    

