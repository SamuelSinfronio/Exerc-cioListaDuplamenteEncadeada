package principal;

import basicas.Contato;
import lista.ListaDupla;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDupla agenda = new ListaDupla();
        int opcao;

        do {
            System.out.println("\n=== AGENDA DE CONTATOS ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Remover contato (por nome)");
            System.out.println("4 - Remover contato (por posição)");
            System.out.println("5 - Pesquisar por nome");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    agenda.adicionar(new Contato(nome, endereco, telefone));
                }
                case 2 -> agenda.listar();
                case 3 -> {
                    System.out.print("Nome a remover: ");
                    String nome = sc.nextLine();
                    agenda.remover(nome);
                }
                case 4 -> {
                    System.out.print("Posição a remover: ");
                    int pos = sc.nextInt();
                    agenda.removerPosicao(pos);
                }
                case 5 -> {
                    System.out.print("Nome a pesquisar: ");
                    String nomePesq = sc.nextLine();
                    Contato c = agenda.pesquisarPorNome(nomePesq);
                    if (c != null) System.out.println("Encontrado: " + c);
                    else System.out.println("Contato não encontrado.");
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}

