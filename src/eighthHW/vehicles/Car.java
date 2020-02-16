package eighthHW.vehicles;

import eighthHW.vehicles.interfaces.*;

public class Car extends Vehicle implements IVehicle, ICar {
    private String colour;

    public Car(String name, double price, double fuelConsumption, double maxSpeed, String colour) {
        super(name, price, fuelConsumption, maxSpeed);
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle: " + getName() + '\n' + "Price: " + getPrice() + '\n' +
                "Fuel consumption: " + getFuelConsumption() + '\n' + "Max speed: " + getMaxSpeed() + '\n' +
                "Colour: " + colour + '\n';
    }
}
