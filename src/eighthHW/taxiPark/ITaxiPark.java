package eighthHW.taxiPark;

import eighthHW.vehicles.Vehicle;
import eighthHW.vehicles.interfaces.*;

public interface ITaxiPark {
    public double calculateGeneralPrice(IVehicle[] vehicles);
    public IVehicle[] sortByFuelConsumption(IVehicle[] vehicles);
    public IVehicle[] searchBySpeed(IVehicle[] vehicles, double minSpeed, double maxSpeed);
}