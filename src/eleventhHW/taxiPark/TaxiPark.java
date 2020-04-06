package eleventhHW.taxiPark;

import eleventhHW.vehicles.Vehicle;
import eleventhHW.vehicles.interfaces.*;

public class TaxiPark implements ITaxiPark {

    @Override
    public double calculateGeneralPrice(IVehicle[] vehicles) {
        double generalPrice = 0;
        for (int i = 0; i < vehicles.length; i++) {
            generalPrice = generalPrice + vehicles[i].getPrice();
        }
        return generalPrice;
    }

    @Override
    public IVehicle[] sortByFuelConsumption(IVehicle[] vehicles) {
        double n = vehicles.length;
        IVehicle temp;

        for (int i = 0; i < vehicles.length; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (vehicles[j - 1].getFuelConsumption() > vehicles[j].getFuelConsumption()) {
                    temp = vehicles[j - 1];
                    vehicles[j - 1] = vehicles[j];
                    vehicles[j] = temp;
                }
            }
        }
        return vehicles;
    }

    @Override
    public IVehicle[] searchBySpeed(IVehicle[] vehicles, double minSpeed, double maxSpeed) {
        IVehicle[] filteredVehicles = new Vehicle[0];
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getMaxSpeed() >= minSpeed && vehicles[i].getMaxSpeed() <= maxSpeed) {
                IVehicle[] newArray = new Vehicle[filteredVehicles.length + 1];
                this.copy(newArray, filteredVehicles);
                newArray[newArray.length - 1] = vehicles[i];
                filteredVehicles = newArray;
            }
        }
        return filteredVehicles;
    }

    private void copy(IVehicle[] to, IVehicle[] from) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }
}
