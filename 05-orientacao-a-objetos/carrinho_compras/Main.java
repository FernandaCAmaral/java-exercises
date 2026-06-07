package carrinho_compras;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ItemCarrinho> carrinho = new ArrayList<>();

        System.out.println("\n --- CHECKOUT: CARRINHO DE COMPRAS --- ");
        carrinho.add(new ItemCarrinho("Monitor HQ 27'", 1250.00, 1));
        carrinho.add(new ItemCarrinho("Gaming Mouse Redragon", 120.50, 2));
        carrinho.add(new ItemCarrinho("Cabo HDMI", 45.60, 3));

        System.out.println("\n ITENS NO CARRINHO:");

        double totalCarrinho = 0.0;
        for (ItemCarrinho item : carrinho) {
            double subtotalItem = item.calcularSubtotal();
            totalCarrinho += subtotalItem;

            System.out.printf("- %s | Quantidade: %d | Subtotal: R$ %.2f%n",
                    item.getNome(), item.getQuantidade(), subtotalItem);
        }

        System.out.printf("%n--> VALOR TOTAL DA COMPRA: R$ %.2f%n", totalCarrinho);

    }
}
