package design_patterns.behavioral.observer.weather_update;

import java.util.ArrayList;
import java.util.List;

public class LiveWeather implements Observable {

    private Weather weather;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        for(int i=0;i<observers.size();i++){
            if(observers.get(i)==observer){
                observers.remove(i);
                return;
            }
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}
