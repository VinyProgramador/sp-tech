package com.github.vinyprogramador.heroesapi.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;
//Nome: Vinicius A Nunes
//RA: 01221125
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy = "company")
    List<Game> games;
    @NotBlank
    @Size(min = 3, max = 250)
    private String name;
    @PastOrPresent
    private LocalDate yearCreation;

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

    public LocalDate getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(LocalDate yearCreation) {
        this.yearCreation = yearCreation;
    }
}
