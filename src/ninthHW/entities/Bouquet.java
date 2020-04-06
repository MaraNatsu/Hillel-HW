package ninthHW.entities;

import ninthHW.entities.flowers.Flower;

public class Bouquet {
    public String name;
    public double price = 0;
    public Flower[] flowers = new Flower[0];
    public Accessory[] accessories = new Accessory[0];

    public Bouquet(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        String flowersToString = "";
        String accessoriesToString = "";

        for (int i = 0; i < flowers.length; i++) {
            flowersToString += flowers[i].toString();
        }

        for (int j = 0; j < accessories.length; j++) {
            accessoriesToString += accessories[j].toString();
        }

        return "\uD83D\uDC90 " + name + '\n' + "Bouquet price is: " + price + " UAH" + '\n' +
                flowersToString + accessoriesToString + '\n';
    }
}
