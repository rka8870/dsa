package design_patterns.behavioral.observer.weather_update;

public interface Observable {

    void register(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
}
