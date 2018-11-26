package com.example.PSP.factory;

import com.example.PSP.model.Car;
import com.example.PSP.model.FamilyCar;
import com.example.PSP.model.SportCar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier(value="carFactory")
@Component
public class CarFactory {
    public Car create(Car carInstance)
    {
        Car car;
        if(carInstance.getType().equals("Sport")) {
            car = new SportCar();
            car.setType(carInstance.getType());
            car.setBrand(carInstance.getBrand());
            car.setMaxSpeed(carInstance.getMaxSpeed());
            car.setModel(carInstance.getModel());
            car.setId(carInstance.getId());
        }else{
            car = new FamilyCar();
            car.setType(carInstance.getType());
            car.setBrand(carInstance.getBrand());
            car.setMaxSpeed(carInstance.getMaxSpeed());
            car.setModel(carInstance.getModel());
            car.setId(carInstance.getId());
        }

        return car;
    }
}
