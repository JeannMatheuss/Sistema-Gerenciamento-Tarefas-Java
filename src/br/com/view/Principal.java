package br.com.view;
import java.time.LocalDate;

import br.com.models.Status;
import br.com.models.Tarefa;

public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa(1, "Estudar Java", "Aprofundar em Spring", LocalDate.of(2024, 10, 20));
        tarefa.setStatus(Status.CONCLUIDA);

        System.out.println(tarefa);
    }
}
