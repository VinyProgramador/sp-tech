
//Nome: Vinicius A Nunes
//RA: 01221125

import java.util.ArrayList;
import java.util.List;
public class Escola {

    //Atribustos
    private String nome;
    private List<Aluno> ListaAlunos;

    //Construtor
    public Escola(String nome) {
        this.nome = nome;
        this.ListaAlunos = new ArrayList<>();
    }

    //Acessadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAlunos() {
        return ListaAlunos;
    }

    public void setListaAlunos(List<Aluno> ListaAlunos) {
        this.ListaAlunos = ListaAlunos;
    }

    //Métosdos
    public void adicionaAluno(Aluno a){
        ListaAlunos.add(a);
    }

    public void exibeTodos(){
        for (Aluno a: ListaAlunos){
            System.out.println(a);
        }
    }

    public void exibeAlunoGraduacao(){
        for (Aluno a : ListaAlunos){
            if (a instanceof AlunoGraduacao){
                System.out.println(a);
            }
        }
    }


    public void exibeAprovados(){
        for (int i = 0; i < getListaAlunos().size() ; i++) {
            if (getListaAlunos().get(i).calcMedia()>=6.0){
                System.out.println(getListaAlunos().get(i).toString());
            }
        }
    }

    public void buscaAluno(Integer ra){
        for (int i = 0; i < getListaAlunos().size() ; i++) {
            if (ListaAlunos.get(i).getRa().equals(ra)) {
                System.out.println(ListaAlunos.get(i).toString());
                break;
            }
            else{
                System.out.println("Aluno não encontrado");
            }
        }
    }

}
