package com.example.PSP.controller;

import com.example.PSP.facade.CarFacade;
import com.example.PSP.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cars/family")
@RestController
public class CarFamilyController {
    @Qualifier("carFamilyFacade")
    @Autowired
    private CarFacade carFacade;

    @GetMapping
    public List getAll() {
        return carFacade.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable Integer id) {
        return carFacade.getCar(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carFacade.createCar(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@RequestBody Car car){

        return carFacade.updateCar(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Integer id) {
        carFacade.deleteCar(id);
    }

    @GetMapping("/import")
    public void importCars() {
        carFacade.importCars();
    }
}
