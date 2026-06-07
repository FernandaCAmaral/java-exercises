package carrinho_compras;

public class ItemCarrinho {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemCarrinho(String nome, double preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

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
            System.out.println("ERRO: Preço não pode ser negativo. Definido como 0.0");
            this.preco = 0;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("ERRO: Quantidade deve ser ao menos 1. Definido como 1");
            this.quantidade = 1;
        }
    }

    public double calcularSubtotal() {
        return this.preco * quantidade;
    }
}
