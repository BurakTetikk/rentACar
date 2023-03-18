package com.brkttk.rentACar.dataAccess.abstracts;

import com.brkttk.rentACar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarDao extends JpaRepository<Car, Integer> {

    Car getById(int id);

    List<Car> getByMarka(String marka);

    List<Car> getByMarkaAndModel(String marka, String model);

    List<Car> getByMarkaOrModel(String marka, String model);

    List<Car> getByCategoryIdIn(List<Integer> categories);

    List<Car> getByMarkaContains(String marka);

    List<Car> getByCategoryStartsWith(String marka);

    List<Car> getByCategoryEndsWith(String marka);

   /* @Query("From Car where marka = :marka and categoryId = :categoryId")
    List<Car> getByMarkaAndCategory(String marka, int categoryId);*/
}
