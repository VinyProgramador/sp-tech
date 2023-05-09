package com.github.vinyprogramador.comicsapi.entity.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
//Nome: Vinicius A Nunes
//RA: 01221125
public class ComicDescriptionDto {
    @NotBlank
    @Size(min = 3, max = 250)
    private String name;

    @Size(min = 3, max = 250)
    @NotBlank
    private String description;

    public ComicDescriptionDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
