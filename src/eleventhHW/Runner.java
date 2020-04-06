package eleventhHW;

import eleventhHW.taxiPark.*;
import eleventhHW.vehicles.*;
import eleventhHW.vehicles.interfaces.*;

public class Runner {
    private static CarWriter carWriter = new CarWriter();
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Lorry("Daf", 2500000, 30, 115, 20),
                new Lorry("Tatra", 3800000, 36, 125, 15),
                new Lorry("Man", 4500000, 31, 150, 27),
                new Car("Nissan", 200000, 16, 280, "red"),
                new Car("Volvo", 225000, 18, 320, "silver"),
                new Car("Renault", 300000, 20, 390, "blue"),
                new PassengerCar("Setra", 100000, 24, 150, 30),
                new PassengerCar("Neoplan", 240000, 30, 120, 35),
                new PassengerCar("Yutong", 440000, 35, 130, 46),
        };
        carWriter.write(vehicles);
        vehicles = carWriter.read();

        ITaxiPark taxiPark = new TaxiPark();

        double generalPrice = taxiPark.calculateGeneralPrice(vehicles);
        System.out.println("General price of the taxi park: " + generalPrice);
        System.out.println();

        System.out.println("___________________________________");
        System.out.println("Vehicles sorted by fuel consumption");
        System.out.println("___________________________________");
        
        IVehicle[] sortedVehicles = taxiPark.sortByFuelConsumption(vehicles);
        PrintVehicles(sortedVehicles);
        System.out.println();

        IVehicle[] filteredVehicles = taxiPark.searchBySpeed(sortedVehicles, 120, 280);
        System.out.println("________________________________________");
        System.out.println("Vehicles with max speed from 120 to 280 ");
        System.out.println("________________________________________");
        PrintVehicles(filteredVehicles);
    }

    private static void PrintVehicles(IVehicle[] vehicles) {
        System.out.println();
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }
}
