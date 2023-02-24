package com.brkttk.rentACar.business.concretes;

import com.brkttk.rentACar.business.abstracts.CarService;
import com.brkttk.rentACar.dataAccess.abstracts.CarDao;
import com.brkttk.rentACar.entities.concretes.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {

    private CarDao carDao;

    @Autowired
    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAll() {
        return carDao.findAll();
    }
}
