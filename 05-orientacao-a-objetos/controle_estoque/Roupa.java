package controle_estoque;

public class Roupa {
    String nome;
    int quantidadeEstoque;

    public Roupa(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void realizarVenda(int quantidadeVendida) {
        System.out.println("\nVendendo " + quantidadeVendida + " unidade(s) de " + this.nome + "...");

        if (quantidadeVendida <= quantidadeEstoque) {
            this.quantidadeEstoque -= quantidadeVendida;
            System.out.printf("✅ Venda realizada com sucesso! %d unidades restantes no estoque.%n", quantidadeEstoque);
        } else {
            System.out.println("❌ Erro: Estoque insuficiente! Não é possível realizar a venda.");
            System.out.printf("Apenas %d unidades restantes.%n", this.quantidadeEstoque);
        }
    }
}
