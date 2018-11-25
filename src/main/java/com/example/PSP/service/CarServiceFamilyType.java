package com.example.PSP.service;

import com.example.PSP.model.Car;
import com.example.PSP.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarServiceFamilyType extends CarService{

    @Override
    public Car addNewCar(Car car) {
        car.setType("Family");
        return super.addNewCar(car);
    }
}
