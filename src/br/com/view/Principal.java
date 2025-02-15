package br.com.view;
import br.com.models.Status;
import br.com.models.Tarefa;

public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setID(1);
        tarefa.setTitulo("Estudar something");
        tarefa.setDescricao("Estudar SpringBoot e Cloud");
        tarefa.setDataVencimento(2005-04-12);
        tarefa.setStatus(Status.CONCLUIDA);
    }
}
