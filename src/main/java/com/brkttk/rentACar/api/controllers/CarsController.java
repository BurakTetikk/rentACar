package com.brkttk.rentACar.api.controllers;

import com.brkttk.rentACar.business.abstracts.CarService;
import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;
import com.brkttk.rentACar.entities.concretes.Car;
import com.brkttk.rentACar.entities.dtos.CarWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Car>> getAll(){
        return this.carService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Car car) {
        return this.carService.add(car);
    }

    @GetMapping("/getById")
    public DataResult<Car> getById(@RequestParam int id) {
        return this.carService.getById(id);
    }

    @GetMapping("/getByMarka")
    public DataResult<List<Car>> getByMarka(@RequestParam String marka) {
        return this.carService.getByMarka(marka);
    }

    @GetMapping("/getByMarkaAndModel")
    public DataResult<List<Car>> getByMarkaAndModel(@RequestParam String marka, @RequestParam String model) {
        return this.carService.getByMarkaAndModel(marka, model);
    }

    @GetMapping("/getByMarkaContains")
    public DataResult<List<Car>> getByMarkaContains(@RequestParam String marka) {
        return this.carService.getByMarkaContains(marka);
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<Car>> getAll(int pageNo, int pageSize) {
        return this.carService.getAll(pageNo, pageSize);
    }

    @GetMapping("/getAllSorted")
    public DataResult<List<Car>> getAllSorted() {
        return this.carService.getAllSorted();
    }

    @GetMapping("/getByProductWithCategoryDetails")
    public DataResult<List<CarWithCategoryDto>> getByProductWithCategoryDetails() {
        return this.carService.getByProductWithCategoryDetails();
    }



//    List<Car> getByMarkaOrModel(String marka, String model);
//
//    List<Car> getByCategoryIdIn(List<Integer> categories);
//
//    List<Car> getByCategoryStartsWith(String marka);
//
//    List<Car> getByCategoryEndsWith(String marka);
}
