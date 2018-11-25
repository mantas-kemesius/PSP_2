package com.example.PSP.facade;

import com.example.PSP.model.Car;
import com.example.PSP.repository.CarRepository;
import com.example.PSP.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarSportFacade implements CarFacade {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarService carService;

    @Override
    public List<Car> getAllCars() {
        return carService.filterByType(carRepository.findAll(),"Sport");
    }

    @Override
    public Optional<Car> getCar(int id) {
        return carRepository.findById(id);
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }
}
