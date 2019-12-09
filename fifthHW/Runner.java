package fifthHW;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Audi", "R8", 2014, "Blue", 65400, "BE 2481 AX"),
                new Car(2, "Bugatti", "Veyron", 2006, "Matte black", 84600, "CB 7821 AX"),
                new Car(3, "BMW", "X3", 2012, "Silver", 71300, "CE 1141 AX"),
                new Car(4, "Bentley", "Continental GT", 2016, "Blue", 79400, "BX 5147 AX"),
                new Car(5, "Volkswagen", "Amarok", 2014, "Silver", 66800, "BT 6227 AX"),
                new Car(6, "Mercedes-Benz", "CLA-Class", 2015, "Matte black", 72900, "AH 8152 AX")
        };

        CarProcessor processor = new CarProcessor();

        processor.printRequiredMark(cars, "Volkswagen");
        processor.printRequiredModelByOperationYears(cars, "X3", 4);
        processor.printRequiredYearByPrice(cars, 2014, 65000);

        processor.printRequiredMark("Volkswagen");
        processor.printRequiredModelByOperationYears("X3", 4);
        processor.printRequiredYearByPrice(2014, 65000);
    }
}