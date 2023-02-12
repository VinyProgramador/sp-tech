
//Nome: Vinicius A Nunes
//RA: 01221125
public class AlunoPos extends  Aluno{

    //Atributos
    private Double nota01;
    private Double nota02;
    private Double notaMonografia;

    //Construtor
    public AlunoPos(Integer ra, String nome, Double nota01, Double nota02, Double notaMonografia) {
        super(ra, nome);
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.notaMonografia = notaMonografia;
    }

    //Métodos
    @Override
    public double calcMedia() {
        return (this.nota01 + this.nota02 + this.notaMonografia)/3;
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

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }


    //ToString

    @Override
    public String toString() {
        return "Aluno de Pos Graduação" +
                " nota01 =" + nota01 +
                ", nota02 =" + nota02 +
                ", notaMonografia=" + notaMonografia +
                " " + super.toString();
    }
}
