package questao09;

public class Livro {
    private String titulo;
    private int exemplaresDisponiveis;

    public Livro(String titulo, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public void emprestar() throws LivroIndisponivelException {
        if (exemplaresDisponiveis <= 0) {
            throw new LivroIndisponivelException("Nao ha exemplares disponiveis do livro: " + titulo);
        }
        exemplaresDisponiveis--;
        System.out.println("Emprestimo realizado: " + titulo + ". Exemplares restantes: " + exemplaresDisponiveis);
    }
}
