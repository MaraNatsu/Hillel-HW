package ninthHW.entities.flowers;

public class Rose extends Flower {
    private String colour;

    public Rose(String colour, double price, int flowerFreshness, double stemLength) {
        super("Rose", price, flowerFreshness, stemLength);
        this.colour = colour;
        this.icon = " \uD83C\uDF39 ";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
