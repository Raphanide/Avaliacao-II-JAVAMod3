package orm.test;

import java.util.List;

import orm.actions.BuscaAluno2;
import orm.model.Aluno;

public class TesteAluno2 {

    public static void main(String[] args) {
        List<Aluno> alunos = BuscaAluno2.busca();


        if (alunos.isEmpty()) {
            System.out.println("Aluno  não encontrado!");
        } else {
            System.out.println("Alunos encontrados: ");
            alunos.stream().forEach(System.out::println);
        }

    }

}
