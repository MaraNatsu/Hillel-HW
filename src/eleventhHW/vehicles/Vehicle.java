package eleventhHW.vehicles;

import eleventhHW.vehicles.interfaces.IVehicle;

public abstract class Vehicle implements IVehicle {

    protected String name;
    protected double price;
    protected double fuelConsumption;
    protected double maxSpeed;

    public Vehicle(String name, double price, double fuelConsumption, double maxSpeed) {
        this.name = name;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract String getFileView();
}
