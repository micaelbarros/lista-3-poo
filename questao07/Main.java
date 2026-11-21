package questao07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo numero inteiro: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado da divisao: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Nao e possivel dividir por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida. Digite apenas numeros inteiros.");
        } finally {
            System.out.println("Operacao encerrada.");
            scanner.close();
        }
    }
}
