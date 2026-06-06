import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("\n --- SISTEMA PONTO ELETRÔNICO --- ");

        System.out.print("Digite o horário de entrada (ex: 09:00): ");
        String entrada = leitura.nextLine();
        LocalTime horarioEntrada = LocalTime.parse(entrada, formatador);

        System.out.print("Digite a carga horária prevista em horas (ex: 8): ");
        int cargaHoraria = leitura.nextInt();
        leitura.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite o horário real de saída (ex: 18:15): ");
        String saidaReal = leitura.nextLine();
        LocalTime horarioSaidaReal = LocalTime.parse(saidaReal, formatador);

        // Calcula o horário de saída previsto
        LocalTime saidaPrevista = horarioEntrada.plusHours(cargaHoraria);

        // Tempo REALMENTE trabalhado
        Duration tempoTrabalhado = Duration.between(horarioEntrada, horarioSaidaReal);

        // Pega o número inteiro e transforma em um objeto do tipo Duration para calculos
        Duration cargaHorariaHoras = Duration.ofHours(cargaHoraria);

        Duration horasExtras = tempoTrabalhado.minus(cargaHorariaHoras);

        System.out.println("\n--- RESUMO DO EXPEDIENTE ---");
        System.out.println("Horário de Entrada: " + horarioEntrada.format(formatador));
        System.out.println("Saída Prevista: " + saidaPrevista.format(formatador));
        System.out.println("Horário de Saída Real: " + horarioSaidaReal.format(formatador));
        System.out.println("Tempo Total Trabalhado: " + tempoTrabalhado.toHours() + "h e " + tempoTrabalhado.toMinutesPart() + "m");

        if (horasExtras.isZero()) {
            System.out.println("Horas Extras do dia: Expediente cumprido exatamento no prazo.");
        } else if (horasExtras.isPositive()) {
            System.out.println("Horas Extras do dia: +" + horasExtras.toHours() + "h e " + horasExtras.toMinutesPart() + "m");
        } else {
            System.out.println("Horas em Débito do dia: " + horasExtras.toHours() + "h e " + horasExtras.toMinutesPart() + "m");
        }

        leitura.close();
    }
}
