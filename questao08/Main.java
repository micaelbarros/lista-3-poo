package questao08;

public class Main {
    public static void main(String[] args) {
        try {
            Produto p1 = new Produto("Teclado", 120.0, 10);
            p1.exibirDados();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        try {
            Produto p2 = new Produto("", 50.0, 5);
            p2.exibirDados();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        try {
            Produto p3 = new Produto("Mouse", -25.0, 3);
            p3.exibirDados();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        try {
            Produto p4 = new Produto("Monitor", 800.0, -2);
            p4.exibirDados();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
}
