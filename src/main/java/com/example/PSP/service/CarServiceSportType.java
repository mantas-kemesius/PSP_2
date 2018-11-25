package com.example.PSP.service;

import com.example.PSP.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceSportType extends CarService {

    @Override
    public List<Car> getAllCars() {
        List <Car> cars = super.getAllCars();
        List <Car> sportCars = new ArrayList<>();
        for (Car car:cars) {
            if(car.getType().equals("Sport")) sportCars.add(car);
        }

        return sportCars;
    }

    @Override
    public Car getCarById(int id){
        Car car = super.getCarById(id);
        if( car != null) {
            return car.getType().equals("Sport")? car : null;
        }
        return null;
    }
}
