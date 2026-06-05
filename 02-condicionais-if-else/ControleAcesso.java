import java.util.Scanner;

public class ControleAcesso {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("\n--🔒 SISTEMA DE CONTROLE DE ACESSO--");

        System.out.print("Digite o código de acesso: ");
        while (!leitura.hasNextInt()) {
            System.out.println("❌ Erro: Entrada inválida! Digite apenas números.");
            System.out.print("Digite o código de acesso numérico novamente: ");
            leitura.next(); // Limpa a entrada do teclado para evitar loop infinito
        }
        int codigoDigitado = leitura.nextInt();

        System.out.print("Digite o nível de permissão: ");
            while (!leitura.hasNextInt()) {
                System.out.println("❌ Erro: Entrada inválida, digite apenas números.");
                System.out.print("Digite o nível de permissão novamente (1, 2 ou 3): ");
                leitura.next();
            }
        int nivelDigitado = leitura.nextInt();


        // Lógica de Verificacao
        boolean codigoCorreto = (codigoDigitado == 2023);
        boolean nivelValido = (nivelDigitado >= 1 && nivelDigitado <= 3);

        if (codigoCorreto && nivelValido) {
            System.out.println("\n🔓 Acesso CONCEDIDO. Bem-vindo ao sistema!");
        } else if (!codigoCorreto && !nivelValido) {
            System.out.println("\n❌ Acesso NEGADO: Código incorreto E nível de permissão inválido!");
        } else if (!codigoCorreto) {
            System.out.println("\n❌ Acesso NEGADO: Código de acesso incorreto!");
        } else {
            System.out.println("\n❌ Acesso NEGADO: Nível de permissão inválido!");
        }
        leitura.close();
    }
}
