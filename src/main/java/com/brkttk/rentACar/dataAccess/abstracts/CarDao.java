package com.brkttk.rentACar.dataAccess.abstracts;

import com.brkttk.rentACar.entities.concretes.Car;
import com.brkttk.rentACar.entities.dtos.CarWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarDao extends JpaRepository<Car, Integer> {

    Car getById(int id);

    List<Car> getByMarka(String marka);

    List<Car> getByMarkaAndModel(String marka, String model);

    List<Car> getByMarkaOrModel(String marka, String model);

    List<Car> getByCategoryIn(List<Integer> categories);

    List<Car> getByMarkaContains(String marka);

    List<Car> getByCategoryStartsWith(String marka);

    List<Car> getByCategoryEndsWith(String marka);

    @Query("Select new com.brkttk.rentACar.entities.dtos.CarWithCategoryDto(p.id, p.marka, c.categoryName) From Category c Inner Join c.cars p")
    List<CarWithCategoryDto> getByProductWithCategoryDetails();

   /* @Query("From Car where marka = :marka and categoryId = :categoryId")
    List<Car> getByMarkaAndCategory(String marka, int categoryId);*/
}
