package questao05;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Roteador roteador = new Roteador();
        Computador pc = new Computador();

        tv.ligar();
        tv.desligar();

        System.out.println();

        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        System.out.println();

        pc.ligar();
        pc.conectarInternet();
        pc.desligar();

        /*
         * Explicacao:
         * Em Java uma classe nao pode herdar de varias classes ao mesmo tempo (nao existe heranca multipla de classes),
         * mas pode implementar varias interfaces porque as interfaces apenas definem contratos (assinaturas de metodos)
         * sem estado proprio. Assim, a classe pode assumir varios comportamentos diferentes sem conflito.
         */
    }
}
