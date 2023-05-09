package com.github.vinyprogramador.comicsapi.entity.dto;

import com.github.vinyprogramador.comicsapi.entity.Writer;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
//Nome: Vinicius A Nunes
//RA: 01221125
public class ComicUpdateDto {
    @NotBlank
    @Size(min = 3, max = 250)
    private String name;
    @NotBlank
    private String distributor;

    public ComicUpdateDto(String name, String distributor) {
        this.name = name;
        this.distributor = distributor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}
