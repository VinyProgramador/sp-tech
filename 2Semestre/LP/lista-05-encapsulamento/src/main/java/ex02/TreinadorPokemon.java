package ex02;

public class TreinadorPokemon {

    private String nome;
    private Integer nivel = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    void treinarPokemon(Pokemon p1, TreinadorPokemon t1) {
        Double PorcentagemDaForca = p1.getForca() * 0.10;
        p1.setForca(p1.getForca() + PorcentagemDaForca);
        p1.setDoces(p1.getDoces() + 10);
        t1.setNivel(this.nivel += 2);

    }

    void evoluirPokemon(Pokemon p1, String novaEvolucao) {
        if (p1.getDoces() >= 50) {
            p1.setDoces(p1.getDoces() - 50);
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", p1.getNome(), novaEvolucao));
            p1.setNome(novaEvolucao);
            this.nivel += 10;
        }
        else{
            System.out.println("Não foi possível realizar operação");
        }
    }

    @Override
    public String toString() {
        return "Treinador:\n" + "nome:" + nome + ", nivel: " + nivel;
    }

}
