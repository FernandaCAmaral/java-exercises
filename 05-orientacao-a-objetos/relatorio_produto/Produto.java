package relatorio_produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("ATENÇÃO: O preço não pode ser negativo! Mantendo valor anterior...");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("ATENÇÃO: A quantidade não pode ser negativa!");
        }
    }

    public void exibirRelatorio() {
        System.out.println("----------------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Estoque: " + this.quantidade + " unidades");
    }
}
