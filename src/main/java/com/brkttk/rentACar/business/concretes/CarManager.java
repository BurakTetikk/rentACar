package com.brkttk.rentACar.business.concretes;

import com.brkttk.rentACar.business.abstracts.CarService;
import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;
import com.brkttk.rentACar.core.utilities.results.SuccessDataResult;
import com.brkttk.rentACar.core.utilities.results.SuccessResult;
import com.brkttk.rentACar.dataAccess.abstracts.CarDao;
import com.brkttk.rentACar.entities.concretes.Car;
import com.brkttk.rentACar.entities.dtos.CarWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @Override
    public DataResult<Car> getById(int id) {
        return new SuccessDataResult<Car>(this.carDao.getById(id), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getByMarka(String marka) {
        return new SuccessDataResult<List<Car>>(this.carDao.getByMarka(marka), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getByMarkaAndModel(String marka, String model) {
        return new SuccessDataResult<List<Car>>(this.carDao.getByMarkaAndModel(marka, model), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getByMarkaOrModel(String marka, String model) {
        return new SuccessDataResult<List<Car>>(this.carDao.getByMarkaOrModel(marka, model), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getByCategoryIn(List<Integer> categories) {
        return new SuccessDataResult<List<Car>>(this.carDao.getByCategoryIn(categories), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getByMarkaContains(String marka) {
        return new SuccessDataResult<List<Car>>(this.carDao.getByMarkaContains(marka), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getByCategoryStartsWith(String marka) {
        return new SuccessDataResult<List<Car>>(this.carDao.getByCategoryStartsWith(marka), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getByCategoryEndsWith(String marka) {
        return new SuccessDataResult<List<Car>>(this.carDao.getByCategoryEndsWith(marka), "Araç listelendi.");
    }

    @Override
    public DataResult<List<Car>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return new SuccessDataResult<List<Car>>(this.carDao.findAll(pageable).getContent());
    }

    @Override
    public DataResult<List<Car>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "marka");
        return new SuccessDataResult<List<Car>>(this.carDao.findAll(sort));
    }

    @Override
    public DataResult<List<CarWithCategoryDto>> getByProductWithCategoryDetails() {
        return new SuccessDataResult<List<Car>>(this.carDao.getByProductWithCategoryDetails());
    }
}
