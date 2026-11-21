package questao11;

public class ProdutoDigital extends Produto implements Descontavel {

    public ProdutoDigital(String nome, double precoBase) throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        double desconto = precoBase * (percentual / 100.0);
        return precoBase - desconto;
    }
}
