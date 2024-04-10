public class App {
  public static void main(String[] args) throws Exception {

    // Instancia um objeto impressora e uma lista de funcionarios
    Impressora impressora = new Impressora();
    ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

    // Instacia um objeto de cada subclasse de funcionario, define a qtd de horas
    // trabalhadas e adiciona-os na lista de funcionarios
    Desenvolvedor myDesenvolvedor = new Desenvolvedor("Clara");
    myDesenvolvedor.setHorasTrabalhas(150);
    listaFuncionarios.addFuncionario(myDesenvolvedor);

    Gerente myGerente = new Gerente("José");
    myGerente.setHorasTrabalhas(100);
    listaFuncionarios.addFuncionario(myGerente);

    Diretor myDiretor = new Diretor("Ana");
    myDiretor.setHorasTrabalhas(120);
    listaFuncionarios.addFuncionario(myDiretor);

    // Dá saída na lista de funcionários
    impressora.printList(listaFuncionarios.getList());

  }
}
