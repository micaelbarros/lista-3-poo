package questao01;

public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - (salarioBase * 0.05);
    }
}
