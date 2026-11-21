package questao03;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
    }

    public abstract void sacar(double valor);
}
