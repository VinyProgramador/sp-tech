package com.github.vinyprogramador.carsapi.repository;

//Nome: Vinicius A Nunes
//RA:01221125

import com.github.vinyprogramador.carsapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CarRepository extends JpaRepository<Car, Integer> {

}
