package car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private List<Car> cars = new ArrayList<>();

    public static RentCompany create() {

        return new RentCompany();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public String generateReport() {
        String report = "";

        this.cars.stream().map(car -> car.toString() + report);
        return report;
    }
}
