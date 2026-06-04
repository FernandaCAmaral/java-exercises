import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("-- BEM VINDO AO IDENTIFICADOR PAR OU ÍMPAR! --");
        System.out.println("Digite um número positivo:");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR!");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR!");
        }
    }
}
