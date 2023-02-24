package com.brkttk.rentACar.business.abstracts;

import com.brkttk.rentACar.entities.concretes.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();
}
