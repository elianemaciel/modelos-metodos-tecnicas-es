public class Gerente extends Funcionario {

  // inicializa variável com valor fixo da hora de trabalho do gerente
  private final float horaGerente = 25;

  // construtor da classe, com método para fixar o valor da hora do desenvolvedor
  // no método da superclasse
  public Gerente(String nome) {
    super(nome);
    this.setValorHora(horaGerente);
  };

  // método genérico específico da subclasse
  public void manageTeam() {

  };

};
