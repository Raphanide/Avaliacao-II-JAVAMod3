package orm.test;


import orm.actions.BuscaLetra;
import orm.model.Aluno;

import java.util.List;
import java.util.Scanner;


public class TesteBuscaLetra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra para buscar alunos iniciados por ela: ");
        String letra = sc.nextLine();

        List<Aluno> alunos = BuscaLetra.buscaLetra(letra);


        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado!");
        } else {
            System.out.println("Alunos encontrados com nome iniciado por " + letra.toUpperCase() + " : ");
            alunos.stream().forEach(System.out::println);
        }
    }


}
