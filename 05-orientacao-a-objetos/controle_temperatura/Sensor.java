package controle_temperatura;

public class Sensor {
    private String local;
    private double temperaturaAtual;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void verificarCondicoes() {
        System.out.println("-----------------------------------");
        System.out.println("Sensor no local: " + this.local);
        System.out.printf("Temperatura: %.1f ºC %n", this.temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("ALERTA: Temperatura acima do limite!");
        } else {
            System.out.println("Temperatura dentro do ideal!");
        }

    }
}
