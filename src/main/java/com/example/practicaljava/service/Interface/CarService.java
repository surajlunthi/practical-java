package com.example.practicaljava.service.Interface;

import com.example.practicaljava.entity.Car;

import java.util.List;

public interface CarService {

    List<String> BRANDS = List.of("Toyota","Honda","Ford");
    List<String> COLORS = List.of("Red","Black","White");
    List<String> TYPES = List.of("Sedan","SUV","MPV");
    List<String> ADDITIONAL_FEATURES = List.of("GPS","Alarm","Sunroof","Media player","Leather seats");

    List<String> FUELS = List.of("Petrol","Electric","Hybrid");
    List<String> TIRE_MANUFACTURERS = List.of("GoodYear","Bridgestone","Dunlop");

    Car geenerateCar();
}
