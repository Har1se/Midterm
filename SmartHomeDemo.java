public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();

        SmartDevice light1 = factory.createLight("Living Room");
        SmartDevice light2 = factory.createLight("Kitchen");
        SmartDevice thermostat = factory.createThermostat("Main", 22);

        DeviceGroup homeGroup = new DeviceGroup("Home");
        homeGroup.addDevice(light1);
        homeGroup.addDevice(light2);
        homeGroup.addDevice(thermostat);

        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(homeGroup);

        System.out.println("-- Turning all devices ON --");
        controller.turnAllOn();

        System.out.println("-- Adding a scheduled decorator to Light1 --");
        SmartDevice scheduledLight = new ScheduledOperationDecorator(light1, "8:00 AM");
        controller.addDevice(scheduledLight);

        System.out.println("-- Unlocking door using adapter --");
        LegacyLockSystem lock = new LockAdapter(new OldLockSystem());
        lock.unlockDoor();
    }
}
