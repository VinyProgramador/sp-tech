package com.github.vinyprogramador.responsestatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    List<Pet> pets = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Pet>> showAll(){
        if (pets.isEmpty()){
            return  ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(pets);
    }


    //search for index
    @GetMapping("/{index}")
    public ResponseEntity<Pet> searchIndex(@PathVariable Integer index){
        if (index> pets.size() || index<0){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(pets.get(index));
    }

    //update
    @PutMapping("/{index}")
    public ResponseEntity<Pet> update(@PathVariable int index,@RequestBody Pet pet){
        if (index > pets.size() || index < 0){
            return ResponseEntity.status(404).build();
        }
        this.pets.set(index, pet);
        return ResponseEntity.status(200).body(pet);
    }


    //register
    @PostMapping
    public ResponseEntity<Pet> register(@RequestBody Pet newPet){
        pets.add(newPet);
        return ResponseEntity.status(201).body(newPet);
    }

    //delete
    @DeleteMapping("/{index}")
    public ResponseEntity<Void> removeIndex(@PathVariable int index){
        if (index> pets.size() || index<0){
            return ResponseEntity.status(404).build();
        }
        pets.remove(index);
        return ResponseEntity.status(200).build();
    }
}
