package com.example.PSP.service;

import com.example.PSP.model.Car;

import java.util.List;

public interface CarService {
    List<Car> filterByType(List<Car> cars, String type);
}
