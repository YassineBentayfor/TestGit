package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface Publisher {
    public List<Observer> observers = new ArrayList<>();
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();


}
