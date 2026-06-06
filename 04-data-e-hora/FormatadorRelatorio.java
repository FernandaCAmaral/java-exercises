import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorRelatorio {
    public static void main(String[] args) {
        System.out.println("\n --- SISTEMA DE RELATÓRIOS DIÁRIOS --- ");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Formato original do Java: " + agora);

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = agora.format(formatadorData);
        String horaFormatada = agora.format(formatadorHora);

        System.out.println("\n--- DADOS DO RELATÓRIO ---");
        System.out.println("Data de geração: " + dataFormatada);
        System.out.println("Hora de geração: " + horaFormatada);
        System.out.println("---------------------------");
    }
}
