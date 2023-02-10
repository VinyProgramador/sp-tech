package com.github.vinyprogramador.projeto1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // give powers from class
@RequestMapping("/frases")
public class FrasesController {

    @GetMapping
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/viny-programmer")
    public String vinyProgrammer(){
        return "Viny Programmer Here!";
    }

    @GetMapping("/viny-gamer")
    public String vinyGamer(){
        return "Viny Gamer Here!";
    }

    @GetMapping("/viny-sleep")
    public String vinySleep(){
        return "Viny sleep in Here!";
    }

}
