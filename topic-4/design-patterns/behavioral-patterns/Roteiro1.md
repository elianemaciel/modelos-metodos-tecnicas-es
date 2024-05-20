- Crie interfaces. Iterator.java

```
public interface Iterator {
  public boolean hasNext
  public Object next
}

public interface Container {
  public Iterator getIterator
}
```

- Crie uma classe concreta implementando a interface Container . Esta classe tem a classe interna NameIterator implementando a interface Iterator.

```
public class Name Repository implements Container {
  public String nomes[] = {"Robert", "John", "Julie", "Lora"}

  Override
  public Iterator getIterator {
    return new NameIterator
  }

  private class NameIterator implements Iterator {
    int index;

    override
    public boolean hasNext
    public Object next
  }
}
```

