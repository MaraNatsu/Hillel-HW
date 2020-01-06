package fifthHW;

public class CarProcessor {

    Car arrayCars[];

//    public CarProcessor(Car arrayCars[]) {
//        this.arrayCars = arrayCars;
//    }

    public CarProcessor() {
        this.arrayCars = new Car[0];
    }

    void printRequiredMark(Car[] cars, String mark) {
        System.out.println("Required car mark: ");
        System.out.println();
        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printRequiredCars(car);
            }
        }
    }

    void printRequiredMark(String mark) {
        if (arrayCars.length < 1) {
            System.out.println("Required car mark does not exist");
        } else {
            System.out.println("Required car mark: ");
            System.out.println();
            for (Car car : arrayCars) {
                if (car.mark.equals(mark)) {
                    printRequiredCars(car);
                }
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

    void printRequiredModelByOperationYears(String model, int operationYears) {
        if (arrayCars.length < 1) {
            System.out.println("Required car model does not exist");
        } else {
            System.out.println("Required car model with operation time more than 4 years: ");
            System.out.println();
            for (Car car : arrayCars) {
                if (car.model.equals(model) && car.operationYears() > operationYears) {
                    printRequiredCars(car);
                }
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

    void printRequiredYearByPrice(int manufactureYear, int price) {
        if (arrayCars.length < 1) {
            System.out.println("Required car does not exist");
        } else {
            System.out.println("Cars which were manufactured in 2014 year with price more than $65,000: ");
            System.out.println();
            for (Car car : arrayCars) {
                if (car.manufactureYear == manufactureYear && car.price > price) {
                    printRequiredCars(car);
                }
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

