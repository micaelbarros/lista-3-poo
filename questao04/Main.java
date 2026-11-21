package questao04;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoPix();
        pagamentos[1] = new PagamentoCartao();
        pagamentos[2] = new PagamentoBoleto();

        double[] valores = {150.0, 320.50, 89.90};

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(valores[i]);
        }
    }
}
