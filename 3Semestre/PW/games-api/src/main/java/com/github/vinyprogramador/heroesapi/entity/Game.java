package com.github.vinyprogramador.heroesapi.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
//Nome: Vinicius A Nunes
//RA: 01221125
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min = 3, max = 250)
    private String name;
    @ManyToOne
    private Company company;
    @PastOrPresent
    private LocalDate yearLaunch;
    private Boolean isRatedR;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public LocalDate getYearLaunch() {
        return yearLaunch;
    }

    public void setYearLaunch(LocalDate yearLaunch) {
        this.yearLaunch = yearLaunch;
    }

    public Boolean getRatedR() {
        return isRatedR;
    }

    public void setRatedR(Boolean ratedR) {
        isRatedR = ratedR;
    }
}
