package com.github.vinyprogramador.comicsapi.repository;

import com.github.vinyprogramador.comicsapi.entity.Comic;
import com.github.vinyprogramador.comicsapi.entity.dto.ComicDescriptionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//Nome: Vinicius A Nunes
//RA: 01221125
public interface ComicRepository extends JpaRepository<Comic, Integer> {
    @Modifying
    @Query("DELETE FROM Comic c WHERE c.id = :id")
    void deletById(Integer id);

    @Query("SELECT COUNT(c) FROM Comic c WHERE c.isGraphicNovel")
    int countGraphicNovel();

    @Query("SELECT new com.github.vinyprogramador.comicsapi.entity.dto.ComicDescriptionDto(c.name, c.description) FROM Comic c")
    List<ComicDescriptionDto> listDescriptions();

}
