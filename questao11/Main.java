package questao11;

public class Main {
    public static void main(String[] args) {
        try {
            Produto[] produtos = new Produto[3];

            produtos[0] = new ProdutoFisico("Cadeira Gamer", 600.0);
            produtos[1] = new ProdutoFisico("Fone de Ouvido", 150.0);
            ProdutoDigital curso = new ProdutoDigital("Curso de Java", 100.0);
            produtos[2] = curso;

            System.out.println("--- Lista de Produtos ---");
            for (int i = 0; i < produtos.length; i++) {
                System.out.println("Produto: " + produtos[i].getNome() + " | Preco Final: R$ " + produtos[i].calcularPrecoFinal());
            }

            System.out.println();
            double precoComDesconto = curso.aplicarDesconto(20.0);
            System.out.println("Aplicando 20% de desconto no produto digital '" + curso.getNome() + "': R$ " + precoComDesconto);

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }

        System.out.println();

        // Tentativa de cadastrar produto com preco invalido
        try {
            Produto produtoInvalido = new ProdutoFisico("Celular", -500.0);
            System.out.println("Produto: " + produtoInvalido.getNome());
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }
}
