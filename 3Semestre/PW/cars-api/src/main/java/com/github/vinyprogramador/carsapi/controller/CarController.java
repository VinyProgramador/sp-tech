package com.github.vinyprogramador.carsapi.controller;

//Nome: Vinicius A Nunes
//RA:01221125

import com.github.vinyprogramador.carsapi.entity.Car;
import com.github.vinyprogramador.carsapi.repository.CarRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping()
    public ResponseEntity<List<Car>> displayAll() {
        List<Car> cars = this.carRepository.findAll();
        if (cars.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(cars);
    }

    @PostMapping
    public ResponseEntity<Car> register(@RequestBody @Valid Car newCar){
        Car newRegisterCar = this.carRepository.save(newCar);
        return ResponseEntity.status(201).body(newRegisterCar);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> findById(@PathVariable Integer id){
        Optional<Car> carOpt = this.carRepository.findById(id);
        if (carOpt.isPresent()){
            Car car = carOpt.get();
            return ResponseEntity.status(200).body(car);
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        if (carRepository.existsById(id)){
            carRepository.deleteById(id);
            ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(404).build();
    }

}
