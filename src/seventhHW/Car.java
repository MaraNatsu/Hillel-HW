package seventhHW;

public class Car extends Vehicle {
    private String colour;

    public Car(String name, double price, double fuelConsumption, double maxSpeed, String colour) {
        super(name, price, fuelConsumption, maxSpeed);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

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
