import java.util.Scanner;

public class CalculadoraViagem {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("-- BEM VINDO AO PLANEJADOR DE VIAGEM! --");

        System.out.println("Digite o consumo médio de seu veículo(km/L): ");
        double consumoMedio = leitura.nextDouble();

        System.out.println("Ótimo, agora a capacidade total de seu tanque de combustível (L): ");
        double capacidadeTanque = leitura.nextDouble();

        System.out.println("E quanto tem de combustível atualmente em seu tanque(L):");
        double combustivelAtual = leitura.nextDouble();

        // Validação de QA: O combustível atual não pode ser maior que o tanque
        while (combustivelAtual > capacidadeTanque || combustivelAtual < 0) {
            System.out.println("❌ Erro: O combustível atual não pode ser negativo ou maior que a capacidade do tanque!");
            System.out.print("Digite novamente o combustível atual (L): ");
            combustivelAtual = leitura.nextDouble();
        }

        System.out.println("Para finalizar, a distância da viagem planejada(km):");
        double distanciaViagem = leitura.nextDouble();

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("\n=================================");
        System.out.printf("Autonomia máxima (Tanque Cheio): %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("\n✅ Você conseguirá completar o trajeto sem precisar abastecer!");
            System.out.println("=================================");
        } else {
            System.out.println("\nAtenção! Você precisará abastecer antes de concluir a viagem.");

            double distanciaRestante = distanciaViagem - autonomiaAtual;
            double litrosNecessarios = distanciaRestante / consumoMedio;

            System.out.printf("⚠️ Faltarão %.1f km para chegar ao destino.\n", distanciaRestante);
            System.out.printf("Você precisará de pelo menos mais %.2f Litros de combustível.\n", litrosNecessarios);
            System.out.println("Planeje paradas durante o percurso!");
            System.out.println("=================================");
        }
        leitura.close();
    }
}
