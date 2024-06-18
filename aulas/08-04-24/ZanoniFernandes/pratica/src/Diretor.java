public class Diretor extends Funcionario {

  // inicializa variável com valor fixo da hora de trabalho do diretor
  private final float horaDiretor = 45;

  // construtor da classe, com método para fixar o valor da hora do desenvolvedor
  // no método da superclasse
  public Diretor(String nome) {
    super(nome);
    this.setValorHora(horaDiretor);
  }

  // método genérico específico da subclasse
  public void directCompany() {

  };

};
