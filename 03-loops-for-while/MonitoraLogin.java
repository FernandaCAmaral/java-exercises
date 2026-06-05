import java.util.Scanner;

public class MonitoraLogin {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        final String senhaCorreta = "abc123";
        boolean acessoLiberado = false;

        System.out.println("\n--- MONITORAMENTO DE LOGIN ---");

        for (int tentativas = 1; tentativas <= 3; tentativas++) {
            System.out.print("\nDigite sua senha: ");
            String senha = leitura.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("✅ Senha correta! Acesso liberado!");
                acessoLiberado = true;
                break;
            } else if (tentativas < 3) {
                System.out.println("❌ Senha incorreta. Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (!acessoLiberado) {
            System.out.println("Suas tentativas acabaram. Conta bloqueada temporariamente.");
        }
        leitura.close();
    }
}
