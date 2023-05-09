package com.github.vinyprogramador.comicsapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

//Nome: Vinicius A Nunes
//RA: 01221125
@Entity
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min = 3, max = 250)
    private String name;
    @ManyToOne
    private Writer writer;
    @NotBlank
    private String distributor;
    private boolean isGraphicNovel;
    @Size(max = 250)
    @NotBlank
    private String description;
    @PastOrPresent
    private LocalDate releaseDate;

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

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getDescription() {
        return description;
    }

    public boolean isGraphicNovel() {
        return isGraphicNovel;
    }

    public void setGraphicNovel(boolean graphicNovel) {
        isGraphicNovel = graphicNovel;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
