package behavioralDesignPattern.observerDesignPattern;

public class ObserverPatternMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay weatherDisplay = new WeatherDisplay();

        // Register observer
        weatherStation.registerObserver(weatherDisplay);

        // Set new temperature
        weatherStation.setTemperature(25);

        // Output:
        // Weather Display: Current Temperature is 25°C
    }
}
