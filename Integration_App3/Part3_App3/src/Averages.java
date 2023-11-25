import java.util.Map;

public class Averages {

    private static Map<Integer, ClimateData> climateDatas = WeatherDataBase.getClimateDatas();
    
    public static void calculateAverages(double Usertemperature, double Userhumidity, double UserwindSpeed) {
    
    double totalWindSpeed=0;
    double totalTemperature=0;
    double totalHumidity=0;
    int  dataSize = climateDatas.size();
    for (ClimateData climateData : climateDatas.values()) {
        totalTemperature += climateData.getTemperatureInCelsius();
        totalHumidity += climateData.getHumidity();
        totalWindSpeed += climateData.getWindSpeed();
    }

    //dataSize++;
    double averageTemperature = (totalTemperature+ Usertemperature) / (dataSize+1);
    double averageHumidity = (totalHumidity + Userhumidity )/ (dataSize+1);
    double averageWindSpeed = (totalWindSpeed + UserwindSpeed)/ (dataSize+1);


    System.out.println("Average Temperature: " + averageTemperature+" Celsius");
    System.out.println("\nAverage Humidity: " + averageHumidity + " %");
    System.out.println("\nAverage Wind Speed: " + averageWindSpeed+ " Meters per second");
}
}
