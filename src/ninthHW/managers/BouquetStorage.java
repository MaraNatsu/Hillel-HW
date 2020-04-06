package ninthHW.managers;

import ninthHW.entities.Bouquet;

public class BouquetStorage {
    private Bouquet[] bouquets = new Bouquet[0];

    private void copyBouquet(Bouquet[] to, Bouquet[] from) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    public BouquetStorage() {
    }

    public void addBouquet(Bouquet bouquet) {
        Bouquet[] bouquets = this.bouquets;
        Bouquet[] newArray = new Bouquet[bouquets.length + 1];
        this.copyBouquet(newArray, bouquets);
        newArray[newArray.length - 1] = bouquet;
        setBouquets(newArray);
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

    public void setBouquets(Bouquet[] bouquets) {
        this.bouquets = bouquets;
    }


    @Override
    public String toString() {
        String bouquetsToString = "";

        for (int i = 0; i < bouquets.length; i++) {
            bouquetsToString += bouquets[i].toString();
        }
        return bouquetsToString;
    }
}
