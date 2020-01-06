package fourthHW;

public class CarProcessor {

    void printRequiredMark(Car[] cars, String mark) {
        System.out.println("Required car mark: ");
        System.out.println();
        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printRequiredCars(car);
            }
        }
    }

    void printRequiredModelByOperationYears(Car[] cars, String model, int operationYears) {
        System.out.println("Required car model with operation time more than 4 years: ");
        System.out.println();
        for (Car car : cars) {
            if (car.model.equals(model) && car.operationYears() > operationYears) {
                printRequiredCars(car);
            }
        }
    }

    void printRequiredYearByPrice(Car[] cars, int manufactureYear, int price) {
        System.out.println("Cars which were manufactured in 2014 year with price more than $65,000: ");
        System.out.println();
        for (Car car : cars) {
            if (car.manufactureYear == manufactureYear && car.price > price) {
                printRequiredCars(car);
            }
        }
    }

    private void printRequiredCars(Car car) {
        System.out.println(car.id + ". " + car.mark + " " + car.model + '\n' +
                "Colour: " + car.colour + '\n' +
                "Manufacture year: " + car.manufactureYear + '\n' +
                "Price: " + car.price + '\n' +
                "Registration number: " + car.registrationNumber + '\n');
    }
}

