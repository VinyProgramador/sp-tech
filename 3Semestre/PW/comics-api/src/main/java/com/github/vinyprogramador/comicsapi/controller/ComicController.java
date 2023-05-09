package com.github.vinyprogramador.comicsapi.controller;

import com.github.vinyprogramador.comicsapi.entity.Comic;
import com.github.vinyprogramador.comicsapi.entity.dto.ComicDescriptionDto;
import com.github.vinyprogramador.comicsapi.entity.dto.ComicUpdateDto;
import com.github.vinyprogramador.comicsapi.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Nome: Vinicius A Nunes
//RA: 01221125
@RestController
@RequestMapping("/comics")
public class ComicController {
    @Autowired
    ComicRepository comicRepository;

    //All comics
    @GetMapping
    public ResponseEntity<List<Comic>> allComics() {
        List<Comic> comics = comicRepository.findAll();
        if (comics.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(comics);
    }

    //add a new comic
    @PostMapping
    public ResponseEntity<Comic> addComic(@RequestBody Comic comic) {
        comicRepository.save(comic);
        return ResponseEntity.status(201).body(comic);
    }

    //Update comic
    public ResponseEntity<ComicUpdateDto> updateComic(@RequestParam Comic comic, @RequestParam Integer id) {
        if (comicRepository.existsById(id)) {
            comic.setId(id);
            comicRepository.save(comic);
            return ResponseEntity.status(200).body(
                    new ComicUpdateDto(comic.getName(), comic.getDistributor())
            );
        }
        return ResponseEntity.status(404).build();
    }

    //delete by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteByid(@PathVariable Integer id) {
        if (this.comicRepository.existsById(id)) {
            this.comicRepository.deletById(id);
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(404).build();
    }

    //count graphic novel
    @GetMapping("/graphicNovel")
    public ResponseEntity<Integer> quantityGraphicNovel() {
        int quantity = this.comicRepository.countGraphicNovel();
        return ResponseEntity.status(200).body(quantity);
    }
    //list all descriptions
    @GetMapping("/description")
    public ResponseEntity<List<ComicDescriptionDto>> returnDescription(){
        List<ComicDescriptionDto> comics = this.comicRepository.listDescriptions();
        if (comics.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(comics);
    }
}
