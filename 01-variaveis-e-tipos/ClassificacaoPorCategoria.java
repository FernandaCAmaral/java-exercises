import java.util.Scanner;

public class ClassificacaoPorCategoria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o preço do produto para verificar sua categoria: ");

        boolean condicao = true;
        while (condicao) {
            double preco = leitura.nextDouble();

            if (preco < 0) {
                System.out.println("Preço inválido! Digite apenas números positivos. \nDigite novamente: ");
            } else if (preco <= 50) {
                System.out.println("Seu produto é classificado como: ECONÔMICO");
                condicao = false;
            } else if (preco > 50 && preco <= 200) {
                System.out.println("Seu produto é classificado como: INTERMEDIÁRIO");
                condicao = false;
            } else {
                System.out.println("Seu produto é classificado como: PREMIUM");
                condicao = false;
            }
        }
    }
}
