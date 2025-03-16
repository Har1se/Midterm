class ScheduledOperationDecorator extends SmartDeviceDecorator {
    private String schedule;

    public ScheduledOperationDecorator(SmartDevice device, String schedule) {
        super(device);
        this.schedule = schedule;
    }

    @Override
    public void turnOn() {
        System.out.println("Scheduled operation: " + schedule);
        super.turnOn();
    }
}