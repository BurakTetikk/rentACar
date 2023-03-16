package com.brkttk.rentACar.api.controllers;

import com.brkttk.rentACar.business.abstracts.CarService;
import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;
import com.brkttk.rentACar.entities.concretes.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getall")
    public DataResult<List<Car>> getAll(){
        return this.carService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Car car) {
        return this.carService.add(car);
    }
}
