package questao10;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transferencia deve ser maior que zero.");
        }
        if (destino == null) {
            throw new IllegalArgumentException("A conta de destino nao pode ser nula.");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente na conta " + numero + " para transferir R$ " + valor);
        }

        this.saldo -= valor;
        destino.saldo += valor;
        System.out.println("Transferencia de R$ " + valor + " da conta " + this.numero + " para a conta " + destino.numero + " realizada com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}
