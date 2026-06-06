import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadoraPrazo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("\n --- CALCULADORA DE PRAZO DE PROJETOS --- ");

        System.out.print("Digite a data de início do projeto (ex: 06/06/2026): ");
        String entradaData = leitura.nextLine();

        System.out.print("Digite o prazo estimado em dias (ex: 10): ");
        int prazoDias = leitura.nextInt();

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataInicio = LocalDate.parse(entradaData, formatadorData);
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        System.out.println("-----------------------------------------");
        System.out.println("Data para entrega: " + dataEntrega.format(formatadorData));

        leitura.close();
    }
}
