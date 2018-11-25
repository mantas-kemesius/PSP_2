package com.example.PSP.service;

import com.example.PSP.model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarServiceSportType extends CarService {

    @Override
    public Car addNewCar(Car car) {
        car.setType("Sport");
        return super.addNewCar(car);
    }
}
