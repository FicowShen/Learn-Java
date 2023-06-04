package patterns.structural.bridge;

public class FuelEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start Fuel Engine...");
    }
}
