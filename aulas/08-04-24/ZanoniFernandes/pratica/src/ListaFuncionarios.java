import java.util.ArrayList;

public class ListaFuncionarios {

  //instancia um arraylist, que possuirá objetos da classe funcionário (na verdade, suas subclasses, por polimorfismo)
  private static ArrayList<Funcionario> list = new ArrayList<Funcionario>();

  //método que adiciona um funcionário na lista
  public void addFuncionario(Funcionario funcionario) {
    list.add(funcionario);
  };

  //método que remove um funcionário da lista
  public void deleteFuncionario(int posicao) {
    list.remove(posicao);
  };

  //método que devolve a lista em sua inteireza, para ser utilizada por outras classes (inclusive a impressora)
  public ArrayList<Funcionario> getList() {
    return list;
  }

};
