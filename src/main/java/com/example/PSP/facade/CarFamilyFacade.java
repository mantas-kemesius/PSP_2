package com.example.PSP.facade;

import com.example.PSP.factory.CarFactory;
import com.example.PSP.model.Car;
import com.example.PSP.model.FamilyCar;
import com.example.PSP.repository.CarRepository;
import com.example.PSP.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarFamilyFacade implements CarFacade {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarService carService;

    @Autowired
    private CarFactory carFactory;

    @Override
    public List<Car> getAllCars() {
        return carService.filterByType(carRepository.findAll(),"Family");
    }

    @Override
    public Optional<Car> getCar(int id) {
        return carRepository.findById(id);
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(
            carFactory.create(car)
        );
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(
            carFactory.create(car)
        );
    }

    @Override
    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }

    @Override
    public void importCars() {
        Car car = new FamilyCar();
        car.setBrand("sudas");
        car.setType("Family");
        car.setMaxSpeed(312);
        car.setId(2);
        car.setModel("fasdsadf");
        carRepository.save(car);
    }
}
