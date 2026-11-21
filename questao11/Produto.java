package questao11;

public abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) throws PrecoInvalidoException {
        if (precoBase <= 0) {
            throw new PrecoInvalidoException("O preco do produto '" + nome + "' deve ser maior que zero.");
        }
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();

    public String getNome() {
        return nome;
    }
}
