package ninthHW.entities;

public class Accessory {
    String name;
    double price;

    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return " \uD83C\uDF80 " + name + '\n' +
                "    Price: " + price + " UAH" + '\n';
    }
}
