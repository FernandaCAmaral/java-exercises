import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args) {

        System.out.println("\n --- VERIFICADOR DE FUSOS HORÁRIOS --- ");

        ZoneId fusoToquio = ZoneId.of("Asia/Tokyo");
        ZoneId fusoLocal = ZoneId.systemDefault(); // Pega o fuso do computador automaticamente

        ZonedDateTime horaToquio = ZonedDateTime.now(fusoToquio);
        ZonedDateTime horaLocal = ZonedDateTime.now(fusoLocal);

        DateTimeFormatter formatadorDataEHora = DateTimeFormatter.ofPattern("HH:mm:ss 'do dia' dd/MM/yyyy");

        System.out.println("Horário atual aqui: " + horaLocal.format(formatadorDataEHora));
        System.out.println("Horário em Tóquio: " + horaToquio.format(formatadorDataEHora));
        System.out.println("-------------------------------");
    }
}
