package com.example.PSP.di;

import com.example.PSP.service.CarServiceInterface;
import com.example.PSP.service.CarServiceSportType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportType {

    @Bean
    public CarServiceInterface carService() {
        return new CarServiceSportType();
    }
}
