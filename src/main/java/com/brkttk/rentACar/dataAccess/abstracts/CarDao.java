package com.brkttk.rentACar.dataAccess.abstracts;

import com.brkttk.rentACar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car, Integer> {

}
