package controle_temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("\n--- SISTEMA MONITORAMENTO ESTUFA ---");

        Sensor sensorTemperatura = new Sensor();

        System.out.print("Digite o local do sensor (ex: Setor A): ");
        String local = leitura.nextLine();
        sensorTemperatura.setLocal(local);

        System.out.print("Digite a temperatura atual do setor (ex: 30,2): ");
        double temperatura = leitura.nextDouble();
        sensorTemperatura.setTemperaturaAtual(temperatura);

        sensorTemperatura.verificarCondicoes();

        leitura.close();
    }
}
