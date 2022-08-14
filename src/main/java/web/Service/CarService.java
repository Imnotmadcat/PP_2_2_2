package web.Service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCarList();
    public List<Car> getCarAmount(Integer count);
}
