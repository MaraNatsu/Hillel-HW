package fourthHW;

import java.time.LocalDate;

public class Car {
    int id;
    String mark;
    String model;
    int manufactureYear;
    String colour;
    int price;
    String registrationNumber;

    public Car(int id,
               String mark,
               String model,
               int manufactureYear,
               String colour,
               int price,
               String registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.colour = colour;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    LocalDate date = LocalDate.now();
    int currentYear = date.getYear();

    public int operationYears() {
        return currentYear - manufactureYear;
    }
}