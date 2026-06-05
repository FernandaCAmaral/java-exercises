import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numPositivos = 0;
        int numNegativos = 0;

        System.out.println(" --- CONTADOR DE NÚMEROS --- ");
        System.out.println("Instruções: Digite os números desejados.");
        System.out.println("Digite a palavra 'fim' para encerrar e ver os resultados.\n");

        while (true) {
            System.out.println("Digite um número (ou 'fim'): ");
            String entrada = leitura.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (numero < 0) {
                numNegativos++;
            } else if (numero > 0) {
                numPositivos++;
            }
        }

        System.out.println("Números negativos: " + numNegativos);
        System.out.println("Números positivos: " + numPositivos);

        leitura.close();
    }
}
