public class car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car has started.");
    }

    private void startElectricity() {
        System.out.println("Electricity started.");
    }

    private void startCommand() {
        System.out.println("Command accepted.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started.");
    }
}
