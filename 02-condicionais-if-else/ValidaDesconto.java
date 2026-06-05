import java.util.Scanner;

public class ValidaDesconto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("-- SISTEMA VERIFICADOR DE DESCONTOS --");
        System.out.println("Digite o valor da sua compra: ");

        double valorCompra = leitura.nextDouble();

        if (valorCompra > 100) {
            double desconto = valorCompra * 0.10;
            valorCompra -= desconto;
            System.out.printf("Desconto de 10%% aplicado!\nValor Final: R$ %.2f\n", valorCompra);
        } else {
            System.out.printf("Nenhum desconto aplicado.\nValor da Compra: R$ %.2f\n", valorCompra);
        }
        leitura.close();
    }
}
