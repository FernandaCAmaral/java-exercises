import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("-- CALCULADORA DE FATORIAL --");
        System.out.print("Digite um número para calcular seu fatorial: ");
        int numero = leitura.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        leitura.close();
    }
}
