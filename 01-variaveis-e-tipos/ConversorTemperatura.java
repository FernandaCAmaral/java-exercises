import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("-- BEM VINDO AO CONVERSOR DE TEMPERATURA! --");
        System.out.println("Digite a temperatura em Celsius (ºC): ");

        double valorCelsius = leitura.nextDouble();

        double fahrenheit = (valorCelsius * 9 / 5) + 32;

        System.out.printf("\nA temperatura em Fahrenheit é: %.2f ºF", fahrenheit);
        System.out.println("\nObrigada por utilizar o conversor!");
    }
}
