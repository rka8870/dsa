package design_patterns.behavioral.observer.stock_update;

public interface StockObservable<T> {

    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    void setData(T data);
    T getData();

}
