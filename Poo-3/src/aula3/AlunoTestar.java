package aula3;

public class AlunoTestar {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno();

        aluno1.setIdade(20);
        aluno1.setNome("davi");

        System.out.println(aluno1.getIdade());
        System.out.println(aluno1.getNome());
    }
}
