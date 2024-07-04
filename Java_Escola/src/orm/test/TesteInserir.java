package orm.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import orm.actions.InserirAluno;
import orm.model.Aluno;

public class TesteInserir {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            Aluno aluno = new Aluno();

            System.out.print("Nome: ");
            aluno.setNome(sc.nextLine());

            while (true) {
                System.out.print("Cpf (11 digitos, apenas números): ");
                String cpf = sc.nextLine();
                if (cpf.length() == 11) {
                    aluno.setCpf(cpf);
                    break;
                }
            }

            System.out.print("Email: ");
            aluno.setEmail(sc.nextLine());

            System.out.print("Endereco: ");
            aluno.setEndereco(sc.nextLine());

            System.out.print("Naturalidade: ");
            aluno.setNaturalidade(sc.nextLine());

            while (true) {
                try {
                    System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                    aluno.setDataNascimento(LocalDate.parse(sc.nextLine(), fmt1));
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("O formato da data inserido está errado, o correto seria dd/MM/yyyy,"
                            + "insira novamente a data nesse formato");
                }
            }

            InserirAluno.inserir(aluno);

        }

    }