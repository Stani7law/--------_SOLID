package OCP;

public class Bus extends Vehicle implements ICalculateAllowedSpeedBus{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        
    }
    @Override
    public double calculateAllowedSpeedBus(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }
        return 0.0;

    }

}
