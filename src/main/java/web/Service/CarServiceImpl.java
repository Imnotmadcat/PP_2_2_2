package web.Service;

import web.Model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList() {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("BMW", 1234, 200));
        carsList.add(new Car("Audi", 2345, 190));
        carsList.add(new Car("Mercedes", 4567, 300));
        carsList.add(new Car("Tesla", 6789, 250));
        carsList.add(new Car("Lada", 1235, 90));

        return carsList;
    }

    public List<Car> getCarAmount(Integer count) {
       return getCarList().stream().limit(count).collect(Collectors.toList());
    }
}
