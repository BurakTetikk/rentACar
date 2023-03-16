package com.brkttk.rentACar.business.concretes;

import com.brkttk.rentACar.business.abstracts.CarService;
import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;
import com.brkttk.rentACar.core.utilities.results.SuccessDataResult;
import com.brkttk.rentACar.core.utilities.results.SuccessResult;
import com.brkttk.rentACar.dataAccess.abstracts.CarDao;
import com.brkttk.rentACar.entities.concretes.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarManager implements CarService {

    private CarDao carDao;

    @Autowired
    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public DataResult<List<Car>> getAll() {
        return new SuccessDataResult<List<Car>>(this.carDao.findAll(), "Data listelendi");
    }

    @Override
    public Result add(Car car) {
        this.carDao.save(car);
        return new SuccessResult(car.getMarka() + " eklendi");
    }
}
