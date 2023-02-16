//Nome: Vinicius de Almeida Nunes;
//RA: 01221125

package com.github.vinyprogramador.projeto2api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frutas")
public class FrutaController {

    public List<Fruta> listOfFruits = new ArrayList<>();

    //localhost:8080/frutas
    @GetMapping
    public List<Fruta> showAllFruits() {
        return listOfFruits;
    }

    @GetMapping("/favorita")
    public Fruta getFavorite() {
        return new Fruta("Uva", 10.0, 20, false);
    }

    @GetMapping("cadastrar/{nome}/{preco}/{quantidade}/{comSemente}")
    public List<Fruta> addFruits(@PathVariable String nome, @PathVariable Double preco, @PathVariable Integer quantidade, @PathVariable Boolean comSemente) {
        listOfFruits.add(new Fruta(nome, preco, quantidade, false));
        return listOfFruits;
    }

    @GetMapping("/recuperar/{index}")
    public Fruta recoverIndex(@PathVariable Integer index) {
        if (index >= listOfFruits.size() || index < 0){
            return null;
        }
        return listOfFruits.get(index);
    }

}

