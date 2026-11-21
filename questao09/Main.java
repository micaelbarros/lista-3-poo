package questao09;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Como Programar", 2);

        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("Tentativa de emprestimo " + i + ":");
                livro.emprestar();
            } catch (LivroIndisponivelException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
