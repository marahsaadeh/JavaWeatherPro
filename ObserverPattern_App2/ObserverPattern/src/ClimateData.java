public class ClimateData {
    private int idDay; 
    private double temperatureInCelsius;
    private double humidity;
    private double windSpeed;
    private String precipitationType;

    public ClimateData(int idDay, double temperatureInCelsius, double humidity, double windSpeed, String precipitationType) {
        this.idDay = idDay;
        this.temperatureInCelsius = temperatureInCelsius;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.precipitationType = precipitationType;
    }

    

//getter functions
public int getIdDay() {
        return idDay;
    }
   
    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public String getPrecipitationType() {
        return precipitationType;
    }
}
