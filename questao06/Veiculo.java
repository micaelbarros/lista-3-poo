package questao06;

public abstract class Veiculo {
    protected String modelo;
    protected double velocidadeAtual;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public abstract void acelerar();
}
