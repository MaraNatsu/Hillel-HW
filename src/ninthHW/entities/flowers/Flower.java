package ninthHW.entities.flowers;

public class Flower {
    String name;
    double price;
    int flowerFreshness;
    double stemLength;
    String icon = " ✿ ";

    public Flower(String name, double price, int flowerFreshness, double stemLength) {
        this.name = name;
        this.price = price;
        this.flowerFreshness = flowerFreshness;
        this.stemLength = stemLength;
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

    public int getFlowerFreshness() {
        return flowerFreshness;
    }

    public void setFlowerFreshness(int flowerFreshness) {
        this.flowerFreshness = flowerFreshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    @Override
    public String toString() {
        return icon + name + '\n' +
                "    Price: " + price + " UAH" + '\n' +
                "    Flower freshness (days): " + flowerFreshness + '\n' +
                "    Stem length: " + stemLength + " m" + '\n';
    }
}
