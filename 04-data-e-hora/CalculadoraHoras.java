import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class CalculadoraHoras {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println(" --- SISTEMA DE CONTROLE DE HORAS --- ");

        System.out.print("Digite o horário de início da tarefa (ex: 08:20): ");
        String entradaInicio = leitura.nextLine();

        System.out.print("Digite o horário de término da tarefa (ex: 16:45): ");
        String entradaTermino = leitura.nextLine();

        // Converte os textos recebidos para objetos LocalTime
        LocalTime horarioInicio = LocalTime.parse(entradaInicio);
        LocalTime horarioTermino = LocalTime.parse(entradaTermino);

        Duration duracao = Duration.between(horarioInicio, horarioTermino);

        System.out.println("Tempo total gasto na tarefa: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");

        leitura.close();
    }
}
