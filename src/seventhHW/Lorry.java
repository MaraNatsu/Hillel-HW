package seventhHW;

public class Lorry extends Vehicle {
    private double tonnage;

    public Lorry(String name, double price, double fuelConsumption, double maxSpeed, double tonnage) {
        super(name, price, fuelConsumption, maxSpeed);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Vehicle: " + getName() + '\n' + "Price: " + getPrice() + '\n' +
                "Fuel consumption: " + getFuelConsumption() + '\n' + "Max speed: " + getMaxSpeed() + '\n' +
                "tonnage: " + tonnage + '\n';
    }
}
