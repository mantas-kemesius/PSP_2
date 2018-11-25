package com.example.PSP.facade;

import com.example.PSP.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarFacade {
    List<Car> getAllCars();
    Optional<Car> getCar(int id);
    Car createCar(Car car);
    Car updateCar(Car car);
    void deleteCar(int id);
}
