package atividade;

public class FuncionarioHora extends Funcionarios {
    private double salarioHora;
    private int horasTrabalhadas;

    public FuncionarioHora(String nome, int id, double salarioHora, int horasTrabalhadas) {
        super(nome, id);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Getters

    public double getSalarioHora() {
        return salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    // Setters

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public double calcularSalario() {
        return salarioHora * horasTrabalhadas;
    }

    // Override para imprimir as informações de salário ao chamar o método
    @Override
    public void imprimirSalario() {
        System.out.println(String.format("(Funcionário-Hora) ID[%d] | Nome: %s | R$%.1f/h (%d horas) | Total: R$%.2f", getId(), getNome() , getSalarioHora(), getHorasTrabalhadas(), calcularSalario()));
    }
}