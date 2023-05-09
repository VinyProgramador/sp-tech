package com.github.vinyprogramador.comicsapi.controller;

import com.github.vinyprogramador.comicsapi.entity.Writer;
import com.github.vinyprogramador.comicsapi.entity.dto.WriterDto;
import com.github.vinyprogramador.comicsapi.repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;
//Nome: Vinicius A Nunes
//RA: 01221125
@RestController
@RequestMapping("/writers")
public class WriterController {
    @Autowired
    WriterRepository writerRepository;

    //all writers
    @GetMapping
    public ResponseEntity<Stream<WriterDto>> allWriters() {
        List<Writer> writerList = writerRepository.findAll();
        if (!writerList.isEmpty()) {
            Stream<WriterDto> writerDtoS = writerList.stream().map(
                    writer -> new WriterDto(writer.getName())
            );
            return ResponseEntity.status(200).body(writerDtoS);
        }
        return ResponseEntity.status(204).build();
    }

    //add a new writer
    @PostMapping
    public ResponseEntity<Writer> addWriter(@RequestBody Writer writer) {
        writerRepository.save(writer);
        return ResponseEntity.status(200).body(writer);
    }
}
