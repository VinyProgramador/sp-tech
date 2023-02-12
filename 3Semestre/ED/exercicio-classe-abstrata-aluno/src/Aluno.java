
//Nome: Vinicius A Nunes
//RA: 01221125
public abstract class Aluno {
    private Integer ra;
    private String nome;

    //Construtor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    //Métodos Abstrato
    public abstract double calcMedia();

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos
    @Override
    public String toString() {
        return String.format("Aluno: %s\n" +
                             "RA: %d",nome,ra);
    }
}


