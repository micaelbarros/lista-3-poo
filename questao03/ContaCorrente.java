package questao03;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + 2.00;
        if (saldo >= valorTotal) {
            saldo -= valorTotal;
            System.out.println("Saque de R$ " + valor + " (taxa R$ 2.0) realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente na conta corrente.");
        }
    }
}
