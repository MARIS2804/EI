import java.util.*;

interface Observer {
    void update(int temperature);
}

class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer obs) { observers.add(obs); }
    public void removeObserver(Observer obs) { observers.remove(obs); }
    public void setTemperature(int temp) {
        for (Observer obs : observers) { obs.update(temp); }
    }
}

class Display implements Observer {
    private String name;
    public Display(String name) { this.name = name; }
    public void update(int temperature) {
        System.out.println(name + " displays: " + temperature + "°C");
    }
}

public class ObserverWeatherDemo {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        ws.addObserver(new Display("LCD"));
        ws.addObserver(new Display("Mobile"));
        ws.setTemperature(23);
        ws.setTemperature(28);
    }
}