package design_patterns.behavioral.observer.stock_update;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable<Product>{

    List<Observer> observers = new ArrayList<>();

    Product iPhone;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public void setData(Product data) {
    }

    @Override
    public Product getData() {
        return null;
    }
}
