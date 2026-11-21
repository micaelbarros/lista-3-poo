package questao02;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(5.0);
        formas[1] = new Retangulo(4.0, 6.0);
        formas[2] = new Triangulo(3.0, 8.0);

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Area da forma " + (i + 1) + ": " + formas[i].calcularArea());
        }
    }
}
