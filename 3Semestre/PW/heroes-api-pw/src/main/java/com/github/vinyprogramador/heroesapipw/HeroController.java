package com.github.vinyprogramador.heroesapipw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Nome: Vinicius A Nunes
//RA: 01221125
@RestController
@RequestMapping("/heroes")
public class HeroController {
    private List<Hero> listOfHeroes = new ArrayList<>();

    ///heroes
    @GetMapping
    public List<Hero> showAllHeroes(){
        return listOfHeroes;
    }

    ///{indice}
    @GetMapping("/{index}")
    public Hero getHero(@PathVariable int index) {
        if (index >= listOfHeroes.size() || index < 0) {
            return null;
        }
        return listOfHeroes.get(index);
    }
    //
    @GetMapping("/cadastrar/{name}/{ability}/{age}/{force}/{isAlive}")
    public Hero registerHero(
            @PathVariable String name,@PathVariable String ability, @PathVariable int age, @PathVariable double force, @PathVariable boolean isAlive) {
        Hero hero = new Hero(name, ability, age, force, isAlive);
        listOfHeroes.add(hero);
        return hero;
    }

    //atualizar/{index}/{name}/{ability}/{age}/{force}/{isAlive}
    @GetMapping("/atualizar/{index}/{name}/{ability}/{age}/{force}/{isAlive}")
    public Hero updateHero(@PathVariable int index, @PathVariable String name, @PathVariable String ability, @PathVariable int age, @PathVariable double force, @PathVariable boolean isAlive) {
        if (index >= 0 && index < listOfHeroes.size()) {
            Hero hero = new Hero(name, ability, age, force, isAlive);
            listOfHeroes.set(index, hero);
            return hero;
        }
        return null;
    }

    //remover/{index}
    @GetMapping("/remover/{index}")
    public String removeHeroByIndex(@PathVariable Integer index){
        if (index >= 0 && index < listOfHeroes.size()) {
            listOfHeroes.remove(index);
            return "hero died..";
        }
        return "hero not found!";
    }


    //consulta/{nome}
    @GetMapping("consulta/{name}")
    public List searchByArgument(@PathVariable String name){
        List<Hero> foundHeroes = new ArrayList<>();
        for (int i = 0; i < listOfHeroes.size(); i++) {
            if (listOfHeroes.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                foundHeroes .add(listOfHeroes.get(i));
                return foundHeroes;
            }
        }

        return null;
    }

}
