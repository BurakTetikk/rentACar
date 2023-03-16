package com.brkttk.rentACar.business.abstracts;

import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;
import com.brkttk.rentACar.entities.concretes.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    DataResult<List<Car>> getAll();

    Result add(Car car);
}
