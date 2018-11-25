package com.example.PSP.controller;

import com.example.PSP.model.Car;
import com.example.PSP.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAll() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public Car getById(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car) {
        return carService.addNewCar(car);
    }

    @PutMapping("/cars/{id}")
    public Car editCar (@PathVariable Integer id, @RequestBody Car car){
        return carService.editCar(id, car);
    }

    @DeleteMapping("/cars/{id}")
    public Car deleteCar(@PathVariable Integer id) {
        return carService.deleteCar(id);
    }

    @GetMapping("/import/cars")
    public List<Car> importCars() {
        return carService.importAllCars();
    }

}