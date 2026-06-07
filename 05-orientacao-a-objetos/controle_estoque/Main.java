package controle_estoque;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- SISTEMA DE ESTOQUE - BOUTIQUE ---");

        Roupa produto1 = new Roupa("Calça Jeans 38", 20);
        Roupa produto2 = new Roupa("Moletom Oversized Preto", 2);

        produto1.realizarVenda(4);
        produto1.realizarVenda(6);
        produto2.realizarVenda(2);
        produto2.realizarVenda(1);


    }
}
