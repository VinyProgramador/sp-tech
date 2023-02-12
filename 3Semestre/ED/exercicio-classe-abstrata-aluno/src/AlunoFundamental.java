
//Nome: Vinicius A Nunes
//RA: 01221125
public class AlunoFundamental extends Aluno {

    //Atributos
    private Double nota01;
    private Double nota02;
    private Double nota03;
    private Double nota04;

    //Construtor
    public AlunoFundamental(Integer ra, String nome, Double nota1, Double nota02, Double nota03, Double nota04) {
        super(ra, nome);
        this.nota01 = nota1;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;

    }
    //Métodos
    @Override
    public double calcMedia() {
        return (this.nota01 + this.nota02 + this.nota03 + this.nota04 / 4);
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

    public Double getNota03() {
        return nota03;
    }

    public void setNota03(Double nota03) {
        this.nota03 = nota03;
    }

    public Double getNota04() {
        return nota04;
    }

    public void setNota04(Double nota04) {
        this.nota04 = nota04;
    }

    //ToString
    @Override
    public String toString() {
        return "Aluno Ensino Fundamental" +
                " nota01 =" + nota01 +
                ", nota02 =" + nota02 +
                ", nota03 =" + nota03 +
                ", nota04 =" + nota04 +
                " " +  super.toString();
    }
}
