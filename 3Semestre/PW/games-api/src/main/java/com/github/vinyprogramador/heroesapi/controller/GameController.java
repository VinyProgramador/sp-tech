package com.github.vinyprogramador.heroesapi.controller;

import com.github.vinyprogramador.heroesapi.entity.Game;
import com.github.vinyprogramador.heroesapi.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
//Nome: Vinicius A Nunes
//RA: 01221125
@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    GameRepository gameRepository;

    //find all games
    @GetMapping
    ResponseEntity<List<Game>> showAllGames() {
        List<Game> games = gameRepository.findAll();
        if (games.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(games);
    }

    //add a new game
    @PostMapping
    public ResponseEntity<Game> addGame(@RequestBody Game game) {
        gameRepository.save(game);
        return ResponseEntity.status(200).body(game);
    }

    //update game
    @PutMapping
    public ResponseEntity<Game> updateGame(@RequestParam Integer id, @RequestBody Game game){
        if(gameRepository.existsById(id)){
            game.setId(id);
            Game newGameUpdate = gameRepository.save(game);
            return ResponseEntity.status(201).body(newGameUpdate);
        }
        return ResponseEntity.status(404).build();
    }

    //Update game rated r
    @PatchMapping
    public ResponseEntity<Game> updateGameRatedR(@RequestParam Integer id, @RequestBody Game isRatedR){
        if (gameRepository.existsById(id)){
            Game newGameUpdate = gameRepository.save(isRatedR);
            return ResponseEntity.status(201).body(newGameUpdate);
        }
        return ResponseEntity.status(404).build();
    }

    //delete game by id
    @DeleteMapping
    public ResponseEntity<Game> deleteGameById(@RequestParam Integer id){
        if (gameRepository.existsById(id)){
            gameRepository.deleteById(id);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    //search by id
    @GetMapping("/id")
    public ResponseEntity<Optional<Game>> searchById(@RequestParam Integer id){
        Optional<Game> gameOptional = gameRepository.findById(id);
        if (gameOptional.isPresent()){
            return ResponseEntity.status(200).body(gameOptional);
        }
        return ResponseEntity.status(404).build();
    }

    //Find by name
    @GetMapping("/name")
    public ResponseEntity<Optional<Game>> findByName(@RequestParam Integer id){
        Optional<Game> gameOptional = gameRepository.findById(id);
        if (gameOptional.isPresent()){
            return ResponseEntity.status(200).body(gameOptional);
        }
        return ResponseEntity.status(404).build();
    }

    //Find only games is not rated r
    @GetMapping("notRatedR/quantity")
    public ResponseEntity<Integer> quantityNotRatedR(){
        int quantity = this.gameRepository.countByisRatedRFalse();
        if (quantity<0){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(quantity);
    }

    //find quantity games by company
    @GetMapping("/idCompany")
    public ResponseEntity<Integer>quantityGamesByCompany(@RequestParam Integer id){
        int quantity = gameRepository.countByCompanyId(id);
        if (quantity<0){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(quantity);
    }
}
