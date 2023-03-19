package com.brkttk.rentACar.business.abstracts;

import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;
import com.brkttk.rentACar.entities.concretes.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    DataResult<List<Car>> getAll();

    Result add(Car car);

    DataResult<Car> getById(int id);

    DataResult<List<Car>> getByMarka(String marka);

    DataResult<List<Car>> getByMarkaAndModel(String marka, String model);

    DataResult<List<Car>> getByMarkaOrModel(String marka, String model);

    DataResult<List<Car>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Car>> getByMarkaContains(String marka);

    DataResult<List<Car>> getByCategoryStartsWith(String marka);

    DataResult<List<Car>> getByCategoryEndsWith(String marka);

    DataResult<List<Car>> getAll(int pageNo, int pageSize);
    DataResult<List<Car>> getAllSorted();
}
