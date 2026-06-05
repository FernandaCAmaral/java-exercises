import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        String senhaPredefinida = "abc123";
        Scanner leitura = new Scanner(System.in);

        System.out.println("- Por favor, digite a senha para acessar o sistema: ");
        String senhaDigitada = leitura.nextLine();

        if (senhaDigitada.equals(senhaPredefinida)) {
            System.out.println("✅ Acesso permitido!");
        } else {
            System.out.println("❌ Seu acesso foi negado.");
        }
    }
}
