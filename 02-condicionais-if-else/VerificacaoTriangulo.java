import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("-- VERIFICADOR DE TRIÂNGULO --\n");

        System.out.print("Digite o primeiro lado: ");
        double lado1 = leitura.nextDouble();

        System.out.print("Digite o primeiro lado: ");
        double lado2 = leitura.nextDouble();

        System.out.print("Digite o primeiro lado: ");
        double lado3 = leitura.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("❌ Erro: Os lados do triângulo devem ser maiores que zero.");
        } else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo!");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }

        leitura.close();
    }
}
