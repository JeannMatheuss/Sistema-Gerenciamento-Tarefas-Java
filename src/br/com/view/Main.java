package br.com.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import br.com.service.GerenciadorDeTarefas;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("\n📌 MENU - GERENCIADOR DE TAREFAS");
            System.out.println("1️⃣ Adicionar Tarefa");
            System.out.println("2️⃣ Listar Tarefas");
            System.out.println("3️⃣ Marcar Tarefa como Concluída");
            System.out.println("4️⃣ Remover Tarefa");
            System.out.println("0️⃣ Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Data de vencimento (dd/MM/yyyy): ");
                    String dataString = scanner.nextLine();
                    LocalDate dataVencimento = LocalDate.parse(dataString, formatter);
                    gerenciador.adicionarTarefa(titulo, descricao, dataVencimento);
                    break;
                
                case 2:
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o ID da tarefa a ser concluída: ");
                    int idConcluir = scanner.nextInt();
                    gerenciador.concluirTarefa(idConcluir);
                    break;

                case 4:
                    System.out.print("Digite o ID da tarefa a ser removida: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerTarefa(idRemover);
                    break;

                case 0:
                    System.out.println("🚀 Sistema encerrado. Até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Opção inválida! Tente novamente.");
            }
        }
    }
}
