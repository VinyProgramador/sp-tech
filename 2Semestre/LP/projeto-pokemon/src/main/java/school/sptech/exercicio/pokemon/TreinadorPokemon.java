package school.sptech.exercicio.pokemon;

public class TreinadorPokemon {
    private String Nome;
    private Integer nivel;
    private Pokemon pokemon;
    private TreinadorPokemon treinadorPokemon;
    private String nomeInicial;
    private Integer forcaInicial;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.Nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public TreinadorPokemon getTreinadorPokemon() {
        return treinadorPokemon;
    }

    public void setTreinadorPokemon(TreinadorPokemon treinadorPokemon) {
        this.treinadorPokemon = treinadorPokemon;
    }

    public String getNomeInicial() {
        return nomeInicial;
    }

    public void setNomeInicial(String nomeInicial) {
        this.nomeInicial = nomeInicial;
    }

    public Integer getForcaInicial() {
        return forcaInicial;
    }

    public void setForcaInicial(Integer forcaInicial) {
        this.forcaInicial = forcaInicial;
    }
    
    public void treinarPokemon(Pokemon p1){
        p1.setForca(p1.getForca() + ((10 * 100) / p1.getForca()));
        p1.setDoces(p1.getDoces() + 10);
        setNivel(this.nivel += 2);
    }
    
    public void evoluirPokemon(Pokemon p1, String novaEvolucao) {
        if (p1.getDoces() >= 50) {
            p1.setDoces(p1.getDoces() - 50);
            p1.setNome(novaEvolucao);
            this.nivel += 10;
        }
    }
    
    public  void batalhar(Pokemon p1, Pokemon p2){
        if (p1.getFerido()) {
        }
        else if(p1.getForca() > p2.getForca()){
            Integer porcentagem = 15*p1.getForca()/100;
            p1.setForca(p1.getForca()+porcentagem);
            p1.setDoces(p1.getDoces()+15);
            this.nivel += 2;
        }
        else if(p1.getForca()<= p2.getForca()){
           p1.setFerido(true);
        }
    }
    
    public void curarPokemon(Pokemon p1){
    
        if (p1.getFerido()) {
            p1.setFerido(false);
        }
    }
}
