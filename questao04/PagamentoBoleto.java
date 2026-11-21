package questao04;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto no valor de R$ " + valor + " gerado para pagamento.");
    }
}
