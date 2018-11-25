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

//
//    public List<Car> getAllCars() {
//        return carRepository.findAll();
//    }
//
//    public Optional<Car> getCar(int id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Car> createCar(Car car) {
//        List<Car> cars = carRepository.findAll();
//        int id = cars.size();
//        car.setId(id);
//        carRepository.save(car);
//    }
//
//    @Override
//    public Optional<Car> updateCar(int id, Car editCar) {
//        return Optional.empty();
//    }
//
//    public Optional<Car> getCarById(int id) {
//        return carRepository.findById(id);
//    }
//
//    public Car addNewCar(Car car) {
//        List<Car> cars = carRepository.findAll();
//        int id = cars.size();
//        car.setId(id);
//        carRepository.save(car);
//
//        return car;
//    }
//
//    public Car editCar(int id, Car editCar) {
//        Car car = getCarById(id);
//        if (car != null) {
//            car.setType(editCar.getType());
//            car.setModel(editCar.getModel());
//            car.setMaxSpeed(editCar.getMaxSpeed());
//            car.setBrand(editCar.getBrand());
//            carRepository.save(car);
//
//            return car;
//        }
//        return null;
//    }
//
//    public Car deleteCar(int id) {
//        Car car = getCarById(id);
//        if (car != null) {
//            carRepository.delete(car);
//            return car;
//        }
//        return null;
//    }

//    public List<Car> importAllCars() {
//        Car newCar = new Car();
//        List<Car> cars = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            newCar.setModel("X" + i);
//            if ((i % 2 == 0)) {
//                newCar.setBrand("BMW");
//            } else {
//                newCar.setBrand("Ferrari");
//            }
//            newCar.setMaxSpeed(100 + (i * 10.5));
//            if ((i % 2 == 0)) {
//                newCar.setType("Sport");
//            } else {
//                newCar.setType("Family");
//            }
//            cars.add(addNewCar(newCar));
//            newCar = new Car();
//        }
//
//        return cars;
//    }
}