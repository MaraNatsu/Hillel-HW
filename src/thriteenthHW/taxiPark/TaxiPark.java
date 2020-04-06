package thriteenthHW.taxiPark;

import java.util.Arrays;
import java.util.Comparator;

import thriteenthHW.vehicles.Vehicle;
import thriteenthHW.vehicles.interfaces.*;

public class TaxiPark implements ITaxiPark, Comparator<IVehicle>{

    @Override
    public double calculateGeneralPrice(IVehicle[] vehicles) {
        double generalPrice = 0;
        for (int i = 0; i < vehicles.length; i++) {
            generalPrice = generalPrice + vehicles[i].getPrice();
        }
        return generalPrice;
    }


    public void sortByFuelConsumptionWithComparator(IVehicle[] vehicles) {
        Arrays.sort(vehicles, (IVehicle a, IVehicle b) -> {
            if (a.getFuelConsumption() < b.getFuelConsumption())
                return -1;
            else if (a.getFuelConsumption() == b.getFuelConsumption())
                return 0;
            else
                return 1;
        });
    }

    public void sortByFuelConsumptionWithLambda(IVehicle[] vehicles) {
        Arrays.sort(vehicles, (o1, o2) -> {
            return o1.getFuelConsumption() - o2.getFuelConsumption() > 1 ? 1 : -1;
        });
    }

    public void sortByFuelConsumptionWithReference(IVehicle[] vehicles) {
        Arrays.sort(vehicles, this::compare);
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

    @Override
    public int compare(IVehicle a, IVehicle b) {
        if (a.getFuelConsumption() < b.getFuelConsumption())
            return -1;
        else if (a.getFuelConsumption() == b.getFuelConsumption())
            return 0;
        else
            return 1;
    }
}
