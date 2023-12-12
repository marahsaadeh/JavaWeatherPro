# JavaWeatherPro
[Blank diagram.pdf](https://github.com/marahsaadeh/JavaWeatherPro/files/13465340/Blank.diagram.pdf)
### Application 1: Decorator Pattern
1. **User Customization of Weather Information Display:**
   - The user is prompted to enter the day they want to see the weather forecast for.
   - Allows the user to customize the display by selecting the information they want to view, such as temperature, humidity, wind speed, and precipitation type.
   - The user can choose one, two, three, or all of this information.
   - Additionally, the user can specify the temperature unit measurement between Celsius and Fahrenheit.
   - The user sees the output of the customized display.

### Application 2: Observer Pattern
2. **Weather Updates:**
   - The user updates weather data, where this data is available in the "subject."
   - Weather observers are activated to receive updates.
     - Observer 1: CurrentConditionsDisplay - Displays current weather conditions.
     - Observer 2: StatisticsDisplay - Displays statistical information about the weather.

### Application 3: Integration of Systems
3. **Integration of Systems:**
   - The first system using the Decorator Pattern is integrated with the second system using the Observer Pattern.
