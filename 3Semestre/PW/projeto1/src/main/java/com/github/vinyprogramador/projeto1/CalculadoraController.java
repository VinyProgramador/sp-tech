package com.github.vinyprogramador.projeto1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoras")
public class CalculadoraController {
    //Criando um end point que recebera um x numero e somar
    //URI que recebe dois parametros e devolve a soma deles
    //n1 + n2

    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable int num1, @PathVariable  int num2){
        return String.format("Resultado é: %d", num1+num2);
    }
}
