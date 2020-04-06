package ninthHW.managers;

import ninthHW.entities.Accessory;
import ninthHW.entities.Bouquet;
import ninthHW.entities.flowers.Flower;
import ninthHW.exceptions.IncorrectStemLengthException;

public class BouquetManager {

    private void copyFlower(Flower[] to, Flower[] from) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    private void copyAccessory(Accessory[] to, Accessory[] from) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    public void addFlower(Bouquet bouquet, Flower flower) {
        Flower[] flowers = bouquet.getFlowers();
        Flower[] newArray = new Flower[flowers.length + 1];
        this.copyFlower(newArray, flowers);
        newArray[newArray.length - 1] = flower;
        bouquet.setFlowers(newArray);
        bouquet.setPrice(bouquet.getPrice() + flower.getPrice());
    }

    public void addAccessory(Bouquet bouquet, Accessory accessory) {
        Accessory[] accessories = bouquet.getAccessories();
        Accessory[] newArray = new Accessory[accessories.length + 1];
        this.copyAccessory(newArray, accessories);
        newArray[newArray.length - 1] = accessory;
        bouquet.setAccessories(newArray);
        bouquet.setPrice(bouquet.getPrice() + accessory.getPrice());
    }

    public void sortFlowersInBouquetByFreshness(Bouquet bouquet) {
        Flower[] flowers = bouquet.getFlowers();
        Flower temp;

        for (int j = 0; j < flowers.length; j++) {
            for (int k = 1; k < (flowers.length - j); k++) {
                if (flowers[k - 1].getFlowerFreshness() > flowers[k].getFlowerFreshness()) {
                    temp = flowers[k - 1];
                    flowers[k - 1] = flowers[k];
                    flowers[k] = temp;

                }
            }
        }
    }

    public Flower[] searchFlowersInBouquetByStemLength(Bouquet bouquet, double min, double max) throws IncorrectStemLengthException {
        if (min < 0 || max < 0) {
            throw new IncorrectStemLengthException(min, max);
        }

        Flower[] flowers = bouquet.getFlowers();
        Flower[] filteredFlowers = new Flower[0];

        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].getStemLength() >= min && flowers[i].getStemLength() <= max) {
                Flower[] newArray = new Flower[filteredFlowers.length + 1];
                this.copyFlower(newArray, filteredFlowers);
                newArray[newArray.length - 1] = flowers[i];
                filteredFlowers = newArray;

            }
        }

        return filteredFlowers;
    }
}
