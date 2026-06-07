package controle_tarefas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- GERENCIADOR DE TAREFAS PESSOAIS ---");

        ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Orientação a Objetos em Java";
        t1.concluida = true;
        listaTarefas.add(t1);

        Tarefa t2 = new Tarefa();
        t2.descricao = "Criar repositório dos desafios no GitHub";
        t2.concluida = true;
        listaTarefas.add(t2);

        Tarefa t3 = new Tarefa();
        t3.descricao = "Praticar automação de testes com Page Objects";
        t3.concluida = false;
        listaTarefas.add(t3);

        System.out.println("\nMINHA TO-DO LIST:");

        for (Tarefa tarefa : listaTarefas) {
            tarefa.exibirDados();
        }
    }
}
