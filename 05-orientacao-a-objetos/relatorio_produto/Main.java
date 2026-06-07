package relatorio_produto;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- SISTEMA GESTÃO DE ESTOQUE ---");

        Produto produto1 = new Produto();
        produto1.setNome("Notebook Samsung");
        produto1.setPreco(3500.90);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto();
        produto2.setNome("Gaming Mouse Redragon");
        produto2.setPreco(120.50);
        produto2.setQuantidade(32);

        produto1.exibirRelatorio();
        produto2.exibirRelatorio();

    }
}
