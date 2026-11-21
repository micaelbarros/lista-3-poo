package questao11;

public class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, double precoBase) throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + 15.0;
    }
}
