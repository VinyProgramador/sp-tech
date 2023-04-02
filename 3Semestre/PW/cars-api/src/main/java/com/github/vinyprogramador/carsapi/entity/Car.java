package com.github.vinyprogramador.carsapi.entity;

//Nome: Vinicius A Nunes
//RA: 01221125

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity // essa anotation é para mapear uma classe que virá a se tornar uma tabela
public class Car {

    // as duas abaixo é para criar uma PK no bd e fazer com que ela tenha auto incremento.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min = 2, max = 12)
    private String name;
    @NotBlank
    @Size(min = 1, max = 10)
    private String manufacturer;
    @PastOrPresent
    private LocalDate fabricationDate;
    @Min(1950)
    @Max(2022)
    @Positive
    private Integer model;
    @DecimalMax("7.0")
    @DecimalMin("0.2")
    private double motorPotential;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public double getMotorPotential() {
        return motorPotential;
    }

    public void setMotorPotential(double motorPotential) {
        this.motorPotential = motorPotential;
    }
}
