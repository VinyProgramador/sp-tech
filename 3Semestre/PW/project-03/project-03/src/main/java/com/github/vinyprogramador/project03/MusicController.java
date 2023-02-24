package com.github.vinyprogramador.project03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/songs")
public class MusicController {

    private List<Music> songs;

    public  MusicController(){
        this.songs = new ArrayList<>();
        this.songs.add(new Music("Pais e filhos",1993,true));
        this.songs.add(new Music("Diario de um detento",1983,true));
    }


    //Show all
    @GetMapping
    public List<Music> showAll(){
        return songs;
    }


    //search for index
    @GetMapping("/{index}")
    public Music searchIndex(@PathVariable Integer index){
        if (index> songs.size() || index<0){
            return null;
        }
        return songs.get(index);
    }

    //update
    @PutMapping("/{index}")
    public String update(@PathVariable int index,@RequestBody Music song){
        if (index > songs.size() || index < 0){
            return "Song not exists";
        }
        this.songs.set(index, song);
        return "Music updated successfully";
    }


    //register
    @PostMapping
    public Music register(@RequestBody Music newSong){
        songs.add(newSong);
        return newSong;
    }

    //delete
    @DeleteMapping("/{index}")
    public String removeIndex(@PathVariable int index){
        if (index> songs.size() || index<0){
            return "Song not exists";
        }
        songs.remove(index);
        return "successfully removed";
    }
}
