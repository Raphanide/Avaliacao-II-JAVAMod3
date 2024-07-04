package orm.test;


import orm.actions.AtualizarAluno;
import orm.actions.BuscarAluno;
import orm.model.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class TesteAtualizaluno {

        private static Scanner sc = new Scanner(System.in);
        private static Aluno a1 = new Aluno();
        private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        public static void main(String[] args) {

            System.out.print("Insira o ID do aluno a atualizar: ");
            long id = sc.nextLong();

            a1 = BuscarAluno.busca(id);

            if (a1 == null) {
                System.out.println("Aluno não encontrado");
            } else {
                sc.nextLine();
                String opcao = exibirMenu();

                switch (opcao) {
                    case "1":
                        atualizaNome();

                        AtualizaAluno();
                        break;

                    case "2":
                        atualizaEmail();

                        AtualizaAluno();
                        break;

                    case "3":
                        atualizaCpf();

                        AtualizaAluno();
                        break;


                    case "4":
                        atualizaEndereco();

                        AtualizaAluno();
                        break;

                    case "5":
                        atualizaNaturalidade();

                        AtualizaAluno();
                        break;

                    case "6":
                        atualizaDataDeNascimento();

                        AtualizaAluno();
                        break;

                    case "7":
                        atualizaNome();
                        atualizaEmail();
                        atualizaCpf();
                        atualizaEndereco();
                        atualizaNaturalidade();
                        atualizaDataDeNascimento();

                        AtualizaAluno();
                        break;

                    default:
                        System.out.println("\nOpção inválida, tente novamente.");
                        break;
                }
            }
        }


        private static String exibirMenu() {
            System.out.println("""
					ESCOLHA UMA OPÇÃO:
					1 - Atualizar nome
					2 - Atualizar e-mail
					3 - Atualizar cpf
					4 - Atualizar endereço
					5 - Atualizar naturalidade
					6 - Atualizar data de nascimento
					7 - Atualizar tudo

					""");
            return sc.nextLine();
        }

        private static void clearBuffer(Scanner scanner){
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }}

        private static void quebraDeLinha() {
            System.out.println("\n");
        }

        private static void atualizaNome() {
            System.out.print("Nome: ");
            a1.setNome(sc.nextLine());
        }

        private static void atualizaEmail() {
            System.out.print("Email: ");
            a1.setEmail(sc.nextLine());
        }

        private static void atualizaCpf() {
            while (true) {
                System.out.print("Cpf (11 digitos, apenas números): ");
                String cpf = sc.nextLine();
                if (cpf.length() == 11) {
                    a1.setCpf(cpf);
                    break;
                }
            }
        }

        private static void atualizaEndereco() {
            System.out.print("Endereco: ");
            a1.setEndereco(sc.nextLine());
        }

        private static void atualizaNaturalidade() {
            System.out.print("Naturalidade: ");
            a1.setNaturalidade(sc.nextLine());
        }

        private static void atualizaDataDeNascimento() {
            while (true) {
                try {
                    System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                    a1.setDataNascimento(LocalDate.parse(sc.nextLine(), fmt1));
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("inserção incorreta, o correto seria dd/MM/yyyy,"
                            + "insira novamente a data nesse formato padrão");
                }
            }
        }

        private static void AtualizaAluno() {
            AtualizarAluno.atualiza(a1);
            System.out.println("Aluno atualizado com sucesso!");
        }



    }

