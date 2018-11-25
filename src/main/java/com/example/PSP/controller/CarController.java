package com.example.PSP.controller;

import com.example.PSP.model.Car;
import com.example.PSP.service.CarServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarServiceInterface carService;

    @GetMapping("/cars")
    public List<Car> getAll() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity getById(@PathVariable int id) {
        Car car = carService.getCarById(id);
        if(car != null) {
            return new ResponseEntity<>(car, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("Car not exist!",HttpStatus.NOT_FOUND);
    }

    @PostMapping("/cars")
    public ResponseEntity createCar(@RequestBody Car car) {
        return new ResponseEntity<>(carService.addNewCar(car), HttpStatus.ACCEPTED);
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity editCar (@PathVariable Integer id, @RequestBody Car car){
        Car editCar = carService.editCar(id, car);
        if(car != null) {
            return new ResponseEntity<>(editCar, HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<>("Car not exist!", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity deleteCar(@PathVariable Integer id) {
        Car car = carService.deleteCar(id);
        if(car != null) {
            return new ResponseEntity<>("Car was successfully deleted!", HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<>("Car not exist!", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/import/cars")
    public List<Car> importCars() {
        return carService.importAllCars();
    }

}