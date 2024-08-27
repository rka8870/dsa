package design_patterns.behavioral.observer.weather_update;

public class TVDisplay implements Observer{

    private Observable observable;

    public TVDisplay(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Live Weather Updated for TV");
    }
}
