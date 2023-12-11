package ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    Float tempurature;
    Publisher weatherData = new WeatherData();

    public CurrentConditionDisplay(Publisher weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(Publisher publisher) {

    }
}
