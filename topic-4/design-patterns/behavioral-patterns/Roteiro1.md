## Roteiro - Prática Iterator

![image](https://github.com/elianemaciel/modelos-metodos-tecnicas-es/assets/7025421/a9f6ec1a-8d3c-49fd-a1ef-ec975f7b237d)

- Crie interfaces. Iterator.java

```
public interface Iterator {
  public boolean hasNext()
  public Object next()
}

public interface Container {
  public Iterator getIterator
}
```

- Crie uma classe concreta implementando a interface Container . Esta classe tem a classe interna NameIterator implementando a interface Iterator.

```
public class NameRepository implements Container {
  public String nomes[] = {"Robert", "John", "Julie", "Lora"}

  @Override
  public Iterator getIterator {
    return new NameIterator
  }

  private class NameIterator implements Iterator {
    int index;

    @Override
    public boolean hasNext() {
      if (index < names.length){
          return true;
      }
      return false;
    }

    @Override
    public Object next() {
       if(this.hasNext()) {
          return names[index++];
       }
       return null;
    }
  }
}
```

- Use o NameRepository para obter o iterador e os nomes de impressão.

  ```
  public class IteratorPatternDemo {
      public staticvoid main(String[] args) {
          NameRepository namesRepository = new NameRepository();
          for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
              String name = (String)iter.next();
              System.out.println("Name : " + name);
          }
      }
  }
  ```

