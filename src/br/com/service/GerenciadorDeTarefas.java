package br.com.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import br.com.models.Tarefa;

public class GerenciadorDeTarefas {
    private List<Tarefa> listaDeTarefas;
    private int proximoId = 1;

    // Construtor que inicializa a lista de tarefas corretamente
    public GerenciadorDeTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    // Método para adicionar uma tarefa
    public void adicionarTarefa(String titulo, String descricao, LocalDate dataVencimento) {
        Tarefa novaTarefa = new Tarefa(proximoId++, titulo, descricao, dataVencimento);
        listaDeTarefas.add(novaTarefa);
        System.out.println("✅ Tarefa adicionada com sucesso!");
    }

    // Método para listar todas as tarefas
    public List<Tarefa> listarTarefas() {
        return listaDeTarefas;
    }
}
