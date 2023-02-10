package com.github.vinyprogramador.exerciciopokemonpw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class PokemonController {

    //Nome: Vinicius A Nunes
    //RA: 01221125
    List<String> listaPokemon = new ArrayList<>();

    @GetMapping("/pokemon")
    public String showAllPokemon() {
        return String.format("Total de pokemon cadastrados: %d", listaPokemon.size());
    }

    @GetMapping("/pokemon/cadastrar/{pokemon}")
    public String addPokemon(@PathVariable String pokemon) {
        listaPokemon.add(pokemon);
        return String.format("Foi adicionado um pokemon!");
    }

    @GetMapping("/pokemon/recuperar/{indice}")
    public String searchPokemon(@PathVariable int indice) {
        if (indice >= listaPokemon.size() || indice < 0) {
            return "Não existe este pokemon na lista..";
        } else {
            return listaPokemon.get(indice);
        }
    }

    @GetMapping("/pokemon/excluir/{indice}")
    public String removePokemon(@PathVariable int indice) {
        if (indice >= listaPokemon.size() || indice < 0) {
            return "Pokemon não foi encontrado..";
        } else {
            listaPokemon.remove(indice);
            return "Pokemon foi removido com sucesso!";
        }
    }

    @GetMapping("/pokemon/atualizar/{indice}/{novoNome}")
    public String updatePokemon(@PathVariable int indice, @PathVariable String novoNome) {
        if (indice >= listaPokemon.size() || indice < 0) {
            return "Pokemon não foi encontrado..";
        } else {
            listaPokemon.set(indice, novoNome);
            return "Pokemon foi atualizado com sucesso!";
        }
    }
}
