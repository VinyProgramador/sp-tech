package ex02;

public class TestePokemon {

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        TreinadorPokemon treinador = new TreinadorPokemon();

        treinador.setNivel(0);
        treinador.setNome("Viny");

        pokemon1.setNome("Pichu");
        pokemon1.setDoces(0);
        pokemon1.setForca(10.0);
        pokemon1.setTipo("Eletrico");

        treinador.treinarPokemon(pokemon1, treinador);
        treinador.treinarPokemon(pokemon1, treinador);
        treinador.treinarPokemon(pokemon1, treinador);
        treinador.treinarPokemon(pokemon1, treinador);
        treinador.treinarPokemon(pokemon1, treinador);
        System.out.println(pokemon1.toString());
        treinador.evoluirPokemon(pokemon1, "Pikachu");
        System.out.println(pokemon1.toString());

        pokemon2.setNome("Bulbasaur");
        pokemon2.setDoces(0);
        pokemon2.setForca(6.0);
        pokemon2.setTipo("Terra");

        System.out.println("");
        treinador.treinarPokemon(pokemon2, treinador);
        treinador.treinarPokemon(pokemon2, treinador);
        System.out.println(pokemon2.toString());
        treinador.evoluirPokemon(pokemon2, "Ivysaur");

        System.out.println("");
        System.out.println(treinador.toString());

    }
}
