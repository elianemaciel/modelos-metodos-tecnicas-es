package atividade;

public class FuncionarioAssalariado extends Funcionarios {
    private double salarioMes;

    public FuncionarioAssalariado(String nome, int id, double salarioMes) {
        super(nome, id);
        this.salarioMes = salarioMes;
    }

    // Getter e Setter

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    // Método para retornar o salário
    @Override
    public double calcularSalario() {
        return salarioMes;
    }

    // Override para imprimir as informações de salário ao chamar o método
    @Override
    public void imprimirSalario() {
        System.out.println(String.format("(Funcionário-Assalariado) ID [%d] | Nome: %s | Total: R$%.2f", getId(), getNome(), calcularSalario()));
    }
}