package design_patterns.behavioral.observer.stock_update;

import java.util.ArrayList;
import java.util.List;

public class TVStockObservable implements StockObservable<Product>{

    List<Observer> observers = new ArrayList<>();

    Product tv;

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
    public void setData(Product product) {

    }

    @Override
    public Product getData() {
        return null;
    }
}
