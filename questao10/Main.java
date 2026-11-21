package questao10;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("101-0", 500.0);
        Conta c2 = new Conta("202-0", 200.0);

        // Transferencia valida
        try {
            c1.transferir(c2, 150.0);
            System.out.println("Saldo conta " + c1.getNumero() + ": R$ " + c1.getSaldo());
            System.out.println("Saldo conta " + c2.getNumero() + ": R$ " + c2.getSaldo());
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();

        // Transferencia com saldo insuficiente
        try {
            c1.transferir(c2, 1000.0);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Transferencia com valor invalido
        try {
            c1.transferir(c2, -50.0);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Transferencia para conta null
        try {
            c1.transferir(null, 50.0);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
