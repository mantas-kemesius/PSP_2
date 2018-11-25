package com.example.PSP.di;

import com.example.PSP.service.CarServiceFamilyType;
import com.example.PSP.service.CarServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FamilyType {

//    @Bean
    public CarServiceInterface carService() {
        return new CarServiceFamilyType();
    }
}
