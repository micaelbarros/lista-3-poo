package questao06;

public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println(modelo + " acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
