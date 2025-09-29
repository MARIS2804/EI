interface TemperatureSensor {
    double getTemperatureCelsius();
}

class OldFahrenheitSensor {
    public double getTemperatureFahrenheit() { return 86.0; }
}

class SensorAdapter implements TemperatureSensor {
    private OldFahrenheitSensor oldSensor;
    public SensorAdapter(OldFahrenheitSensor sensor) { this.oldSensor = sensor; }
    public double getTemperatureCelsius() {
        return (oldSensor.getTemperatureFahrenheit() - 32) * 5/9;
    }
}

public class AdapterSensorDemo {
    public static void main(String[] args) {
        OldFahrenheitSensor oldSensor = new OldFahrenheitSensor();
        TemperatureSensor adapter = new SensorAdapter(oldSensor);
        System.out.println("Temperature in Celsius: " + adapter.getTemperatureCelsius());
    }
}