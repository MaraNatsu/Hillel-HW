package thriteenthHW.taxiPark;

import thriteenthHW.vehicles.interfaces.*;

public interface ITaxiPark {
    public double calculateGeneralPrice(IVehicle[] vehicles);
    public IVehicle[] sortByFuelConsumption(IVehicle[] vehicles);
    public IVehicle[] searchBySpeed(IVehicle[] vehicles, double minSpeed, double maxSpeed);

    void sortByFuelConsumptionWithComparator(IVehicle[] vehicles);
    void sortByFuelConsumptionWithLambda(IVehicle[] vehicles);
    void sortByFuelConsumptionWithReference(IVehicle[] vehicles);
}