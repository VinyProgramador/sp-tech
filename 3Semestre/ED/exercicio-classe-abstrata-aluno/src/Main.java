//Nome: Vinicius A Nunes
//RA: 01221125
public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("SpTech");

        AlunoFundamental alunoFundamental1 = new AlunoFundamental(123,"Mario",7.5,9.5,9.0,7.5);
        AlunoGraduacao alunoGraduacao1 = new AlunoGraduacao(321,"Paulinho",2.0,2.0);
        AlunoGraduacao alunoGraduacao2 = new AlunoGraduacao(321,"Zezinho",10.0,8.0);
        AlunoPos alunoPos1 = new AlunoPos(999,"Viny",10.0,10.0,10.0);

        escola.adicionaAluno(alunoFundamental1);
        escola.adicionaAluno(alunoGraduacao1);
        escola.adicionaAluno(alunoGraduacao2);
        escola.adicionaAluno(alunoPos1);

        System.out.println("Todos os Alunos");
        escola.exibeTodos();
        System.out.println();
        System.out.println("Alunos Gradução");
        escola.exibeAlunoGraduacao();
        System.out.println();
        System.out.println("Aprovados:");
        escola.exibeAprovados();
        System.out.println();
        System.out.println("Buscando aluno..");
        escola.buscaAluno(123);


    }
}