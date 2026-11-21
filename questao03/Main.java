package questao03;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Joao", 500.0);
        ContaPoupanca cp = new ContaPoupanca("Ana", 500.0);

        System.out.println("--- Conta Corrente (" + cc.titular + ") ---");
        cc.depositar(100.0);
        cc.sacar(200.0);

        System.out.println();

        System.out.println("--- Conta Poupanca (" + cp.titular + ") ---");
        cp.depositar(150.0);
        cp.sacar(200.0);
    }
}
