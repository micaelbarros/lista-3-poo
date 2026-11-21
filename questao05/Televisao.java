package questao05;

public class Televisao implements Ligavel {

    @Override
    public void ligar() {
        System.out.println("Televisao ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Televisao desligada.");
    }
}
