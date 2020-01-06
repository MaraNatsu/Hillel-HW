package seventhHW;

public class TaxiPark {
    public double calculateGeneralPrice(Vehicle[] vehicles) {
        double generalPrice = 0;
        for (int i = 0; i < vehicles.length; i++) {
            generalPrice = generalPrice + vehicles[i].getPrice();
        }
        return generalPrice;
    }

    public Vehicle[] sortByFuelConsumption(Vehicle[] vehicles) {
        double n = vehicles.length;
        Vehicle temp;

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

    public Vehicle[] searchBySpeed(Vehicle[] vehicles, double minSpeed, double maxSpeed) {
        Vehicle[] filteredVehicles = new Vehicle[0];
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getMaxSpeed() >= minSpeed && vehicles[i].getMaxSpeed() <= maxSpeed) {
                Vehicle[] newArray = new Vehicle[filteredVehicles.length + 1];
                this.copy(newArray, filteredVehicles);
                newArray[newArray.length - 1] = vehicles[i];
                filteredVehicles = newArray;
            }
        }
        return filteredVehicles;
    }

    private void copy(Vehicle[] to, Vehicle[] from) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }
}
