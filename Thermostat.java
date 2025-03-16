public class Thermostat implements SmartDevice {
    private String name;
    private int temperature;

    public Thermostat(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        System.out.println(name + "thermostat set to \" + temperature + \" degrees");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " thermostat is OFF");
    }
}
