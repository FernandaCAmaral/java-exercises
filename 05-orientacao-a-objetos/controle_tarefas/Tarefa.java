package controle_tarefas;

public class Tarefa {
    String descricao;
    boolean concluida;

    public void exibirDados() {
        // '?' Se estiver concluída exibe o 'Concluída', se não ':' exibe o 'Pendente'
        String statusIcone = this.concluida ? "Concluída" : "Pendente";
        System.out.println("- " + this.descricao + " [" + statusIcone + "]");
    }
}
