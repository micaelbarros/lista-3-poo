package questao04;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado no Cartao de Credito.");
    }
}
