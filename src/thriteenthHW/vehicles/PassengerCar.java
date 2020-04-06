package thriteenthHW.vehicles;

import thriteenthHW.vehicles.interfaces.*;

public class PassengerCar extends Vehicle implements IVehicle, IPassengerCar {
    private int passengerCapacity;

    public PassengerCar(String name, double price, double fuelConsumption, double maxSpeed, int passengerCapacity) {
        super(name, price, fuelConsumption, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle: " + getName() + '\n' + "Price: " + getPrice() + '\n' + "Fuel consumption: "
                + getFuelConsumption() + '\n' + "Max speed: " + getMaxSpeed() + '\n' + "Passenger capacity: "
                + passengerCapacity + '\n';
    }

    @Override
    public String getFileView() {
        return name + ',' + price + ',' + fuelConsumption + ',' + maxSpeed + ',' + passengerCapacity + ",passengerCar";
    }
}
