package ninthHW.entities.flowers;

public class Peony extends Flower {
    private String colour;

    public Peony(String colour, double price, int flowerFreshness, double stemLength) {
        super("Peony", price, flowerFreshness, stemLength);
        this.colour = colour;
        this.icon = " ❀ ";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
