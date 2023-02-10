package com.github.vinyprogramador.projeto1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contadores")
public class ContadorController {
    private int contador;


    @GetMapping
    public String contar() {
        contador++;

        return String.format("Contador: %d", contador);
    }
}
