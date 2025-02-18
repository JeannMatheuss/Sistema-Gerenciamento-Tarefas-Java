package br.com.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import br.com.models.Tarefa;
import br.com.models.Status;

public class GerenciadorDeTarefas {
    private List<Tarefa> listaDeTarefas = new ArrayList<>();
    private int proximoId = 1;

    // Método para adicionar uma nova tarefa
    public void adicionarTarefa(String titulo, String descricao, LocalDate dataVencimento) {
        Tarefa novaTarefa = new Tarefa(proximoId++, titulo, descricao, dataVencimento);
        listaDeTarefas.add(novaTarefa);
        System.out.println("✅ Tarefa adicionada com sucesso!");
    }

    // Método para listar todas as tarefas
    public void listarTarefas() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("📭 Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa tarefa : listaDeTarefas) {
                System.out.println(tarefa);
            }
        }
    }

    // Método para marcar uma tarefa como concluída
    public void concluirTarefa(int id) {
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getId() == id) {
                tarefa.setStatus(Status.CONCLUIDA);
                System.out.println("✅ Tarefa marcada como concluída!");
                return;
            }
        }
        System.out.println("❌ Tarefa não encontrada.");
    }

    // Método para remover uma tarefa pelo ID
    public void removerTarefa(int id) {
        Iterator<Tarefa> iterator = listaDeTarefas.iterator();
        while (iterator.hasNext()) {
            Tarefa tarefa = iterator.next();
            if (tarefa.getId() == id) {
                iterator.remove();
                System.out.println("🗑️ Tarefa removida com sucesso!");
                return;
            }
        }
        System.out.println("❌ Tarefa não encontrada.");
    }
}
