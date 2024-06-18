//classe abstrata, servindo apenas de parâmetro para as suas subclasses
public abstract class Funcionario {

  // atributos da superclasse
  private String nome;
  private float valorHora;
  private float horasTrabalhadas;

  // construtor genérico da classe abstrata
  public Funcionario(String nome) {
    this.nome = nome;
  };

  // métodos de set para os atributos
  public void setNome(String nome) {
    this.nome = nome;
  };

  public void setValorHora(float valorHora) {
    this.valorHora = valorHora;
  }

  public void setHorasTrabalhas(float horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  };

  // métodos de get para os atributos
  public String getNome() {
    return this.nome;
  };

  public float getValorHora() {
    return this.valorHora;
  }

  public float getHorasTrabalhadas() {
    return this.horasTrabalhadas;
  };

  // método de get para o salário, instanciando um objeto da classe específica
  public float getSalario() {
    CalcSalario salario = new CalcSalario();
    return salario.CalculateSalario(this.horasTrabalhadas, this.valorHora);
  };

};
