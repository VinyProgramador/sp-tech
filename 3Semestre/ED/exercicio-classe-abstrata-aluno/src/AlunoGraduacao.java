public class AlunoGraduacao extends Aluno{
    //Atributos

    private Double nota01;
    private Double nota02;

    //Construtor
    public AlunoGraduacao(Integer ra, String nome, Double nota01, Double nota02) {
        super(ra, nome);
        this.nota01 = nota01;
        this.nota02 = nota02;
    }

    //Métodos
    @Override
    public double calcMedia() {
        return (this.nota01 * 0.4)+(this.nota02 * 0.6);
    }

    //Acessadores
    public Double getNota01() {
        return nota01;
    }

    public void setNota01(Double nota01) {
        this.nota01 = nota01;
    }

    public Double getNota02() {
        return nota02;
    }

    public void setNota02(Double nota02) {
        this.nota02 = nota02;
    }

    //ToString
    @Override
    public String toString() {
        return "Aluno de Graduacao" +
                " nota01 =" + nota01 +
                ", nota02 =" + nota02 +
                " " + super.toString();
    }
}
