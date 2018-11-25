package com.example.PSP.service;

import com.example.PSP.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> filterByType(List<Car> cars, String type) {
        return cars.stream()
                .filter(car -> car.getType().equals(type))
                .collect(Collectors.toList());
    }
}
