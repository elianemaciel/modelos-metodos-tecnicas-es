import java.util.ArrayList;

public class Impressora {

  // método para imprimir a lista de funcionários
  public void printList(ArrayList<Funcionario> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).getNome() + "\n" + list.get(i).getSalario() + "\n");
    }
    ;
    System.out.println("Fim da lista!");
  };

};
