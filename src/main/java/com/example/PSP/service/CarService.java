package com.example.PSP.service;

import com.example.PSP.model.Car;
import com.example.PSP.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public abstract class CarService implements CarServiceInterface {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        return (List<Car>)carRepository.findAll();
    }

    public Car getCarById(int id){
        return getAllCars().get(id);
    }

    public Car addNewCar(Car car)
    {
        List<Car> cars = (List<Car>)carRepository.findAll();
        int id = cars.size();
        car.setId(id);
        carRepository.save(car);
        return car;
    }

    public Car editCar(int id, Car editCar)
    {
        Car car = getCarById(id);
        if(car != null) {
            car.setType(editCar.getType());
            car.setModel(editCar.getModel());
            car.setMaxSpeed(editCar.getMaxSpeed());
            car.setBrand(editCar.getBrand());
            carRepository.save(car);

            return car;
        }
        return null;
    }

    public Car deleteCar(int id)
    {
        Car car = getAllCars().get(id);
        carRepository.delete(car);
        return car;
    }

    public List<Car> importAllCars()
    {
        Car newCar = new Car();
        List<Car> cars = new ArrayList<>();
        for( int i = 0 ; i < 10; i++ )
        {
            newCar.setModel("X"+i);
            if ((i % 2 == 0)) {
                newCar.setBrand("BMW");
            } else {
                newCar.setBrand("Ferrari");
            }
            newCar.setMaxSpeed(100+(i*10.5));
            if ((i % 2 == 0)) {
                newCar.setType("Sport");
            } else {
                newCar.setType("Family");
            }
            cars.add(addNewCar(newCar));
            newCar = new Car();
        }

        return cars;
    }
}
