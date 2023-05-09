package com.github.vinyprogramador.comicsapi.entity.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
//Nome: Vinicius A Nunes
//RA: 01221125
public class WriterDto {
    @NotBlank
    @Size(min = 3, max = 250)
    private String name;

    public WriterDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
