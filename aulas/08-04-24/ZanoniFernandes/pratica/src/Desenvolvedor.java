public class Desenvolvedor extends Funcionario {

  // inicializa variável com valor fixo da hora de trabalho do desenvolvedor
  private final float horaDesenvolvedor = 15;

  // construtor da classe, com método para fixar o valor da hora do desenvolvedor
  // no método da superclasse
  public Desenvolvedor(String nome) {
    super(nome);
    this.setValorHora(horaDesenvolvedor);
  }

  // método genérico específico da subclasse
  public void codeSystem() {

  };

}
