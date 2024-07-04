package orm.test;

import java.util.Scanner;

import orm.actions.BuscarAluno;
import orm.actions.RemoverAluno;
import orm.model.Aluno;

public class TesteRemover {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o ID do aluno a remover: ");
        long id = sc.nextLong();

        Aluno a1 = BuscarAluno.busca(id);

        if (a1 == null) {
            System.out.println("Aluno não encontrado...");
        } else {
            RemoverAluno.remover(a1);
            System.out.println("Aluno removido!");

        }
    }

}
