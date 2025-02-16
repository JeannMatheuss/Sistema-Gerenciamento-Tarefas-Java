package br.com.service;

import java.util.List;

import br.com.models.Tarefa;

public class GerenciadorDeTarefas {
    private List<Tarefa> listaDeTarefas;

    public GerenciadorDeTarefas(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

}
