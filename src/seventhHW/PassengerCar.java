package seventhHW;

public class PassengerCar extends Vehicle {
    private int passengerCapacity;

    public PassengerCar(String name, double price, double fuelConsumption, double maxSpeed, int passengerCapacity) {
        super(name, price, fuelConsumption, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle: " + getName() + '\n' + "Price: " + getPrice() + '\n' +
                "Fuel consumption: " + getFuelConsumption() + '\n' + "Max speed: " + getMaxSpeed() + '\n' +
                "Passenger capacity: " + passengerCapacity + '\n';
    }
}
