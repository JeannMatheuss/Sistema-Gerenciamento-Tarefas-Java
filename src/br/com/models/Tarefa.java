package br.com.models;

import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private LocalDate dataVencimento;
    private Status status;

    // Construtor para inicializar os atributos
    public Tarefa(int id, String titulo, String descricao, LocalDate dataVencimento) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.status = Status.PENDENTE; // Padrão ao criar uma nova tarefa
    }

    // Métodos Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Método toString() para facilitar a exibição da tarefa
    @Override
    public String toString() {
        return "Tarefa { " +
                "ID=" + id +
                ", Título='" + titulo + '\'' +
                ", Descrição='" + descricao + '\'' +
                ", Data de Vencimento=" + dataVencimento +
                ", Status=" + status +
                " }";
    }
}
