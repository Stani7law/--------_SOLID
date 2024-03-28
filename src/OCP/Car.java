package OCP;

public class Car extends Vehicle implements ICalculateALLlowedSpeedCar{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        
    }

    public double calculateAllowedSpeedCar(Vehicle vehicle) {

        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;

        }

        return 0.0;
    }


    
}
