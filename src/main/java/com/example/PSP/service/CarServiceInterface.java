package com.example.PSP.service;

import com.example.PSP.model.Car;

import java.util.List;

public interface CarServiceInterface {
    List<Car> getAllCars();
    Car getCarById(int id);
    Car addNewCar(Car car);
    Car editCar(int id, Car editCar);
    Car deleteCar(int id);
    List<Car> importAllCars();
}
