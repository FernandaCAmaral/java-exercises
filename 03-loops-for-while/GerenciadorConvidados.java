import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorConvidados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> listaConvidados = new ArrayList<>();

        System.out.println("   🎂 GERENCIADOR DE CONVIDADOS 🎂   ");

        while (true) {
            System.out.println("Comandos especiais: 'ver' ou 'sair'\n");
            System.out.print("Digite o nome do convidado: ");
            String entrada = leitura.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("\nSistema encerrado!");
                break;
            }

            if (entrada.equalsIgnoreCase("ver")) {
                System.out.println("\n--- LISTA DE CONVIDADOS ATUAL ---");
                if (listaConvidados.isEmpty()) {
                    System.out.println("A lista ainda está vazia!");
                } else {

                    int numero = 1;
                    for (String convidado : listaConvidados) {
                        System.out.println(numero + "." + convidado);
                        numero++;
                    }
                }
                System.out.println("----------------------------------\n");
                continue;
            }

            if (entrada.isEmpty()) {
                System.out.println("❌ Erro: O nome do convidado não pode estar em branco!\n");
                continue;
            }

            boolean jaAdicionado = false;
            for (String convidado : listaConvidados) {
                if (convidado.equalsIgnoreCase(entrada)) {
                    jaAdicionado = true;
                    break;
                }
            }

            if (jaAdicionado) {
                System.out.println("Atenção: '" + entrada + "' já foi adicionado(a) na lista.\n");
            } else {
                listaConvidados.add(entrada);
                System.out.println("✅ '" + entrada + "' adicionado(a) com sucesso!\n");
            }
        }

        leitura.close();
    }
}
