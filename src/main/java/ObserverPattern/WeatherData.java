package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher{
    Weather weather;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(null);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.weather.setHumidity(humidity);
        this.weather.setPressure(pressure);
        this.weather.setTemperature(temperature);
        measurementChanged();
    }
}
