package questao06;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol");
        CarroEletrico carroEletrico = new CarroEletrico("BYD Dolphin");

        carro.acelerar();
        carro.acelerar();

        System.out.println();

        carroEletrico.carregarBateria();
        carroEletrico.acelerar();
        carroEletrico.acelerar();
    }
}
