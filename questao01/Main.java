package questao01;

public class Main {
    public static void main(String[] args) {
        FuncionarioCLT f1 = new FuncionarioCLT("Carlos", 3000.0);
        FuncionarioPJ f2 = new FuncionarioPJ("Mariana", 4000.0);

        System.out.println("Funcionario CLT: " + f1.nome);
        System.out.println("Salario final: R$ " + f1.calcularSalario());

        System.out.println();

        System.out.println("Funcionario PJ: " + f2.nome);
        System.out.println("Salario final: R$ " + f2.calcularSalario());
    }
}
