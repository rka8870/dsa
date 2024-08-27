package design_patterns.behavioral.observer.weather_update;

public class MobileDisplay implements Observer{


    private Observable observable;

    public MobileDisplay(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Live Weather Updated for TV");
    }
}
