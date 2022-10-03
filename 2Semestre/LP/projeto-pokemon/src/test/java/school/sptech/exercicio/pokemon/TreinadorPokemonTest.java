package school.sptech.exercicio.pokemon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreinadorPokemonTest {
    
    private Pokemon pokemon;
    private TreinadorPokemon treinadorPokemon;
    
    private String nomeInicial;
    private Integer forcaInicial;
    
    @BeforeEach
    public void init() {
        this.forcaInicial = 10;
        this.nomeInicial = "Charmander";
        
        this.treinadorPokemon = new TreinadorPokemon("William",0);
        this.pokemon = new Pokemon(nomeInicial, "Fogo", this.forcaInicial);
    }
    
    @Test
    @DisplayName("treinarPokemon(): Deve aumentar a quantidade de doces em 10")
    public void treinarPokemonAumentarOsDocesDoPokemonEm10() {
        
        treinadorPokemon.treinarPokemon(pokemon);
        
        assertEquals(this.pokemon.getDoces(), 10);
        
        treinadorPokemon.treinarPokemon(pokemon);
        
        assertEquals(this.pokemon.getDoces(), 20);
    }
    
    @Test
    @DisplayName("treinarPokemon(): Deve aumentar a força do pokémon em 10%")
    public void treinarPokemonDeveAumentarForcaDoPokemonEm10Porcento() {
        
        treinadorPokemon.treinarPokemon(pokemon);
        
        assertEquals(this.pokemon.getForca(), this.forcaInicial + ((10 * 100) / this.forcaInicial));
    }
    
    @Test
    @DisplayName("treinarPokemon(): Deve aumentar o nível do treinador em 2")
    public void treinarPokemonDeveAumentarONivelDoTreinadorEm2() {
        
        treinadorPokemon.treinarPokemon(pokemon);
        
        assertEquals(this.treinadorPokemon.getNivel(), 2);
        
        treinadorPokemon.treinarPokemon(pokemon);
        
        assertEquals(this.treinadorPokemon.getNivel(), 4);
    }
    
    @Test
    @DisplayName("evoluirPokemon(): Não deve fazer nada caso número de doces for menor que 50")
    public void evoluirPokemonNaoDeveFazerNadaCasoDocesMenorQue50() {
        
        this.pokemon.setDoces(30);
        this.treinadorPokemon.setNivel(10);
        
        treinadorPokemon.evoluirPokemon(pokemon, "Charmeleon");
        
        assertEquals(this.pokemon.getForca(), forcaInicial);
        assertEquals(this.pokemon.getNome(), nomeInicial);
        assertEquals(this.pokemon.getDoces(), 30);
        assertEquals(this.treinadorPokemon.getNivel(), 10);
    }
    
    @Test
    @DisplayName("evoluirPokemon(): Deve alterar o nome do pokémon para o novo nome")
    public void evoluirPokemonDeveAlterarONomeDoPokemonParaONovoNome() {
        
        this.pokemon.setDoces(50);
        
        treinadorPokemon.evoluirPokemon(pokemon, "Charmeleon");
        
        assertEquals(this.pokemon.getNome(), "Charmeleon");
    }
    
    @Test
    @DisplayName("evoluirPokemon(): Deve dobrar a força do pokémon")
    public void evoluirPokemonDeveDobrarAForcaDoPokemon() {
        
        this.pokemon.setDoces(100);
        this.pokemon.setForca(20);
        this.pokemon.setForca(pokemon.getForca()*2);
        treinadorPokemon.evoluirPokemon(pokemon, "Charmeleon");
        
        assertEquals(this.pokemon.getForca(), 40);
        
    }
    
    @Test
    @DisplayName("evoluirPokemon(): Deve diminuir o número de doces do pokémon")
    public void evoluirPokemonDeveDiminuirONumeroDeDocesEm50() {
        
        this.pokemon.setDoces(66);
        
        treinadorPokemon.evoluirPokemon(pokemon, "Charmeleon");
        
        assertEquals(16, this.pokemon.getDoces());
        
        Pokemon outro = new Pokemon("Abc", "Água", 10);
        outro.setDoces(100);
        
        treinadorPokemon.evoluirPokemon(outro, "Charizard");
        
        assertEquals(50, outro.getDoces());
    }
    
    @Test
    @DisplayName("evoluirPokemon(): Deve aumentar o nível do treinador em 10")
    public void evoluirPokemonDeveAumentarONivelDoTreinadorEm10() {
        
        this.pokemon.setDoces(100);
        
        treinadorPokemon.evoluirPokemon(pokemon, "Charmeleon");
        
        assertEquals(this.treinadorPokemon.getNivel(), 10);
        
        treinadorPokemon.evoluirPokemon(pokemon, "Charmeleon");
        
        assertEquals(this.treinadorPokemon.getNivel(), 20);
    }
    
    @Test
    @DisplayName("batalhar(): Não deve fazer nada caso o pokémon esteja ferido")
    public void batalharNaoDeveFazerNadaCasoOPokemonEstejaFerido() {
        
        this.treinadorPokemon.setNivel(20);
        this.pokemon.setForca(60);
        this.pokemon.setFerido(true);
        
        Pokemon rival = new Pokemon("Squirtle", "Água", 40);
        
        treinadorPokemon.batalhar(pokemon, rival);
        
        assertEquals(this.pokemon.getForca(), 60);
        assertEquals(this.treinadorPokemon.getNivel(), 20);
    }
    
    @Test
    @DisplayName("batalhar(): Deve deixar o pokémon ferido caso perca a batalha")
    public void batalharDeveDeixarOPokemonFeridoCasoPercaABatalha() {
        
        this.treinadorPokemon.setNivel(20);
        this.pokemon.setForca(30);
        Pokemon rival = new Pokemon("Squirtle", "Água", 40);
        
        treinadorPokemon.batalhar(pokemon, rival);
        
        assertEquals(this.pokemon.getFerido(), true);
        assertEquals(this.pokemon.getForca(), 30);
        assertEquals(this.treinadorPokemon.getNivel(), 20);
    }
    
    @Test
    @DisplayName("batalhar(): Deve aumentar a força do pokemon caso ganhe a batalha")
    public void batalharDeveAumentarAForcaDoPokemonCasoGanheABatalha() {
        
        this.pokemon.setForca(50);
        Pokemon rival = new Pokemon("Squirtle", "Água", 20);
        
        treinadorPokemon.batalhar(pokemon, rival);
        
        assertEquals(50 + 50 * 15 / 100, this.pokemon.getForca());
    }
    
    @Test
    @DisplayName("batalhar(): Deve aumentar a quantidade de doces caso ganhe a batalha")
    public void batalharDeveAumentarAQuantidadeDeDocesCasoOPokemonGanheABatalha() {
        
        this.pokemon.setForca(50);
        this.pokemon.setDoces(10);
        Pokemon rival = new Pokemon("Squirtle", "Água", 20);
        
        treinadorPokemon.batalhar(pokemon, rival);
        
        assertEquals(10 + 15, this.pokemon.getDoces());
    }
    
    @Test
    @DisplayName("batalhar(): Deve aumentar o nível do treinador caso ganhe a batalha")
    public void batalharDeveAumentarONivelDoTreinadorEm2CasoGanheABatalha() {
        
        this.pokemon.setForca(50);
        this.pokemon.setDoces(10);
        
        this.treinadorPokemon.setNivel(2);
        
        Pokemon rival = new Pokemon("Squirtle", "Água", 20);
        
        treinadorPokemon.batalhar(pokemon, rival);
        
        assertEquals(4, this.treinadorPokemon.getNivel());
    }
    
    @Test
    @DisplayName("curarPokemon(): Não deve fazer nada caso o pokémon não esteja ferido")
    public void curarPokemonNaoDeveFazerNadaCasoOPokemonNaoEstejaFerido() {
        
        this.pokemon.setFerido(false);
        
        this.treinadorPokemon.curarPokemon(pokemon);
        
        assertFalse(this.pokemon.getFerido());
    }
    
    @Test
    @DisplayName("curarPokemon(): Deve curar o pokémon caso esteja ferido")
    public void deveCurarOPokemonCasoEstejaFerido() {
        
        this.pokemon.setFerido(true);
        
        this.treinadorPokemon.curarPokemon(pokemon);
        
        assertFalse(this.pokemon.getFerido());
    }
}
