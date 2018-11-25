package com.example.PSP.factory;

import com.example.PSP.bean.FamilyCarCommand;
import com.example.PSP.model.FamilyCar;

public class FamilyCarFactory {
    public static FamilyCar create(FamilyCarCommand command) {
        FamilyCar car = new FamilyCar();
        car.setType(command.getType());
        car.setBrand(command.getBrand());
        car.setMaxSpeed(command.getMaxSpeed());
        car.setModel(command.getModel());
        car.setId(command.getId());
        return car;
    }
}
