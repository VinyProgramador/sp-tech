package school.sptech.exercicio.pokemon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonTest {

    @Test
    @DisplayName("Deve inicializar os doces do pokémon com 0")
    public void construtorDeveInicializarOsDocesDoPokemonCom0() {
        
        Pokemon pokemon = new Pokemon("Charmander", "Fogo", 10);
        
        assertEquals(0, pokemon.getDoces());
    }
    
    @Test
    @DisplayName("Deve inicializar o atributo 'ferido' com false")
    public void construtorDeveInicializarOAtributoFeridoComFalse() {
        
        Pokemon pokemon = new Pokemon("Charmander", "Fogo", 10);
        
        assertFalse(pokemon.getFerido());
    }
}
