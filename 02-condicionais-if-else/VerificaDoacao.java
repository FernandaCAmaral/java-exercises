import java.util.Scanner;

public class VerificaDoacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("\n-- SISTEMA DE TRIAGEM DE DOADORES --");
        System.out.print("Digite a idade do doador: ");
        int idade = leitura.nextInt();

        System.out.print("Agora digite o peso do doador: ");
        double peso = leitura.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("✅ Atende aos requisitos para ser um doador de sangue!");
        } else {
            System.out.println("❌ Não atende aos requisitos mínimos para doação.");
            if (!idadeValida) {
                System.out.println("-> Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("-> Deve pesar mais de 50 kg.");
            }
        }
        leitura.close();
    }
}
