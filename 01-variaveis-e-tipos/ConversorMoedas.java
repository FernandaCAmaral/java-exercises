import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        double taxaCambio = 5.25;

        Scanner leitura = new Scanner(System.in);
        System.out.println("-- BEM VINDO AO CONVERSOR DE MOEDAS! --");
        System.out.println("Digite o valor em Reais(R$) para ver o equivalente em Dólar(US$): ");

        double valorReais = leitura.nextDouble();
        double valorDolar = valorReais / taxaCambio;

        System.out.printf("O valor em dólares é: US$ %.2f", valorDolar);
    }
}
