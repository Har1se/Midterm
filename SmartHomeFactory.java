interface SmartHomeFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name, int temperature);
}
