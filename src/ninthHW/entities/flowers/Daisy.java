package ninthHW.entities.flowers;

public class Daisy extends Flower {
    private int flowersInBranch;

    public Daisy(int flowersInBranch, double price, int flowerFreshness, double stemLength) {
        super("Daisy", price, flowerFreshness, stemLength);
        this.flowersInBranch = flowersInBranch;
        this.icon = " ✽ ";
    }

    public int getFlowersInBranch() {
        return flowersInBranch;
    }

    public void setFlowersInBranch(int flowersInBranch) {
        this.flowersInBranch = flowersInBranch;
    }
}
